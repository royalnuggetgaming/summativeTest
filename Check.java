import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.function.Supplier;

/**
 * Small test helper shared by every problem file.
 * You do not need to read or change this file.
 */
public class Check {
    // Check always prints through this stream, even while a test captures System.out.
    private static final PrintStream console = System.out;

    private static int passed = 0;
    private static int failed = 0;
    private static int stuckCount = 0;

    public static void header(String title) {
        passed = 0;
        failed = 0;
        stuckCount = 0;
        console.println();
        console.println("=== " + title + " ===");
    }

    /** For methods that RETURN a value. */
    public static void eq(String label, Object expected, Supplier<Object> actual) {
        if (stuckCount >= 3) {
            fail(label, "skipped, because earlier tests got stuck in an infinite loop. Fix that first.");
            return;
        }
        Object[] result = new Object[1];
        Throwable[] error = new Throwable[1];
        Thread worker = new Thread(() -> {
            try {
                result[0] = actual.get();
            } catch (Throwable t) {
                error[0] = t;
            }
        });
        worker.setDaemon(true);
        worker.start();
        waitFor(worker);

        if (worker.isAlive()) {
            stuckCount++;
            fail(label, "ran for more than 1 second. Is there an infinite loop?");
        } else if (error[0] != null) {
            fail(label, "crashed with " + error[0]);
        } else if (expected.equals(result[0])) {
            pass(label);
        } else {
            fail(label, "expected " + expected + " but got " + result[0]);
        }
    }

    /** For methods that PRINT. Passes if the output matches any one of the accepted layouts. */
    public static void printed(String label, Runnable code, String... acceptedLayouts) {
        if (stuckCount >= 3) {
            fail(label, "skipped, because earlier tests got stuck in an infinite loop. Fix that first.");
            return;
        }
        PrintStream before = System.out;
        CappedBuffer buffer = new CappedBuffer();
        Throwable[] error = new Throwable[1];
        Thread worker = new Thread(() -> {
            try {
                code.run();
            } catch (Throwable t) {
                error[0] = t;
            }
        });
        worker.setDaemon(true);

        System.setOut(new PrintStream(buffer, true));
        worker.start();
        waitFor(worker);
        boolean stuck = worker.isAlive();
        if (stuck) {
            stuckCount++;
        }
        // If the code is stuck in a loop, keep swallowing whatever it prints from now on.
        System.setOut(stuck ? new PrintStream(OutputStream.nullOutputStream()) : before);

        String got = tidy(buffer.toString());
        if (stuck) {
            fail(label, "ran for more than 1 second. Is there an infinite loop?");
        } else if (error[0] != null) {
            fail(label, "crashed with " + error[0]);
        } else {
            for (String layout : acceptedLayouts) {
                if (got.equals(tidy(layout))) {
                    pass(label);
                    return;
                }
            }
            fail(label, "the printed picture did not match.\n"
                    + block("expected (a version with no space after each cell also passes):", tidy(acceptedLayouts[0]))
                    + block("you printed:", got));
        }
    }

    public static void summary() {
        int total = passed + failed;
        console.println();
        if (failed == 0) {
            console.println("  All " + total + " tests passed. Nice work!");
        } else {
            console.println("  " + passed + " of " + total
                    + " tests passed. Read the FAIL lines above, fix one, and run again.");
        }
        console.flush();
        System.exit(failed == 0 ? 0 : 1);
    }

    // ---------------------------------------------------------------- internals

    private static void pass(String label) {
        passed++;
        console.println("  PASS  " + label);
    }

    private static void fail(String label, String why) {
        failed++;
        console.println("  FAIL  " + label);
        console.println("        " + why.stripTrailing());
    }

    private static void waitFor(Thread worker) {
        try {
            worker.join(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /** Ignores trailing spaces on each line and blank lines at the end. */
    private static String tidy(String text) {
        StringBuilder sb = new StringBuilder();
        for (String line : text.replace("\r", "").split("\n", -1)) {
            sb.append(line.replaceAll("\\s+$", "")).append("\n");
        }
        return sb.toString().replaceAll("\n+$", "");
    }

    private static String block(String title, String text) {
        StringBuilder sb = new StringBuilder("        " + title + "\n");
        for (String line : text.split("\n", -1)) {
            sb.append("          |").append(line).append("\n");
        }
        return sb.toString();
    }

    /** Stops storing after a while so a runaway loop cannot use up all the memory. */
    private static class CappedBuffer extends ByteArrayOutputStream {
        @Override
        public synchronized void write(int b) {
            if (count < 100_000) {
                super.write(b);
            }
        }

        @Override
        public synchronized void write(byte[] b, int off, int len) {
            if (count < 100_000) {
                super.write(b, off, len);
            }
        }
    }
}

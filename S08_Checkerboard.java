// SOLUTION to P08: Checkerboard
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - Moving one cell right or down changes i + j by 1, which flips between even and odd.
//   - Even sums print *, odd sums print -.
public class S08_Checkerboard {

    public static void checkerboard(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P08 Checkerboard");
        Check.printed("checkerboard(1)",
                () -> checkerboard(1),
                "*",
                "*");
        Check.printed("checkerboard(2)",
                () -> checkerboard(2),
                "* -\n- *",
                "*-\n-*");
        Check.printed("checkerboard(4)",
                () -> checkerboard(4),
                "* - * -\n- * - *\n* - * -\n- * - *",
                "*-*-\n-*-*\n*-*-\n-*-*");
        Check.printed("checkerboard(5)",
                () -> checkerboard(5),
                "* - * - *\n- * - * -\n* - * - *\n- * - * -\n* - * - *",
                "*-*-*\n-*-*-\n*-*-*\n-*-*-\n*-*-*");
        Check.summary();
    }
}

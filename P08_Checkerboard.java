// P08: Checkerboard
// Level: Core    Source: Extra practice
//
// Print a size by size grid that alternates * and -. The top-left cell is *.
// Each row starts with the opposite of the row above it.
//
// Examples:
//   checkerboard(4) prints:
//   *-*-
//   -*-*
//   *-*-
//   -*-*
//
// Rules:
//   - Print '*' and '-' with nothing between them, or with a space after each. Both pass.
//
// Hints (try without them first):
//   1. Compare the row and column numbers of neighboring cells. What happens to i + j as you move right or down?
//   2. When (i + j) % 2 == 0, print a star. Otherwise print a dash.
//
// Run it:  bash run.sh 8
public class P08_Checkerboard {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static void checkerboard(int size) {
        // write your code here
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P08 Checkerboard");
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

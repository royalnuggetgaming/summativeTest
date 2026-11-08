// SOLUTION to P09: Hollow Triangle
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - Same shape as P05, but each cell is a star only if it is the first cell of the row, the last cell of the row, or anywhere in the bottom row.
//   - Every other cell prints a space.
public class S09_HollowTriangle {

    public static void hollowTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P09 Hollow Triangle");
        Check.printed("hollowTriangle(1)",
                () -> hollowTriangle(1),
                "*",
                "*");
        Check.printed("hollowTriangle(2)",
                () -> hollowTriangle(2),
                "*\n* *",
                "*\n**");
        Check.printed("hollowTriangle(4)",
                () -> hollowTriangle(4),
                "*\n* *\n*   *\n* * * *",
                "*\n**\n* *\n****");
        Check.printed("hollowTriangle(5)",
                () -> hollowTriangle(5),
                "*\n* *\n*   *\n*     *\n* * * * *",
                "*\n**\n* *\n*  *\n*****");
        Check.printed("hollowTriangle(7)",
                () -> hollowTriangle(7),
                "*\n* *\n*   *\n*     *\n*       *\n*         *\n* * * * * * *",
                "*\n**\n* *\n*  *\n*   *\n*    *\n*******");
        Check.summary();
    }
}

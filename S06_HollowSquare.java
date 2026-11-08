// SOLUTION to P06: Hollow Square
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - The outer loop is the row, the inner loop is the column.
//   - A cell is a star only if it is on the first or last row, or the first or last column.
public class S06_HollowSquare {

    public static void hollowSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P06 Hollow Square");
        Check.printed("hollowSquare(1)",
                () -> hollowSquare(1),
                "*",
                "*");
        Check.printed("hollowSquare(2)",
                () -> hollowSquare(2),
                "* *\n* *",
                "**\n**");
        Check.printed("hollowSquare(3)",
                () -> hollowSquare(3),
                "* * *\n*   *\n* * *",
                "***\n* *\n***");
        Check.printed("hollowSquare(5)",
                () -> hollowSquare(5),
                "* * * * *\n*       *\n*       *\n*       *\n* * * * *",
                "*****\n*   *\n*   *\n*   *\n*****");
        Check.printed("hollowSquare(6)",
                () -> hollowSquare(6),
                "* * * * * *\n*         *\n*         *\n*         *\n*         *\n* * * * * *",
                "******\n*    *\n*    *\n*    *\n*    *\n******");
        Check.summary();
    }
}

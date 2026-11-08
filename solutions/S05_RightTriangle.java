// SOLUTION to P05: Right Triangle
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - The outer loop counts rows. The inner loop prints i stars for row i.
//   - println() after the inner loop moves to the next row.
public class S05_RightTriangle {

    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P05 Right Triangle");
        Check.printed("rightTriangle(1)",
                () -> rightTriangle(1),
                "*",
                "*");
        Check.printed("rightTriangle(2)",
                () -> rightTriangle(2),
                "*\n* *",
                "*\n**");
        Check.printed("rightTriangle(4)",
                () -> rightTriangle(4),
                "*\n* *\n* * *\n* * * *",
                "*\n**\n***\n****");
        Check.printed("rightTriangle(6)",
                () -> rightTriangle(6),
                "*\n* *\n* * *\n* * * *\n* * * * *\n* * * * * *",
                "*\n**\n***\n****\n*****\n******");
        Check.summary();
    }
}

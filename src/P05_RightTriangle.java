// P05: Right Triangle
// Level: Warm-up    Source: Extra practice
//
// Print a right triangle of stars with n rows.
// Row 1 has one star, row 2 has two stars, and so on.
//
// Examples:
//   rightTriangle(4) prints:
//   *
//   **
//   ***
//   ****
//
// Rules:
//   - Use System.out.print for each star and System.out.println() to end each row.
//   - Printing a space after each star is fine too.
//
// Hints (try without them first):
//   1. The outer loop is the row number. The inner loop prints that many stars.
//   2. Do not forget System.out.println() after the inner loop.
//
// Run it:  bash run.sh 5
public class P05_RightTriangle {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static void rightTriangle(int n) {
        // write your code here
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P05 Right Triangle");
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

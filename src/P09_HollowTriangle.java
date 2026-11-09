// P09: Hollow Triangle
// Level: Challenge    Source: Extra practice
//
// Print a right triangle with n rows where only the border is stars:
// the first star of each row, the last star of each row, and the whole bottom row.
//
// Examples:
//   hollowTriangle(5) prints:
//   *
//   **
//   * *
//   *  *
//   *****
//
// Rules:
//   - Empty cells print a space. A space after every cell is also accepted.
//
// Hints (try without them first):
//   1. Start from P05. Row i has i cells.
//   2. Cell j in row i is a star if j is 1, or j equals i, or i is the last row (i == n).
//
// Run it:  bash run.sh 9
public class P09_HollowTriangle {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static void hollowTriangle(int n) {
        // write your code here
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P09 Hollow Triangle");
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

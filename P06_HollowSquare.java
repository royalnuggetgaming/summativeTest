// P06: Hollow Square
// Level: Core    Source: Your handout
//
// Print a square made of stars. Each side has size stars.
// Only the border is stars. The inside is empty.
//
// Examples:
//   hollowSquare(5) prints:
//   * * * * *
//   *       *
//   *       *
//   *       *
//   * * * * *
//
// Rules:
//   - Print a star and a space ('* ') for border cells and two spaces for empty cells, like your handout.
//   - Printing '*' and ' ' with no extra space also passes.
//
// Hints (try without them first):
//   1. Use nested loops: i for the row and j for the column, both from 0 to size - 1.
//   2. A cell is on the border when i or j is the first or the last index.
//
// Run it:  bash run.sh 6
public class P06_HollowSquare {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static void hollowSquare(int size) {
        // write your code here
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P06 Hollow Square");
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

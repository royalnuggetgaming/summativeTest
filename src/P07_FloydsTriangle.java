// P07: Floyd's Triangle
// Level: Core    Source: Your handout
//
// Print Floyd's triangle: row 1 has one number, row 2 has two numbers, and so on.
// The numbers count up 1, 2, 3, ... across the whole triangle.
//
// Examples:
//   floydsTriangle(5) prints:
//   1
//   2 3
//   4 5 6
//   7 8 9 10
//   11 12 13 14 15
//
// Rules:
//   - Print a space after each number.
//   - Printing the numbers with no spaces (like your handout's example) also passes.
//
// Hints (try without them first):
//   1. The counter has to keep its value across rows, so declare it before both loops.
//   2. Row i prints i numbers.
//
// Run it:  bash run.sh 7
public class P07_FloydsTriangle {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static void floydsTriangle(int rows) {
        // write your code here
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P07 Floyd's Triangle");
        Check.printed("floydsTriangle(1)",
                () -> floydsTriangle(1),
                "1",
                "1");
        Check.printed("floydsTriangle(2)",
                () -> floydsTriangle(2),
                "1\n2 3",
                "1\n23");
        Check.printed("floydsTriangle(3)",
                () -> floydsTriangle(3),
                "1\n2 3\n4 5 6",
                "1\n23\n456");
        Check.printed("floydsTriangle(5)",
                () -> floydsTriangle(5),
                "1\n2 3\n4 5 6\n7 8 9 10\n11 12 13 14 15",
                "1\n23\n456\n78910\n1112131415");
        Check.printed("floydsTriangle(6)",
                () -> floydsTriangle(6),
                "1\n2 3\n4 5 6\n7 8 9 10\n11 12 13 14 15\n16 17 18 19 20 21",
                "1\n23\n456\n78910\n1112131415\n161718192021");
        Check.summary();
    }
}

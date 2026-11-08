// P02: Count a Digit
// Level: Warm-up    Source: Extra practice
//
// Return how many times the digit d (0 to 9) appears in n.
// Treat a negative number as if it were positive.
//
// Examples:
//   countDigit(1223334444, 3) returns 3
//   countDigit(100, 0) returns 2
//   countDigit(0, 0) returns 1   (the number 0 is written with one digit)
//
// Rules:
//   - Use % and / on the number. No Strings and no arrays.
//
// Hints (try without them first):
//   1. Same digit-peeling loop as P01. Instead of adding the digit to a sum, compare it to d.
//   2. The number 0 is the tricky case: a plain while (n > 0) loop never runs for it. A do-while loop fixes that.
//
// Run it:  bash run.sh 2
public class P02_CountDigit {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static int countDigit(int n, int d) {
        return 0;
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P02 Count a Digit");
        Check.eq("countDigit(1223334444, 4) should be 4", 4, () -> countDigit(1223334444, 4));
        Check.eq("countDigit(1223334444, 3) should be 3", 3, () -> countDigit(1223334444, 3));
        Check.eq("countDigit(1223334444, 2) should be 2", 2, () -> countDigit(1223334444, 2));
        Check.eq("countDigit(1223334444, 1) should be 1", 1, () -> countDigit(1223334444, 1));
        Check.eq("countDigit(1223334444, 0) should be 0", 0, () -> countDigit(1223334444, 0));
        Check.eq("countDigit(0, 0) should be 1", 1, () -> countDigit(0, 0));
        Check.eq("countDigit(0, 5) should be 0", 0, () -> countDigit(0, 5));
        Check.eq("countDigit(100, 0) should be 2", 2, () -> countDigit(100, 0));
        Check.eq("countDigit(-1010, 1) should be 2", 2, () -> countDigit(-1010, 1));
        Check.eq("countDigit(555, 5) should be 3", 3, () -> countDigit(555, 5));
        Check.eq("countDigit(123, 4) should be 0", 0, () -> countDigit(123, 4));
        Check.eq("countDigit(7, 7) should be 1", 1, () -> countDigit(7, 7));
        Check.eq("countDigit(1000000000, 0) should be 9", 9, () -> countDigit(1000000000, 0));
        Check.summary();
    }
}

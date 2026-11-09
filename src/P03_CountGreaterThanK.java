// P03: Count Digits Greater Than K
// Level: Warm-up    Source: Your handout
//
// Given an integer n and a single-digit integer k, return the number of digits in n
// that are strictly greater than k. Treat a negative n as if it were positive.
//
// Examples:
//   countGreaterThanK(38529, 4) returns 3   (the digits 8, 5, and 9 are greater than 4)
//   countGreaterThanK(111, 1) returns 0
//
// Rules:
//   - Use % and / on the number. No Strings and no arrays.
//
// Hints (try without them first):
//   1. Peel off each digit with n % 10, like P01 and P02.
//   2. Add 1 to a counter whenever the digit is greater than k.
//
// Run it:  bash run.sh 3
public class P03_CountGreaterThanK {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static int countGreaterThanK(int n, int k) {
        return 0;
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P03 Count Digits Greater Than K");
        Check.eq("countGreaterThanK(38529, 4) should be 3", 3, () -> countGreaterThanK(38529, 4));
        Check.eq("countGreaterThanK(0, 0) should be 0", 0, () -> countGreaterThanK(0, 0));
        Check.eq("countGreaterThanK(5, 4) should be 1", 1, () -> countGreaterThanK(5, 4));
        Check.eq("countGreaterThanK(5, 5) should be 0", 0, () -> countGreaterThanK(5, 5));
        Check.eq("countGreaterThanK(111, 1) should be 0", 0, () -> countGreaterThanK(111, 1));
        Check.eq("countGreaterThanK(999, 8) should be 3", 3, () -> countGreaterThanK(999, 8));
        Check.eq("countGreaterThanK(12345, 0) should be 5", 5, () -> countGreaterThanK(12345, 0));
        Check.eq("countGreaterThanK(10203, 0) should be 3", 3, () -> countGreaterThanK(10203, 0));
        Check.eq("countGreaterThanK(-4729, 5) should be 2", 2, () -> countGreaterThanK(-4729, 5));
        Check.eq("countGreaterThanK(2000000000, 1) should be 1", 1, () -> countGreaterThanK(2000000000, 1));
        Check.eq("countGreaterThanK(987654321, 9) should be 0", 0, () -> countGreaterThanK(987654321, 9));
        Check.eq("countGreaterThanK(987654321, 0) should be 9", 9, () -> countGreaterThanK(987654321, 0));
        Check.summary();
    }
}

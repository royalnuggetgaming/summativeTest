// P01: Sum of Digits
// Level: Warm-up    Source: Extra practice
//
// Return the sum of the digits of n.
// Treat a negative number as if it were positive.
//
// Examples:
//   sumDigits(123) returns 6
//   sumDigits(-405) returns 9
//   sumDigits(0) returns 0
//
// Rules:
//   - Use % and / on the number. No Strings and no arrays.
//
// Hints (try without them first):
//   1. n % 10 gives the last digit. n / 10 chops the last digit off.
//   2. Loop until n runs out of digits. Deal with negative numbers before the loop.
//
// Run it:  bash run.sh 1
public class P01_SumDigits {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static int sumDigits(int n) {
        return 0;
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P01 Sum of Digits");
        Check.eq("sumDigits(123) should be 6", 6, () -> sumDigits(123));
        Check.eq("sumDigits(0) should be 0", 0, () -> sumDigits(0));
        Check.eq("sumDigits(7) should be 7", 7, () -> sumDigits(7));
        Check.eq("sumDigits(1000) should be 1", 1, () -> sumDigits(1000));
        Check.eq("sumDigits(999) should be 27", 27, () -> sumDigits(999));
        Check.eq("sumDigits(-405) should be 9", 9, () -> sumDigits(-405));
        Check.eq("sumDigits(2147483647) should be 46", 46, () -> sumDigits(2147483647));
        Check.summary();
    }
}

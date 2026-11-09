// P04: Reverse a Number
// Level: Core    Source: Extra practice
//
// Return n with its digits in reverse order. A negative number keeps its minus sign.
// You may assume the reversed number fits in an int.
//
// Examples:
//   reverseNumber(1234) returns 4321
//   reverseNumber(120) returns 21   (leading zeros vanish)
//   reverseNumber(-123) returns -321
//   reverseNumber(0) returns 0
//
// Rules:
//   - Use % and / on the number. No Strings and no arrays.
//
// Hints (try without them first):
//   1. Build the answer one digit at a time: result = result * 10 + lastDigit.
//   2. Trace 123 on paper. result goes 0, 3, 32, 321. Handle the sign separately.
//
// Run it:  bash run.sh 4
public class P04_ReverseNumber {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static int reverseNumber(int n) {
        return 0;
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P04 Reverse a Number");
        Check.eq("reverseNumber(1234) should be 4321", 4321, () -> reverseNumber(1234));
        Check.eq("reverseNumber(120) should be 21", 21, () -> reverseNumber(120));
        Check.eq("reverseNumber(0) should be 0", 0, () -> reverseNumber(0));
        Check.eq("reverseNumber(5) should be 5", 5, () -> reverseNumber(5));
        Check.eq("reverseNumber(-123) should be -321", -321, () -> reverseNumber(-123));
        Check.eq("reverseNumber(1000) should be 1", 1, () -> reverseNumber(1000));
        Check.eq("reverseNumber(100001) should be 100001", 100001, () -> reverseNumber(100001));
        Check.eq("reverseNumber(90) should be 9", 9, () -> reverseNumber(90));
        Check.eq("reverseNumber(987654321) should be 123456789", 123456789, () -> reverseNumber(987654321));
        Check.eq("reverseNumber(2147447412) should be 2147447412", 2147447412, () -> reverseNumber(2147447412));
        Check.summary();
    }
}

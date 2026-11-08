// SOLUTION to P04: Reverse a Number
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - Each digit we peel off becomes the new right-most digit of result: result * 10 + digit.
//   - The sign is remembered separately and applied at the end.
public class S04_ReverseNumber {

    public static int reverseNumber(int n) {
        int sign = 1;
        if (n < 0) {
            sign = -1;
            n = -n;
        }
        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return sign * result;
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P04 Reverse a Number");
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

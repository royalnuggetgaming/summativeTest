// SOLUTION to P01: Sum of Digits
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - Peel the last digit off with % 10, add it to a running total, then drop it with / 10.
//   - Math.abs at the top takes care of negative inputs.
public class S01_SumDigits {

    public static int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P01 Sum of Digits");
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

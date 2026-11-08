// SOLUTION to P10: Ascending Digits
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - Peeling digits from the right shows them in reverse order, so each digit must be less than or equal to the one we just saw.
//   - We start with previous = 9, the biggest possible digit, so the right-most digit always passes.
public class S10_IsAscending {

    public static boolean isAscending(int n) {
        int previous = 9;
        while (n > 0) {
            int digit = n % 10;
            if (digit > previous) {
                return false;
            }
            previous = digit;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P10 Ascending Digits");
        Check.eq("isAscending(1239) should be true", true, () -> isAscending(1239));
        Check.eq("isAscending(1123) should be true", true, () -> isAscending(1123));
        Check.eq("isAscending(1329) should be false", false, () -> isAscending(1329));
        Check.eq("isAscending(5) should be true", true, () -> isAscending(5));
        Check.eq("isAscending(0) should be true", true, () -> isAscending(0));
        Check.eq("isAscending(111) should be true", true, () -> isAscending(111));
        Check.eq("isAscending(9876) should be false", false, () -> isAscending(9876));
        Check.eq("isAscending(12340) should be false", false, () -> isAscending(12340));
        Check.eq("isAscending(13579) should be true", true, () -> isAscending(13579));
        Check.eq("isAscending(100) should be false", false, () -> isAscending(100));
        Check.eq("isAscending(10) should be false", false, () -> isAscending(10));
        Check.eq("isAscending(12) should be true", true, () -> isAscending(12));
        Check.eq("isAscending(21) should be false", false, () -> isAscending(21));
        Check.eq("isAscending(122333) should be true", true, () -> isAscending(122333));
        Check.eq("isAscending(1221) should be false", false, () -> isAscending(1221));
        Check.eq("isAscending(123456789) should be true", true, () -> isAscending(123456789));
        Check.eq("isAscending(1000000000) should be false", false, () -> isAscending(1000000000));
        Check.eq("isAscending(2147483647) should be false", false, () -> isAscending(2147483647));
        Check.summary();
    }
}

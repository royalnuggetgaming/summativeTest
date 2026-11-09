// SOLUTION to P12: Palindrome Number
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - Half-reversal: while chopping digits off x, build the reversed second half.
//   - When the reversed half catches up to what is left of x, we are at the middle.
//   - For an odd number of digits the middle digit lands in reversedHalf, so we compare against reversedHalf / 10 too.
//   - A number that ends in 0 can only be a palindrome if it is 0 itself, since a number cannot start with 0.
//   - A second, String-based version (isPalindromeString) is below the main one.
public class S12_Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static boolean isPalindromeString(int x) {
        if (x < 0) {
            return false;
        }
        String s = x + "";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P12 Palindrome Number");
        Check.eq("isPalindrome(121) should be true", true, () -> isPalindrome(121));
        Check.eq("isPalindrome(-121) should be false", false, () -> isPalindrome(-121));
        Check.eq("isPalindrome(10) should be false", false, () -> isPalindrome(10));
        Check.eq("isPalindrome(0) should be true", true, () -> isPalindrome(0));
        Check.eq("isPalindrome(7) should be true", true, () -> isPalindrome(7));
        Check.eq("isPalindrome(11) should be true", true, () -> isPalindrome(11));
        Check.eq("isPalindrome(12) should be false", false, () -> isPalindrome(12));
        Check.eq("isPalindrome(1221) should be true", true, () -> isPalindrome(1221));
        Check.eq("isPalindrome(12321) should be true", true, () -> isPalindrome(12321));
        Check.eq("isPalindrome(123) should be false", false, () -> isPalindrome(123));
        Check.eq("isPalindrome(100) should be false", false, () -> isPalindrome(100));
        Check.eq("isPalindrome(1000021) should be false", false, () -> isPalindrome(1000021));
        Check.eq("isPalindrome(1000000001) should be true", true, () -> isPalindrome(1000000001));
        Check.eq("isPalindrome(2147447412) should be true", true, () -> isPalindrome(2147447412));
        Check.eq("isPalindrome(2147483647) should be false", false, () -> isPalindrome(2147483647));
        Check.eq("isPalindrome(-1) should be false", false, () -> isPalindrome(-1));
        Check.eq("isPalindrome(1234321) should be true", true, () -> isPalindrome(1234321));

        // The same tests against the String version.
        Check.eq("isPalindromeString(121) should be true", true, () -> isPalindromeString(121));
        Check.eq("isPalindromeString(-121) should be false", false, () -> isPalindromeString(-121));
        Check.eq("isPalindromeString(10) should be false", false, () -> isPalindromeString(10));
        Check.eq("isPalindromeString(0) should be true", true, () -> isPalindromeString(0));
        Check.eq("isPalindromeString(7) should be true", true, () -> isPalindromeString(7));
        Check.eq("isPalindromeString(11) should be true", true, () -> isPalindromeString(11));
        Check.eq("isPalindromeString(12) should be false", false, () -> isPalindromeString(12));
        Check.eq("isPalindromeString(1221) should be true", true, () -> isPalindromeString(1221));
        Check.eq("isPalindromeString(12321) should be true", true, () -> isPalindromeString(12321));
        Check.eq("isPalindromeString(123) should be false", false, () -> isPalindromeString(123));
        Check.eq("isPalindromeString(100) should be false", false, () -> isPalindromeString(100));
        Check.eq("isPalindromeString(1000021) should be false", false, () -> isPalindromeString(1000021));
        Check.eq("isPalindromeString(1000000001) should be true", true, () -> isPalindromeString(1000000001));
        Check.eq("isPalindromeString(2147447412) should be true", true, () -> isPalindromeString(2147447412));
        Check.eq("isPalindromeString(2147483647) should be false", false, () -> isPalindromeString(2147483647));
        Check.eq("isPalindromeString(-1) should be false", false, () -> isPalindromeString(-1));
        Check.eq("isPalindromeString(1234321) should be true", true, () -> isPalindromeString(1234321));
        Check.summary();
    }
}

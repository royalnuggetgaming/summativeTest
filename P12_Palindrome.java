// P12: Palindrome Number
// Level: Challenge    Source: Your handout
//
// Return true if x reads the same forwards and backwards.
// Negative numbers are never palindromes (the minus sign ends up on the wrong side).
//
// Examples:
//   isPalindrome(121) returns true
//   isPalindrome(-121) returns false
//   isPalindrome(10) returns false   (it reads 01 backwards)
//
// Rules:
//   - x fits in an int, so it can be as big as 2147483647.
//   - Try it twice: once with a String, once with only % and /. The tests are the same.
//
// Hints (try without them first):
//   1. Math idea: reverse the number (like P04) and compare it to the original. Reversing a big number can overflow an int, so keep the reversed value in a long.
//   2. Harder idea from your handout: reverse only the second half of the digits and stop when the reversed half is no longer smaller than what is left. Trace 12321 by hand.
//   3. String idea: compare the characters at positions i and length - 1 - i, for i up to length / 2.
//
// Run it:  bash run.sh 12
public class P12_Palindrome {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static boolean isPalindrome(int x) {
        return false;
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P12 Palindrome Number");
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
        Check.summary();
    }
}

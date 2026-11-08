// P10: Ascending Digits
// Level: Challenge    Source: Extra practice
//
// Return true if the digits of n never decrease from left to right.
// Equal neighbors are allowed. You may assume n is 0 or more.
//
// Examples:
//   isAscending(1239) returns true
//   isAscending(1123) returns true
//   isAscending(1329) returns false
//   isAscending(5) returns true
//
// Rules:
//   - Use % and / on the number. No Strings and no arrays.
//
// Hints (try without them first):
//   1. Peel digits off from the right. Remember the digit you looked at just before.
//   2. Going right to left, each new digit must be less than or equal to the one before it. If it is bigger, return false.
//
// Run it:  bash run.sh 10
public class P10_IsAscending {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static boolean isAscending(int n) {
        return false;
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P10 Ascending Digits");
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

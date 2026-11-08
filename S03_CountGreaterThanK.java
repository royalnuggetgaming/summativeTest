// SOLUTION to P03: Count Digits Greater Than K
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - Peel each digit off and compare it to k.
//   - For n = 0 the loop never runs, which is correct: 0 is never greater than a single digit k that is 0 or more.
public class S03_CountGreaterThanK {

    public static int countGreaterThanK(int n, int k) {
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            if (n % 10 > k) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P03 Count Digits Greater Than K");
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

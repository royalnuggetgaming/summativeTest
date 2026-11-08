// SOLUTION to P02: Count a Digit
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - Same peel-off loop as P01, but we count the digits that equal d.
//   - A do-while runs its body once before checking the condition, so the number 0 is counted as one digit.
public class S02_CountDigit {

    public static int countDigit(int n, int d) {
        n = Math.abs(n);
        int count = 0;
        do {
            if (n % 10 == d) {
                count++;
            }
            n /= 10;
        } while (n > 0);
        return count;
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P02 Count a Digit");
        Check.eq("countDigit(1223334444, 4) should be 4", 4, () -> countDigit(1223334444, 4));
        Check.eq("countDigit(1223334444, 3) should be 3", 3, () -> countDigit(1223334444, 3));
        Check.eq("countDigit(1223334444, 2) should be 2", 2, () -> countDigit(1223334444, 2));
        Check.eq("countDigit(1223334444, 1) should be 1", 1, () -> countDigit(1223334444, 1));
        Check.eq("countDigit(1223334444, 0) should be 0", 0, () -> countDigit(1223334444, 0));
        Check.eq("countDigit(0, 0) should be 1", 1, () -> countDigit(0, 0));
        Check.eq("countDigit(0, 5) should be 0", 0, () -> countDigit(0, 5));
        Check.eq("countDigit(100, 0) should be 2", 2, () -> countDigit(100, 0));
        Check.eq("countDigit(-1010, 1) should be 2", 2, () -> countDigit(-1010, 1));
        Check.eq("countDigit(555, 5) should be 3", 3, () -> countDigit(555, 5));
        Check.eq("countDigit(123, 4) should be 0", 0, () -> countDigit(123, 4));
        Check.eq("countDigit(7, 7) should be 1", 1, () -> countDigit(7, 7));
        Check.eq("countDigit(1000000000, 0) should be 9", 9, () -> countDigit(1000000000, 0));
        Check.summary();
    }
}

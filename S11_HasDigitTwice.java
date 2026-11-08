// SOLUTION to P11: Repeated Digit
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - counts[d] tracks how many times digit d has shown up so far.
//   - As soon as one count reaches 2 we can return true. The do-while makes sure the number 0 gets processed.
public class S11_HasDigitTwice {

    public static boolean hasDigitTwice(int n) {
        int[] counts = new int[10];
        do {
            int digit = n % 10;
            counts[digit]++;
            if (counts[digit] >= 2) {
                return true;
            }
            n /= 10;
        } while (n > 0);
        return false;
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P11 Repeated Digit");
        Check.eq("hasDigitTwice(1234) should be false", false, () -> hasDigitTwice(1234));
        Check.eq("hasDigitTwice(1123) should be true", true, () -> hasDigitTwice(1123));
        Check.eq("hasDigitTwice(121) should be true", true, () -> hasDigitTwice(121));
        Check.eq("hasDigitTwice(0) should be false", false, () -> hasDigitTwice(0));
        Check.eq("hasDigitTwice(10) should be false", false, () -> hasDigitTwice(10));
        Check.eq("hasDigitTwice(100) should be true", true, () -> hasDigitTwice(100));
        Check.eq("hasDigitTwice(1234567890) should be false", false, () -> hasDigitTwice(1234567890));
        Check.eq("hasDigitTwice(1223) should be true", true, () -> hasDigitTwice(1223));
        Check.eq("hasDigitTwice(9) should be false", false, () -> hasDigitTwice(9));
        Check.eq("hasDigitTwice(99) should be true", true, () -> hasDigitTwice(99));
        Check.eq("hasDigitTwice(1020) should be true", true, () -> hasDigitTwice(1020));
        Check.eq("hasDigitTwice(98765) should be false", false, () -> hasDigitTwice(98765));
        Check.eq("hasDigitTwice(2147483647) should be true", true, () -> hasDigitTwice(2147483647));
        Check.eq("hasDigitTwice(1000000000) should be true", true, () -> hasDigitTwice(1000000000));
        Check.summary();
    }
}

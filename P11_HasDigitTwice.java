// P11: Repeated Digit
// Level: Challenge    Source: Extra practice
//
// Return true if any digit appears two or more times in n.
// You may assume n is 0 or more.
//
// Examples:
//   hasDigitTwice(1234) returns false
//   hasDigitTwice(1123) returns true
//   hasDigitTwice(1020) returns true   (the digit 0 appears twice)
//   hasDigitTwice(0) returns false
//
// Rules:
//   - Any approach works. An int[10] array is allowed.
//
// Hints (try without them first):
//   1. Idea A: for each digit d from 0 to 9, count how many times d appears (like P02). If any count is 2 or more, return true.
//   2. Idea B: make an int[10]. Add 1 to counts[digit] as you peel each digit. Return true as soon as a count reaches 2.
//
// Run it:  bash run.sh 11
public class P11_HasDigitTwice {

    // YOUR CODE GOES HERE. Replace the placeholder with a real solution.
    public static boolean hasDigitTwice(int n) {
        return false;
    }

    // ---------------------------------------------------------------
    // Tests. You do not need to change anything below this line.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Check.header("P11 Repeated Digit");
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

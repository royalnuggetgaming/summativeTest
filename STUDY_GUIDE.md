# Study Guide: Digits and Patterns

Your teacher said Monday's summative is similar to your last project and to the handout problems. Those problems all come from a small set of patterns. This guide gives you the patterns, a game plan, and tracing practice. The coding practice is in `src/`.

## 1. How to practice

1. Read the problem. Write 3 test inputs on paper, including one edge case (0, a negative, a single digit).
2. Solve one example by hand, step by step.
3. Write the code, then run `bash run.sh N`.
4. Fix failures one at a time. The FAIL line tells you the input and what your code returned.
5. If you are stuck for about 20 minutes, open the hints at the top of the file. Look at the solution last. After you read a solution, close it and rewrite it from scratch.
6. The next day, rewrite it again with no help. That is the real test.

## 2. Game plan

If you have about two hours before Monday:

| Time | What to do |
|---|---|
| 10 min | Read the cheat sheet (section 3). Try the tracing questions (section 5) on paper. |
| 60 min | P01 to P06. Run the tests after every attempt. |
| 25 min | P07 and P08, or P12 if you want to attack the palindrome. |
| 25 min | Mock summative: pick one digit problem and one pattern problem you have not done. Set a timer, use no hints, and do not run the tests until you think you are done. |

Monday morning (15 minutes): rewrite P03 and P06 from a blank screen, then skim section 4.

Two questions to ask your teacher before Monday:

- What is allowed: Strings, arrays, Math methods? Practice the digit problems with only `%` and `/`, since that works under any rules.
- Your handout's Floyd's triangle example shows no spaces (`23`), but the sample solution prints a space after each number. Which one is graded? The tests here accept both.

## 3. Pattern cheat sheet

### The digit loop

```java
while (n > 0) {
    int digit = n % 10;   // the last digit
    // ...use digit here...
    n /= 10;              // drop the last digit
}
```

- `while (n > 0)` never runs for 0. If 0 has to count as a digit, use a do-while, or check 0 first.
- Negative input: `n = Math.abs(n);` before the loop (or return early if the problem says negatives fail).
- Need the original number later? Save it first: `int original = n;`

### Accumulators (declare them above the loop)

```java
int sum = 0;        // add things up:          sum += digit;
int count = 0;      // count matches:          count++;
int result = 0;     // build a number:         result = result * 10 + digit;
```

### Early return

```java
while (...) {
    if (/* found a problem */) {
        return false;
    }
}
return true;   // only reached if no problem was found
```

Used by `isPalindrome`, `isAscending`, and `hasDigitTwice`.

### Nested loops for patterns

```java
for (int i = 0; i < rows; i++) {         // one pass = one row
    for (int j = 0; j < cols; j++) {     // one pass = one cell in that row
        System.out.print("*");
    }
    System.out.println();                // finish the row
}
```

| Shape | What decides it |
|---|---|
| Square | inner loop runs `j < size` |
| Growing triangle | inner loop runs `j <= i` (rows numbered from 1) |
| Border only | `i == 0 \|\| i == size - 1 \|\| j == 0 \|\| j == size - 1` |
| Checkerboard | `(i + j) % 2 == 0` |
| Count across rows (Floyd) | declare the counter above both loops |

### Strings (if your teacher allows them)

- `s.length()`, `s.charAt(i)`, `s.substring(a, b)` (includes a, stops before b), `s.equals(t)`
- int to String: `x + ""` or `String.valueOf(x)`
- char to digit: `c - '0'`

### Number facts

- `/` on ints drops the decimal: `17 / 5` is 3. `%` is the remainder: `17 % 5` is 2. `-17 % 5` is -2.
- `Integer.MAX_VALUE` is 2147483647. One more overflows. Reversing a big number can overflow an int, so use a `long` for the reversed value.

## 4. Common bugs

| What you see | Likely cause | Fix |
|---|---|---|
| "ran for more than 1 second" | Infinite loop | Make sure something changes every pass (`n /= 10`) and the condition can become false |
| One row or digit too many or too few | `<` vs `<=`, or starting at 0 vs 1 | Trace a tiny input (size 1 or 2) |
| Everything prints on one line | Missing `println` | `System.out.println();` after the inner loop |
| A blank line after every star | `println` inside the inner loop | `print` inside, `println` after |
| Right for 123, wrong for 0 | `while (n > 0)` skips 0 | Use do-while, or handle 0 first |
| Negative inputs go wrong | `%` of a negative is negative | `Math.abs` first |
| Counter keeps resetting | Variable declared inside the loop | Declare it above the loop |
| Comparison is wrong after the loop | You changed `n` but needed the original | Save `int original = n;` first |
| Strings never match | Used `==` | Use `.equals()` |
| Huge or negative weird result | int overflow | Use `long` for the in-between value |
| "missing return statement" | Some path does not return | Add a return after the loop |

## 5. Trace these by hand

Do each one on paper first, then open the answer. Keep a table of variable values for the loops.

**Q1.** What does this print?

```java
int n = 90417;
int evens = 0;
while (n > 0) {
    int d = n % 10;
    if (d % 2 == 0) {
        evens++;
    }
    n /= 10;
}
System.out.println(evens);
```

<details><summary>Answer</summary>

`2`. The digits are peeled off as 7, 1, 4, 0, 9. The even ones are 4 and 0.

</details>

**Q2.** What does this print? Write down `r` after each pass.

```java
int x = 12345;
int r = 0;
while (x > 0) {
    r = r * 10 + x % 10;
    x /= 10;
}
System.out.println(r);
```

<details><summary>Answer</summary>

`54321`. After each pass `r` is 5, 54, 543, 5432, 54321.

</details>

**Q3.** What does this print?

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(i * j + " ");
    }
    System.out.println();
}
```

<details><summary>Answer</summary>

```
1
2 4
3 6 9
```

</details>

**Q4.** What does this print?

```java
System.out.println(17 / 5 + " " + 17 % 5 + " " + (-17) % 5 + " " + 5 / 2.0);
```

<details><summary>Answer</summary>

`3 2 -2 2.5`

</details>

**Q5.** Version A and version B differ by one line. What does each print?

```java
// Version A
for (int i = 0; i < 3; i++) {
    int total = 0;
    total += i;
    System.out.print(total + " ");
}

// Version B
int total = 0;
for (int i = 0; i < 3; i++) {
    total += i;
    System.out.print(total + " ");
}
```

<details><summary>Answer</summary>

Version A prints `0 1 2`. Version B prints `0 1 3`. In A, `total` is created fresh (back to 0) on every pass. In B it keeps its value across passes. This is why Floyd's `num` must be declared above both loops.

</details>

**Q6.** What does this print?

```java
String s = "palindrome";
System.out.println(s.substring(2, 5) + " " + s.length() + " " + s.substring(s.length() - 1));
```

<details><summary>Answer</summary>

`lin 10 e`. Index 2 is `l`, and `substring(2, 5)` stops before index 5.

</details>

**Q7.** Trace the half-reversal palindrome check for `x = 4554`. Write `x` and `reversedHalf` after each pass of the loop, and say what is returned.

```java
int reversedHalf = 0;
while (x > reversedHalf) {
    reversedHalf = reversedHalf * 10 + x % 10;
    x /= 10;
}
return x == reversedHalf || x == reversedHalf / 10;
```

<details><summary>Answer</summary>

| After pass | x | reversedHalf |
|---|---|---|
| start | 4554 | 0 |
| 1 | 455 | 4 |
| 2 | 45 | 45 |

The loop stops because 45 is not greater than 45. `x == reversedHalf` is true, so it returns `true`.

</details>

**Q8.** What do `hasThree(4132)` and `hasThree(2020)` return?

```java
static boolean hasThree(int n) {
    while (n > 0) {
        if (n % 10 == 3) {
            return true;
        }
        n /= 10;
    }
    return false;
}
```

<details><summary>Answer</summary>

`true` and `false`. For 4132 the digits come off as 2, 3 (match, return true). For 2020 no digit is 3, so the loop ends and it returns false.

</details>

**Q9.** What does `hollowSquare(3)` print (star and space version)?

<details><summary>Answer</summary>

```
* * *
*   *
* * *
```

Only the middle cell is empty, so the middle row is star, two spaces (one for the cell, one for the gap), then a star.

</details>

## 6. Test day checklist

- Read the method signature. Does it return a value or print? Do not change the name or the parameters.
- Before coding, write three test inputs: a normal one, an edge case (0 or one digit), and a negative if the problem allows it.
- Trace your code on one small input on paper before you run it.
- Get a simple version working first (for example, positive numbers only), then fix the edge cases.
- For pattern problems, draw the output for size 3 on paper and number the rows and columns.
- Check that every `{` has a matching `}` and every non-void method returns on every path.
- With time left, rerun your own three tests plus 0.

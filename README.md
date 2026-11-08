# AP CSA Practice: Digits and Patterns

Twelve self-checking Java problems to get ready for an in-class coding summative. Four come straight from your handouts (palindrome number, count digits greater than K, hollow square, Floyd's triangle). The other eight are extra practice on the same skills.

Each problem has a file in `src/` with an empty method for you to fill in. When you run it, it tests your code and tells you exactly which cases pass and which fail. Sample solutions with short explanations are in `solutions/`.

Start with `STUDY_GUIDE.md`. It has a cheat sheet, a game plan, and tracing practice.

## The problems

| # | Problem | Type | Level | Source |
|---|---|---|---|---|
| 1 | [Sum of Digits](src/P01_SumDigits.java) | Digits | Warm-up | Extra practice |
| 2 | [Count a Digit](src/P02_CountDigit.java) | Digits | Warm-up | Extra practice |
| 3 | [Count Digits Greater Than K](src/P03_CountGreaterThanK.java) | Digits | Warm-up | Your handout |
| 4 | [Reverse a Number](src/P04_ReverseNumber.java) | Digits | Core | Extra practice |
| 5 | [Right Triangle](src/P05_RightTriangle.java) | Patterns | Warm-up | Extra practice |
| 6 | [Hollow Square](src/P06_HollowSquare.java) | Patterns | Core | Your handout |
| 7 | [Floyd's Triangle](src/P07_FloydsTriangle.java) | Patterns | Core | Your handout |
| 8 | [Checkerboard](src/P08_Checkerboard.java) | Patterns | Core | Extra practice |
| 9 | [Hollow Triangle](src/P09_HollowTriangle.java) | Patterns | Challenge | Extra practice |
| 10 | [Ascending Digits](src/P10_IsAscending.java) | Digits | Challenge | Extra practice |
| 11 | [Repeated Digit](src/P11_HasDigitTwice.java) | Digits | Challenge | Extra practice |
| 12 | [Palindrome Number](src/P12_Palindrome.java) | Digits | Challenge | Your handout |

Go in order. The early ones are short and build the skills the later ones need.

## Option A: Run it on GitHub (nothing to install)

1. Unzip `ap-csa-practice.zip`.
2. On github.com, sign in (a free account is fine). Click **New repository**, name it `ap-csa-practice`, choose **Private**, and click **Create repository**.
3. On the empty repository page, click **uploading an existing file**. Drag everything from inside the unzipped folder into the page (the `src` and `solutions` folders plus the files next to them), then click **Commit changes**.
4. Click the green **Code** button, open the **Codespaces** tab, and click **Create codespace on main**. After a minute or two you get VS Code in your browser with Java ready to go.
5. Open a file in `src/`, write your solution, and run the tests in the terminal at the bottom of the screen:

```
bash run.sh 1
```

Notes:

- Codespaces gives personal accounts a free monthly allowance. It stops itself when you are idle. You can also stop it from github.com/codespaces.
- The `.devcontainer` folder and `.gitignore` are hidden files on some computers, so they may not upload. That is fine. Codespaces still works and the terminal command above does not need them.

## Option B: Run it on your own computer

Install Java 11 or newer (Temurin from adoptium.net is a good choice) and VS Code with the Extension Pack for Java. Then, in a terminal inside the project folder:

```
bash run.sh 1
```

If `bash` is not available (plain Windows), use these two commands instead, changing the file and class name for the problem you want:

```
javac -d out src/Check.java src/P01_SumDigits.java
java -cp out P01_SumDigits
```

You can also click the Run button above `main` in VS Code.

## Commands

| Command | What it does |
|---|---|
| `bash run.sh 3` | Tests your code for problem 3 |
| `bash run.sh all` | Tests every problem, one summary line each |
| `bash run.sh solution 3` | Runs the sample solution for problem 3 |
| `bash run.sh solution all` | Runs every sample solution |

## Reading the results

```
=== P03 Count Digits Greater Than K ===
  PASS  countGreaterThanK(38529, 4) should be 3
  FAIL  countGreaterThanK(0, 0) should be 0
        expected 0 but got 1
```

- A test that runs longer than 1 second is marked FAIL with a note about an infinite loop, so you never get stuck waiting.
- If your file does not compile, you get the compiler errors instead of test results.

## Problems that print

Hollow square, Floyd's triangle, and the other pattern problems print instead of returning a value. The tests ignore spaces at the end of a line and blank lines at the end of the output. They accept two layouts: one character per cell, or a space after each cell. So both `* * *` and `***` style output pass, and both Floyd styles from your handout pass too.

## Folder layout

```
src/         your practice files (edit these) plus Check.java, the test helper
solutions/   sample solutions, one per problem (try first, peek second)
run.sh       the test runner
STUDY_GUIDE.md
```

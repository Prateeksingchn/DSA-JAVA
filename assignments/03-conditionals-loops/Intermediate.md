## Write Java Programs for the Following: 

### Intermediate Java Programs
1. [Factorial Program In Java](#1-factorial-program-in-java) 🟩
2. [Calculate Electricity Bill](#2-calculate-electricity-bill) ✅
3. [Calculate Average Of N Numbers](#3-calculate-average-of-n-numbers) 🟩
4. [Calculate Discount Of Product](#4-calculate-discount-of-product) 🟩
5. [Calculate Distance Between Two Points](#5-calculate-distance-between-two-points) 🟩
6. [Calculate Commission Percentage](#6-calculate-commission-percentage) 🟩
7. [Power In Java](#7-power-in-java) 🟩
8. [Calculate Depreciation of Value](#8-calculate-depreciation-of-value) 🟩
9. [Calculate Batting Average](#9-calculate-batting-average) 🟩
10. [Calculate CGPA Java Program](#10-calculate-cgpa-java-program) 🟩
11. [Compound Interest Java Program](#11-compound-interest-java-program) 🟩
12. [Calculate Average Marks](#12-calculate-average-marks) 🟩
13. [Sum Of N Numbers](#13-sum-of-n-numbers) 🟩
14. [Armstrong Number In Java](#14-armstrong-number-in-java) 🟩
15. [Find Ncr & Npr](#15-find-ncr-npr) 🟩
16. [Reverse A String In Java](#16-reverse-a-string-in-java) 🟩
17. [Find if a number is palindrome or not](#17-find-if-a-number-is-palindrome-or-not) 🟩
18. [Future Investment Value](#18-future-investment-value) 🟩
19. [HCF Of Two Numbers Program](#19-hcf-of-two-numbers-program) 🟩
20. [LCM Of Two Numbers](#20-lcm-of-two-numbers) 🟩
21. [Java Program Vowel Or Consonant](#21-java-program-vowel-or-consonant) 🟩
22. [Perfect Number In Java](#22-perfect-number-in-java) 🟩
23. [Check Leap Year Or Not](#23-check-leap-year-or-not) 🟩
24. [Sum Of A Digits Of Number](#24-sum-of-a-digits-of-number) 🟩
25. [Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.](#25-kunal-is-allowed-to-go-out-with-his-friends-only-on-the-even-days-of-a-given-month-write-a-program-to-count-the-number-of-days-he-can-go-out-in-the-month-of-august) 🟩
26. [Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.](#26-write-a-program-to-print-the-sum-of-negative-numbers-sum-of-positive-even-numbers-and-the-sum-of-positive-odd-numbers-from-a-list-of-numbers-n-entered-by-the-user-the-list-terminates-when-the-user-enters-a-zero) 🟩

---

### 1. Factorial Program In Java 🟩

**Formula:**
\[ \text{Factorial}(n) = n \times (n-1) \times (n-2) \times ... \times 1 \]

- Example Input:
    ```
    Enter number
    5
    ```
- Example Output:
    ```
    Factorial of 5 is 120
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 2. Calculate Electricity Bill ✅

#### Example Code 1: Simple Electricity Bill

```java
package com.prateek;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define the rate per unit
        double ratePerUnit = 0.12;  // $0.12 per unit

        // Ask user for input
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Calculate the bill
        double bill = unitsConsumed * ratePerUnit;

        // Print the result
        System.out.println("Electricity Bill Calculator");
        System.out.println("---------------------------");
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.println("Rate per unit: $" + ratePerUnit);
        System.out.printf("Total bill: $%.2f%n", bill);

        // Close the scanner
        scanner.close();
    }
}
```

**Example Input and Output:**

- **Input:**
  ```
  Enter the number of units consumed: 150
  ```

- **Output:**
  ```
  Electricity Bill Calculator
  ---------------------------
  Units consumed: 150
  Rate per unit: $0.12
  Total bill: $18.00
  ```

---

#### Example Code 2: Electricity Bill with If-Else Conditions

```java
package com.prateek;

import java.util.Scanner;

public class IfElseElectricityBill {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Variable to store the bill amount
        double bill;

        // Calculate the bill based on units consumed
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 0.10;  // $0.10 per unit for first 100 units
        } else if (unitsConsumed <= 200) {
            bill = 100 * 0.10 + (unitsConsumed - 100) * 0.15;  // $0.15 per unit for next 100 units
        } else if (unitsConsumed <= 300) {
            bill = 100 * 0.10 + 100 * 0.15 + (unitsConsumed - 200) * 0.20;  // $0.20 per unit for next 100 units
        } else {
            bill = 100 * 0.10 + 100 * 0.15 + 100 * 0.20 + (unitsConsumed - 300) * 0.25;  // $0.25 per unit for units above 300
        }

        // Print the result
        System.out.println("Electricity Bill Calculator");
        System.out.println("---------------------------");
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.printf("Total bill: $%.2f%n", bill);

        // Close the scanner
        scanner.close();
    }
}
```

**Example Input and Output:**

- **Input:**
  ```
  Enter the number of units consumed: 350
  ```

- **Output:**
  ```
  Electricity Bill Calculator
  ---------------------------
  Units consumed: 350
  Total bill: $47.50
  ```

---

#### Note

In the first example code, the following format specifier is used in the `printf` statement:

```java
System.out.printf("Total bill: $%.2f%n", bill);
```

Let's break down the `$%.2f%n` format specifier used in the `printf` statement:

- `$` is a literal dollar sign character that will be printed as-is.
- `%` marks the beginning of a format specifier.
- `.2` specifies that we want 2 decimal places.
- `f` indicates that we're formatting a floating-point number (like a double).
- `%n` is a platform-independent newline character.

So, `$%.2f%n` means:

- Print a dollar sign.
- Format the following number as a floating-point with 2 decimal places.
- Add a newline at the end.

[Back to Top](#write-java-programs-for-the-following)

---

### 3. Calculate Average Of N Numbers 🟩

**Formula:**
\[ \text{Average} = \frac{\text{Sum of numbers}}{\text{Count of numbers}} \]

- Example Input:
    ```
    Enter numbers (enter 0 to stop):
    5
    10
    15
    0
    ```
- Example Output:
    ```
    Average of numbers: 10.0
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 4. Calculate Discount Of Product 🟩

**Formula:**
\[ \text{Discounted Price} = \text{Original Price} - (\text{Original Price} \times \frac{\text{Discount Percentage}}{100}) \]

- Example Input:
    ```
    Enter original price
    100
    Enter discount percentage
    20
    ```
- Example Output:
    ```
    Discounted price: 80.0
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 5. Calculate Distance Between Two Points 🟩

**Formula:**
\[ \text{Distance} = \sqrt{(\text{x2} - \text{x1})^2 + (\text{y2} - \text{y1})^2} \]

- Example Input:
    ```
    Enter x1, y1, x2, y2
    1 2 4 6
    ```
- Example Output:
    ```
    Distance: 5.0
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 6. Calculate Commission Percentage 🟩

**Formula:**
\[ \text{Commission} = \text{Sales Amount} \times \frac{\text{Commission Rate}}{100} \]

- Example Input:
    ```
    Enter sales amount
    1000
    Enter commission rate
    10
    ```
- Example Output:
    ```
    Commission: 100.0
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 7. Power In Java 🟩

**Formula:**
\[ \text{Power} = \text{base}^\text{exponent} \]

- Example Input:
    ```
    Enter base
    2
    Enter exponent
    3
    ```
- Example Output:
    ```
    Result: 8.0
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 8. Calculate Depreciation of Value 🟩

**Formula:**
\[ \text{Depreciation} = \text{Original Value} \times (1 - \frac{\text{Rate of Depreciation}}{100})^\text{Number of Years} \]

- Example Input:
    ```
    Enter original value
    1000
    Enter rate of depreciation
    10
    Enter number of years
    5
    ```
- Example Output:
    ```
    Depreciated value: 590.49
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 9. Calculate Batting Average 🟩

**Formula:**
\[ \text{Batting Average} = \frac{\text{Total Runs}}{\text{Number of Outs}} \]

- Example Input:
    ```
    Enter total runs
    500
    Enter number of outs
    10
    ```
- Example Output:
    ```
    Batting average: 50.0
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 10. Calculate CGPA Java Program 🟩

**Formula:**
\[ \text{CGPA} = \frac{\text{Sum of all Grade Points}}{\text{Number of Subjects}} \]

- Example Input:
    ```
    Enter grade points (enter -1 to stop):
    8
    9
    7
    -

1
    ```
- Example Output:
    ```
    CGPA: 8.0
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 11. Compound Interest Java Program 🟩

**Formula:**
\[ \text{A} = \text{P} \left(1 + \frac{\text{r}}{\text{n}}\right)^{\text{n} \times \text{t}} \]

- Example Input:
    ```
    Enter principal amount
    1000
    Enter annual interest rate (in %)
    5
    Enter number of times interest applied per time period
    4
    Enter number of time periods the money is invested for
    2
    ```
- Example Output:
    ```
    Compound interest: 1104.94
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 12. Calculate Average Marks 🟩

**Formula:**
\[ \text{Average Marks} = \frac{\text{Sum of Marks}}{\text{Number of Subjects}} \]

- Example Input:
    ```
    Enter marks (enter -1 to stop):
    85
    90
    78
    -1
    ```
- Example Output:
    ```
    Average marks: 84.33333333333333
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 13. Sum Of N Numbers 🟩

**Formula:**
\[ \text{Sum} = \frac{n(n + 1)}{2} \]

- Example Input:
    ```
    Enter a number
    5
    ```
- Example Output:
    ```
    Sum of first 5 natural numbers is: 15
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 14. Armstrong Number In Java 🟩

**Hint:**
- An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 153 is an Armstrong number because \(1^3 + 5^3 + 3^3 = 153\).

- Example Input:
    ```
    Enter a number
    153
    ```
- Example Output:
    ```
    153 is an Armstrong number.
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 15. Find Ncr & Npr 🟩

**Formula:**
\[ \text{Ncr} = \frac{n!}{r!(n-r)!} \]
\[ \text{Npr} = \frac{n!}{(n-r)!} \]

- Example Input:
    ```
    Enter n
    5
    Enter r
    2
    ```
- Example Output:
    ```
    Ncr: 10
    Npr: 20
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 16. Reverse A String In Java 🟩

**Hint:**
- Use a loop to iterate through the string backwards and append each character to a new string.

- Example Input:
    ```
    Enter a string
    hello
    ```
- Example Output:
    ```
    Reversed string: olleh
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 17. Find if a number is palindrome or not 🟩

**Hint:**
- A palindrome number is a number that remains the same when its digits are reversed.

- Example Input:
    ```
    Enter a number
    121
    ```
- Example Output:
    ```
    121 is a palindrome.
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 18. Future Investment Value 🟩

**Formula:**
\[ \text{FV} = \text{PV} \times (1 + \frac{\text{rate}}{100})^\text{n} \]

- Example Input:
    ```
    Enter present value
    1000
    Enter annual interest rate (in %)
    5
    Enter number of years
    10
    ```
- Example Output:
    ```
    Future value: 1628.89
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 19. HCF Of Two Numbers Program 🟩

**Hint:**
- The highest common factor (HCF) or greatest common divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

- Example Input:
    ```
    Enter two numbers
    24 36
    ```
- Example Output:
    ```
    HCF: 12
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 20. LCM Of Two Numbers 🟩

**Hint:**
- The least common multiple (LCM) of two integers is the smallest positive integer that is divisible by both integers.

- Example Input:
    ```
    Enter two numbers
    4 6
    ```
- Example Output:
    ```
    LCM: 12
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 21. Java Program Vowel Or Consonant 🟩

**Hint:**
- Check if a given character is a vowel (a, e, i, o, u) or a consonant.

- Example Input:
    ```
    Enter a character
    a
    ```
- Example Output:
    ```
    a is a vowel.
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 22. Perfect Number In Java 🟩

**Hint:**
- A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself.

- Example Input:
    ```
    Enter a number
    28
    ```
- Example Output:
    ```
    28 is a perfect number.
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 23. Check Leap Year Or Not 🟩

**Hint:**
- A leap year is exactly divisible by 4 except for century years (years ending with 00). The century year is a leap year only if it is perfectly divisible by 400.

- Example Input:
    ```
    Enter a year
    2020
    ```
- Example Output:
    ```
    2020 is a leap year.
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 24. Sum Of A Digits Of Number 🟩

**Hint:**
- Use a loop to extract each digit of the number and sum them up.

- Example Input:
    ```
    Enter a number
    123
    ```
- Example Output:
    ```
    Sum of digits: 6
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August. 🟩

**Hint:**
- Count the even days in the month (e.g., for August, the days are 2, 4, 6, ..., 30).

- Example Output:
    ```
    Kunal can go out 15 days in August.
    ```

[Back to Top](#write-java-programs-for-the-following)

---

### 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero. 🟩

**Hint:**
- Use a loop to keep track of the sums based on the type of number (negative, positive even, positive odd).

- Example Input:
    ```
    Enter numbers (enter 0 to stop):
    -1
    2
    3
    4
    0
    ```
- Example Output:
    ```
    Sum of negative numbers: -1
    Sum of positive even numbers: 6
    Sum of positive odd numbers: 3
    ```

[Back to Top](#write-java-programs-for-the-following)

---

Would you like to see the full code examples for the remaining programs, or do you have any specific requests?
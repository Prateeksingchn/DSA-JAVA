
# Write Java programs for the following:

# Index

1. [Check Even or Odd](#1-check-even-or-odd)
2. [Greeting Message](#2-greeting-message)
3. [Calculate Simple Interest](#3-calculate-simple-interest)
4. [Calculator](#4-calculator)
   - [Using If-Else](#41-using-if-else)
   - [Using Switch](#42-using-switch)
5. [Print Larger Number](#5-print-larger-number)
6. [Currency Converter (Rupees to USD)](#6-currency-converter-rupees-to-usd)
7. [Fibonacci Series](#7-fibonacci-series)
8. [Palindrome Checker](#8-palindrome-checker)
9. [Armstrong Numbers in a Range](#9-armstrong-numbers-in-a-range)

## Questions

# 1. Check Even or Odd
Ques- Write a program to print whether a number is even or odd, also take input from the user.

```Java
package com.prateek;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Close the scanner (optional but recommended)
        input.close();
    }
}
```

**Input:**
```
15
```

**Output:**
```
Odd
```
[Back to the top](#index)
---

# 2. Greeting Message
Ques- Take name as input and print a greeting message for that particular name.

```Java
package assignments;

import java.util.Scanner;

public class GreetingsMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();

        System.out.println("Hello " + name);
    }
}

```

**Input:**
```
Prateek
```
**Output:**
```
Hello Prateek
```

[Back to the top](#index)
---

# 3. Calculate Simple Interest
Ques- Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

```java
package assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principal (P):");
        int p = input.nextInt();

        System.out.println("Enter Rate of Interest (R):");
        int r = input.nextInt();

        System.out.println("Enter Time Period in Years (T):");
        int t = input.nextInt();

        int simpleInterest = (p * r * t) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);
        
        input.close();
    }
}
```
**Input:**
```
Enter Principal (P):
1000
Enter Rate of Interest (R):
5
Enter Time Period in Years (T):
2
```

**Output:**
```
The Simple Interest is: 100
```

[Back to the top](#index)
---

# 4. Calculator
Ques- Take in two numbers and an operator (+, -, *, /) and calculate the value.
   ## [4.1 Using If-Else](#41-using-if-else)

```java
package assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        // Variable to store the result
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Check for division by zero(if 2nd num is 0 or not)
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            input.close();
            return;
        }

        System.out.println("The result is: " + result);

        input.close();
    }
}
```

**Input:**
```
Enter the first number:
10
Enter an operator (+, -, *, /):
+
Enter the second number:
5
```

**Output:**
```
The result is: 15.0
```
[Back to the top](#index)

   ## [4.2 Using Switch](#42-using-switch)

```java
package assignments;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        // Variable to store the result
        double result = 0;

        // Perform the calculation based on the operator using switch
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero(if num2 = 0, then error)
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    input.close();
                    return;
                }
                break;
            default:

                System.out.println("Error: Invalid operator.");
                input.close();
                return;
        }

        System.out.println("The result is: " + result);

        input.close();
    }
}

```
**Input:**
```
Enter the first number:
10
Enter an operator (+, -, *, /):
+
Enter the second number:
5
```

**Output:**
```
The result is: 15.0
```
[Back to the top](#index)
---   

# 5. Print Larger Number
Ques- Take 2 numbers as input and print the largest number.


```java
package assignments;

import java.util.Scanner;

public class PrintLargerNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = input.nextInt();

        System.out.println("Enter num2");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("The larger num is: " + num1);
        } else if (num1 < num2) {
            System.out.println("The larger num is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

    }
}

```

**Input:**
```
Enter num1:
15
Enter num2:
25
```

**Output:**
```
The larger number is: 25
```

[Back to the top](#index)
---

# 6. Currency Converter (Rupees to USD)
Ques- Input currency in rupees and output in USD.

```java
package assignments;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount in rupees:");
        double rupees = input.nextDouble();

        double conversionRate = 80.0; // Example conversion rate

        double dollars = rupees / conversionRate;

        System.out.println("Your amount in dollars: " + dollars);

    }
}

```
**Input:**
```
Enter the amount in rupees:
8000
```

**Output:**
```
Your amount in dollars: 100.00
```

[Back to the top](#index)
---

# 7. Fibonacci Series
Ques- To calculate Fibonacci Series up to n numbers.

```java
package assignments;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of terms in the Fibonacci series
        System.out.println("Enter the number of terms in the Fibonacci series:");
        int n = input.nextInt();

        // Handle the special case where n is 0 or negative
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series up to " + n + " terms:");

            // Initialize the first two terms of the Fibonacci series
            int num1 = 0, num2 = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(num1 + " ");

                // Calculate the next term
                int nextTerm = num1 + num2;
                // Update the previous two terms
                num1 = num2;
                num2 = nextTerm;
            }

            System.out.println(); // Move to the next line after printing the series
        }

        // Close the scanner (optional but recommended)
        input.close();
    }
}
```

**Input:**
```
Enter the number of terms in the Fibonacci series:
10
```

**Output:**
```
Fibonacci Series up to 10 terms:
0 1 1 2 3 5 8 13 21 34
```
[Back to the top](#index)
---

# 8. Palindrome Checker
Ques- To find out whether the given string is a palindrome or not.

```java
package assignments;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Ignore non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Compare characters
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
```

**Input:**
```
Enter a string:
Madam
```

**Output:**
```
The string is a palindrome.
```

**Input:**
```
Enter a string:
Hello
```

**Output:**
```
The string is not a palindrome.
```
[Back to the top](#index)
---


# 9. Armstrong Numbers in a Range
Ques- Find Armstrong Numbers between two given numbers.

An Armstrong number (also known as a narcissistic number or pluperfect number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an Armstrong number because \(1^3 + 5^3 + 3^3 = 153\).


```java
package assignments;

import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the range
        System.out.println("Enter the lower bound of the range:");
        int lowerBound = input.nextInt();

        System.out.println("Enter the upper bound of the range:");
        int upperBound = input.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + " are:");

        // Find and print all Armstrong numbers in the given range
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Close the scanner (optional but recommended)
        input.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
```
**Input:**
```
Enter the lower bound of the range:
100
Enter the upper bound of the range:
500
```

**Output:**
```
Armstrong numbers between 100 and 500 are:
153 370 371 407 
```

[Back to the top](#index)
---



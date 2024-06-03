
## Write Java programs for the following:

Here's the updated content for your README file with the necessary corrections and formatting:

---

### 1. Write a program to print whether a number is even or odd, also take input from the user.

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

---

2. Take name as input and print a greeting message for that particular name.

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
---


3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.

```java
package assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the principal amount
        System.out.println("Enter Principal (P):");
        int p = input.nextInt();

        // Prompting the user to enter the rate of interest
        System.out.println("Enter Rate of Interest (R):");
        int r = input.nextInt();

        // Prompting the user to enter the time period
        System.out.println("Enter Time Period in Years (T):");
        int t = input.nextInt();

        // Calculating Simple Interest
        int simpleInterest = (p * r * t) / 100;

        // Printing the result
        System.out.println("The Simple Interest is: " + simpleInterest);
        
        // Closing the scanner (optional but recommended)
        input.close();
    }
}
```

### Example Input and Output:

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
---

4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
5. Take 2 numbers as input and print the largest number.
6. Input currency in rupees and output in USD.
7. To calculate Fibonacci Series up to n numbers.
8. To find out whether the given String is Palindrome or not.
9. To find Armstrong Number between two given number.


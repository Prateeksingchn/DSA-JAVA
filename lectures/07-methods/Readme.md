## Functions and Methods in Java: Notes and Examples

### Index

1. [Introduction](#1-introduction)
2. [Methods](#2-methods)
3. [Syntax of a Method](#3-syntax-of-a-method)
4. [Returning Values](#4-returning-values)
5. [Returning a String](#5-returning-a-string)
6. [Parameter (String Function)](#6-parameter-string-function)
7. [Program to Swap Two Numbers](#7-program-to-swap-two-numbers)
8. [Internal Working of Swapping Program](#8-internal-working-of-swapping-program)
9. [Scope](#9-scope)
10. [Method Scope](#10-method-scope)
11. [Block Scope](#11-block-scope)
12. [Loop Scope](#12-loop-scope)
13. [Variable Arguments](#13-variable-arguments)
14. [Method Overloading](#14-method-overloading)
15. [Prime Number](#15-prime-number)
16. [Armstrong Number](#16-armstrong-number)
17. [Print All 3-Digit Armstrong Numbers](#17-print-all-3-digit-armstrong-numbers)

---

### 1. Introduction
Methods are blocks of code that perform specific tasks, making programs modular and reusable. They are called functions in other programming languages but are known as methods in Java.

**Example:**
```java
package com.prateek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q. Take input of 2 numbers and print the sum
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum: " + sum);

        // This is easy to do one time, but what if we want to do it 10 times?
        // We could print it 10 times, but for 100 times, it becomes a problem.
        // Therefore, we use Functions or Methods in Java.
        // Bundle this code in a method, and we can use it anywhere.
    }
}
```

[Back to Index](#index)

---

### 2. Methods
Methods in Java allow you to bundle code into a single unit, which can be called multiple times. A method is defined with the `static` keyword (if it belongs to the class) and a return type. The method can have parameters and a body where the code is written.

**Example:**
```java
package com.prateek;

public class Greeting {
    public static void main(String[] args) {
        greeting(); // It's gonna print "Hello world"
    }
    
    static void greeting() {
        System.out.println("Hello world");
    }
}
```

In this example, the `greeting` method prints "Hello world" to the console when called.

[Back to Index](#index)

---

### 3. Syntax of a Method
The basic syntax of a method includes the method signature and the method body. 

- **Method Signature**: This includes the method's name and parameter list.
- **Method Body**: This contains the code that defines what the method does.

**Example:**
```java
static void greeting() {
    System.out.println("Hello world");
}
```

Here, `static void greeting()` is the method signature, and `{ System.out.println("Hello world"); }` is the method body.

[Back to Index](#index)

---

### 4. Returning Values
Methods can return values. The return type of the method must match the type of value returned. If a method does not return a value, its return type is `void`.

**Example:**
```java
static int add(int a, int b) {
    return a + b;
}
```

In this example, the `add` method returns the sum of two integers.

[Back to Index](#index)

---

### 5. Returning a String
A method can return a string value.

**Example:**
```java
static String greet(String name) {
    return "Hello, " + name;
}
```

In this example, the `greet` method takes a `String` parameter `name` and returns a greeting message.

[Back to Index](#index)

---

### 6. Parameter (String Function)
Methods can accept parameters to process data and return results. Parameters allow methods to be more flexible and reusable.

**Example:**
```java
package com.prateek;

public class Greeting {
    public static void main(String[] args) {
        String message = greet("Prateek");
        System.out.println(message);
    }
    
    static String greet(String name) {
        return "Hello, " + name;
    }
}
```

In this example, the `greet` method takes a `String` parameter `name` and returns a personalized greeting message.

[Back to Index](#index)

---

### 7. Program to Swap Two Numbers
Methods can be used to perform tasks such as swapping two numbers.

**Example:**
```java
package com.prateek;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a + " " + b); // Output: 10 20
    }
    
    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // The change is only valid within this method scope.
    }
}
```

In this example, the `swap` method swaps the values of `num1` and `num2`, but the changes do not reflect outside the method scope because Java is pass-by-value.

[Back to Index](#index)

---

### 8. Internal Working of Swapping Program
The swapping of values only affects the local variables within the method scope. The original variables outside the method remain unchanged because Java passes arguments by value, meaning it passes a copy of the argument's value to the method.

**Example Explanation:**
When `swap(a, b)` is called, the values of `a` and `b` are copied into `num1` and `num2`. Any changes made to `num1` and `num2` do not affect `a` and `b`.

[Back to Index](#index)

---

### 9. Scope
Variables have different scopes in Java, including method scope, block scope, and loop scope.

- **Method Scope**: Variables declared within a method are only accessible within that method.
- **Block Scope**: Variables declared within a block (denoted by `{}`) are only accessible within that block.
- **Loop Scope**: Variables declared within a loop are only accessible within that loop.

**Example:**
```java
package com.prateek;

public class Scope {
    public static void main(String[] args) {
        int a = 10; 
        int b = 20; 
        String name = "Prateek";

        {
            a = 100; 
            System.out.println(a); // Output: 100
            int c = 99;
            name = "Ayush"; 
            System.out.println(name); // Output: Ayush
        }

        System.out.println(a); // Output: 100
        System.out.println(name); // Output: Ayush
    }
}
```

In this example, the variable `a` is accessible both inside and outside the block, while the variable `c` is only accessible inside the block.

[Back to Index](#index)

---

### 10. Method Scope
Variables declared within a method are only accessible within that method.

**Example:**
```java
static void exampleMethod() {
    int x = 10;
    System.out.println(x);
}
```

In this example, the variable `x` is only accessible within the `exampleMethod`.

[Back to Index](#index)

---

### 11. Block Scope
Variables declared within a block (denoted by `{}`) are only accessible within that block.

**Example:**
```java
{
    int y = 20;
    System.out.println(y);
}
```

In this example, the variable `y` is only accessible within the block.

[Back to Index](#index)

---

### 12. Loop Scope
Variables declared within a loop are only accessible within that loop.

**Example:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

In this example, the variable `i` is only accessible within the loop.

[Back to Index](#index)

---

### 13. Variable Arguments
Java allows methods to accept a variable number of arguments using the ellipsis (`...`). This makes it possible to pass multiple arguments of the same type to a method without defining an exact number of parameters.

**Example:**
```java
package com.prateek;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
        multiple(2, 5, "Prateek", "Ayush", "Manik");
    }
    
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    
    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
```

In this example,

 the `fun` method accepts a variable number of integer arguments, while the `multiple` method accepts two integers followed by a variable number of string arguments.

[Back to Index](#index)

---

### 14. Method Overloading
Method overloading allows multiple methods with the same name but different parameters to be defined in a class. The correct method is chosen based on the arguments passed during the method call.

**Example:**
```java
package com.prateek;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Prateek");
    }
    
    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }
    
    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
```

In this example, there are two `fun` methods: one that accepts an integer and another that accepts a string. The appropriate method is called based on the argument type.

[Back to Index](#index)

---

### 15. Prime Number
A method can be used to determine if a number is prime. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

**Example:**
```java
package com.prateek;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(19)); // Output: true
    }
    
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

In this example, the `isPrime` method checks if the given number `n` is prime by verifying if it has any divisors other than 1 and itself.

[Back to Index](#index)

---

### 16. Armstrong Number
An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

**Example:**
```java
package com.prateek;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // Output: true
    }
    
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }

        return sum == original;
    }
}
```

In this example, the `isArmstrong` method checks if the given number `n` is an Armstrong number by calculating the sum of the cubes of its digits and comparing it to the original number.

[Back to Index](#index)

---

### 17. Print All 3-Digit Armstrong Numbers
A method can be used to print all 3-digit Armstrong numbers by iterating through all 3-digit numbers and checking if each number is an Armstrong number.

**Example:**
```java
package com.prateek;

public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }

        return sum == original;
    }
}
```

In this example, the `main` method iterates through all 3-digit numbers and uses the `isArmstrong` method to print the Armstrong numbers.

[Back to Index](#index)

---

These notes provide an overview of functions and methods in Java, including examples and explanations for better understanding.
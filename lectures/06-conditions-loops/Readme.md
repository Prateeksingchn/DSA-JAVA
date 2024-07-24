
```markdown
# Conditionals and Loops

## Index
1. [Conditional Statements](#conditional-statements)
   - [If-Else Statement](#if-else-statement)
   - [Multiple If-Else Statement](#multiple-if-else-statement)
2. [Loops](#loops)
   - [For Loop](#for-loop)
   - [While Loop](#while-loop)
   - [Do-While Loop](#do-while-loop)
3. [Examples](#examples)
   - [Largest of Three Numbers](#largest-of-three-numbers)
   - [Alphabet Case Check](#alphabet-case-check)
   - [Fibonacci Numbers](#fibonacci-numbers)
   - [Counting Occurrence](#counting-occurrence)
   - [Reverse a Number](#reverse-a-number)
   - [Calculator Program](#calculator-program)

## Conditional Statements

### If-Else Statement
Used to check a condition, it evaluates to a Boolean value (True or False).

**Syntax:**
```java
if (boolean expression True or False) {
    // Body
} else {
    // Do this
}
```

**Example:**
```java
public class IfElse {
    public static void main(String[] args) {
        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
```

**Output:**
```
27400
```
[Back to Index](#index)

### Multiple If-Else Statement
Executes one condition from multiple statements.

**Syntax:**
```java
if (condition 1) {
    // code to be executed if condition 1 is true
} else if (condition 2) {
    // code to be executed if condition 2 is true
} else if (condition 3) {
    // code to be executed if condition 3 is true
} else {
    // code to be executed if all conditions are false
}
```

**Example:**
```java
public class MultipleIfElse {
    public static void main(String[] args) {
        int salary = 25400;
        if (salary <= 10000) {
            salary += 1000;
        } else if (salary <= 20000) {
            salary += 2000;
        } else {
            salary += 3000;
        }
        System.out.println(salary);
    }
}
```

**Output:**
```
28400
```
[Back to Index](#index)

## Loops

### For Loop
Loops are used to iterate a part of the program several times. A `for` loop is generally used when we know how many times the loop will iterate.

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // body
}
```

**Example: Print numbers from 1 to 5**
```java
public class forloop {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num += 1) {
            System.out.println(num);
        }
    }
}
```

**Output:**
```
1
2
3
4
5
```

**Example: Print numbers from 1 to n**
```java
import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num += 1) {
            System.out.print(num + " ");
        }
    }
}
```

**Input:**
```
6
```

**Output:**
```
1 2 3 4 5 6
```
[Back to Index](#index)

### While Loop
It is used when we don’t know how many times the loop will iterate.

**Syntax:**
```java
while (condition) {
    // code to be executed
    // increment/decrement
}
```

**Example:**
```java
public class whileloop {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }
    }
}
```

**Output:**
```
1
2
3
4
5
```
[Back to Index](#index)

### Do-While Loop
It is used when we want to execute our statement at least once. It is called an exit control loop because it checks the condition after execution of the statement.

**Syntax:**
```java
do {
    // code to be executed
    // update statement -> increment/decrement
} while (condition);
```

**Example:**
```java
public class doWhileloop {
    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
```

**Output:**
```
1
2
3
4
5
```

**Comparison: While Loop vs Do-While Loop**

| While Loop                          | Do-While Loop                         |
|-------------------------------------|---------------------------------------|
| Used when the number of iterations is not fixed | Used when we want to execute the statement at least once |
| Entry controlled loop               | Exit controlled loop                  |
| No semicolon required at the end of `while (condition)` | Semicolon required at the end of `while (condition)` |

[Back to Index](#index)

## Examples

### Largest of Three Numbers
Take 3 integer inputs from the keyboard and find the largest number among them.

**Approach 1:**
```java
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
```

**Approach 2:**
```java
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
```

**Approach 3: Using Math.max**
`Math` is a class present in the `java.lang` package, and `max` is a function present in it which takes two numbers as an argument and returns the maximum out of them.

```java
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
```

**Input:**
```
3 6 5
```

**Output:**
```
6
```
[Back to Index](#index)

### Alphabet Case Check
Take an input character from the keyboard and check whether it is an uppercase alphabet or a lowercase alphabet.

```java
import java.util.Scanner;
public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch > 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
```

**Input:**
```
a
```

**Output:**
```
Lowercase
```

**Input:**
```
Z
```

**Output:**
```
Uppercase
```
[Back to Index](#index)

### Fibonacci Numbers
A series of numbers in which each number (Fibonacci number) is the sum of the two preceding numbers. Ex: 0, 1, 1, 2, 3, 5, 8, 13…

Find the nth Fibonacci number. Given three inputs: a, b, n. `a` is the starting number of the Fibonacci series, `b` is the next number after `a`, and `n` is the number to find the nth Fibonacci number.

```java
import java.util.Scanner;
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
```

**Input:**
```
0 1 7
```

**Output:**
```
8
```
[Back to Index](#index

)

### Counting Occurrence
Count the occurrence of a digit in a number.

**Example:**
- `n = 33345`
- `digit = 3`
- The output should be 3.

```java
import java.util.Scanner;
public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int digit = in.nextInt();
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == digit) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
```

**Input:**
```
33345 3
```

**Output:**
```
3
```
[Back to Index](#index)

### Reverse a Number
Reverse a given number.

```java
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
```

**Input:**
```
345
```

**Output:**
```
543
```
[Back to Index](#index)

### Calculator Program
Take input from the user until the user does not press 'X' or 'x'. The user can perform basic arithmetic operations like +, -, *, /, %.

**Example:**
```java
import java.util.Scanner;
public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
    }
}
```

**Output:**
```
Enter the operator: +
Enter two numbers: 3 4
7
Enter the operator: X
```
[Back to Index](#index)
```

This `README.md` file contains an index at the top and links at the end of each section to navigate back to the index, making it easy to jump between different parts of the document. You can copy this content to your `README.md` file and upload it to your GitHub repository.
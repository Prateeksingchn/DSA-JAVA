
# Java Programs

## Index of Java Programs

### Basic Java Programs
1. [Area Of Circle Java Program](#1-area-of-circle-java-program)
2. [Area Of Triangle](#2-area-of-triangle)
3. [Area Of Rectangle Program](#3-area-of-rectangle-program)
4. [Area Of Isosceles Triangle](#area-of-isosceles-triangle)
5. [Area Of Parallelogram](#area-of-parallelogram)
6. [Area Of Rhombus](#area-of-rhombus)
7. [Area Of Equilateral Triangle](#area-of-equilateral-triangle)
8. [Perimeter Of Circle](#perimeter-of-circle)
9. [Perimeter Of Equilateral Triangle](#perimeter-of-equilateral-triangle)
10. [Perimeter Of Parallelogram](#perimeter-of-parallelogram)
11. [Perimeter Of Rectangle](#perimeter-of-rectangle)
12. [Perimeter Of Square](#perimeter-of-square)
13. [Perimeter Of Rhombus](#perimeter-of-rhombus)
14. [Volume Of Cone Java Program](#volume-of-cone-java-program)
15. [Volume Of Prism](#volume-of-prism)
16. [Volume Of Cylinder](#volume-of-cylinder)
17. [Volume Of Sphere](#volume-of-sphere)
18. [Volume Of Pyramid](#volume-of-pyramid)
19. [Curved Surface Area Of Cylinder](#curved-surface-area-of-cylinder)
20. [Total Surface Area Of Cube](#total-surface-area-of-cube)
21. [Fibonacci Series In Java Programs](#fibonacci-series-in-java-programs)
22. [Subtract the Product and Sum of Digits of an Integer](#subtract-the-product-and-sum-of-digits-of-an-integer)
23. [Input a number and print all the factors of that number](#input-a-number-and-print-all-the-factors-of-that-number)
24. [Take integer inputs till the user enters 0 and print the sum of all numbers](#take-integer-inputs-till-the-user-enters-0-and-print-the-sum-of-all-numbers)
25. [Take integer inputs till the user enters 0 and print the largest number from all](#take-integer-inputs-till-the-user-enters-0-and-print-the-largest-number-from-all)
26. [Addition Of Two Numbers](#addition-of-two-numbers)

### Intermediate Java Programs
1. [Factorial Program In Java](#factorial-program-in-java)
2. [Calculate Electricity Bill](#calculate-electricity-bill)
3. [Calculate Average Of N Numbers](#calculate-average-of-n-numbers)
4. [Calculate Discount Of Product](#calculate-discount-of-product)
5. [Calculate Distance Between Two Points](#calculate-distance-between-two-points)
6. [Calculate Commission Percentage](#calculate-commission-percentage)
7. [Power In Java](#power-in-java)
8. [Calculate Depreciation of Value](#calculate-depreciation-of-value)
9. [Calculate Batting Average](#calculate-batting-average)
10. [Calculate CGPA Java Program](#calculate-cgpa-java-program)
11. [Compound Interest Java Program](#compound-interest-java-program)
12. [Calculate Average Marks](#calculate-average-marks)
13. [Sum Of N Numbers](#sum-of-n-numbers)
14. [Armstrong Number In Java](#armstrong-number-in-java)
15. [Find Ncr & Npr](#find-ncr-npr)
16. [Reverse A String In Java](#reverse-a-string-in-java)
17. [Find if a number is palindrome or not](#find-if-a-number-is-palindrome-or-not)
18. [Future Investment Value](#future-investment-value)
19. [HCF Of Two Numbers Program](#hcf-of-two-numbers-program)
20. [LCM Of Two Numbers](#lcm-of-two-numbers)
21. [Java Program Vowel Or Consonant](#java-program-vowel-or-consonant)
22. [Perfect Number In Java](#perfect-number-in-java)
23. [Check Leap Year Or Not](#check-leap-year-or-not)
24. [Sum Of A Digits Of Number](#sum-of-a-digits-of-number)
25. [Kunal is allowed to go out with his friends only on the even days of a given month](#kunal-is-allowed-to-go-out-with-his-friends-only-on-the-even-days-of-a-given-month)
26. [Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.](#write-a-program-to-print-the-sum-of-negative-numbers-sum-of-positive-even-numbers-and-the-sum-of-positive-odd-numbers-from-a-list-of-numbers-n-entered-by-the-user-the-list-terminates-when-the-user-enters-a-zero)

---

## Solutions

### Basic Java Programs

# 1. Area Of Circle Java Program
    - Formula: Area = π * radius^2
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class AreaOfCircle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter radius");
            double radius = input.nextDouble();

            double pie = 3.14;
            
            double area = pie * (radius * radius);
            System.out.println("Area of circle " + area );
        }
    }
    ```
    - Example Input: 
        ```
        Enter radius
        5
        ```
    - Example Output: 
        ```
        Area of circle 78.5
        ```

# 2. Area Of Triangle
    - Formula: Area = 0.5 * base * height
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter base: 5
        Enter height: 10
        ```
    - Example Output: 
        ```
        Area of triangle 25.0
        ```

# 3. Area Of Rectangle Program
    - Formula: Area = length * width
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter length: 4
        Enter width: 6
        ```
    - Example Output: 
        ```
        Area of rectangle 24.0
        ```

4. **Area Of Isosceles Triangle**
    - Formula: Area = 0.5 * base * height
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter base: 4
        Enter height: 5
        ```
    - Example Output: 
        ```
        Area of isosceles triangle 10.0
        ```

5. **Area Of Parallelogram**
    - Formula: Area = base * height
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class AreaOfParallelogram {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Height");
            double height = input.nextDouble();

            System.out.println("Enter Base");
            double base = input.nextDouble();

            double area = height * base;
            System.out.println("area " + area);
        }
    }
    ```
    - Example Input: 
        ```
        Enter Height
        4
        Enter Base
        6
        ```
    - Example Output: 
        ```
        area 24.0
        ```

6. **Area Of Rhombus**
    - Formula: Area = 0.5 * d1 * d2
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter diagonal 1: 5
        Enter diagonal 2: 6
        ```
    - Example Output: 
        ```
        Area of rhombus 15.0
        ```

7. **Area Of Equilateral Triangle**
    - Formula: Area = (sqrt(3)/4) * side^2
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter side: 4
        ```
    - Example Output: 
        ```
        Area of equilateral triangle 6.93
        ```

8. **Perimeter Of Circle**
    - Formula: Perimeter = 2 * π * radius
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter radius: 5
        ```
    - Example Output: 
        ```
        Perimeter of circle 31.4
        ```

9. **Perimeter Of Equilateral Triangle**
    - Formula: Perimeter = 3 * side
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter side: 4
        ```
    - Example Output: 
        ```
        Perimeter of equilateral triangle 12.0
        ```

10. **Perimeter Of Parallelogram**
    - Formula: Perimeter = 2 * (base + height)
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter base: 5
        Enter height: 7
        ```
    - Example Output: 
        ```
        Perimeter of parallelogram 24.0


        ```

11. **Perimeter Of Rectangle**
    - Formula: Perimeter = 2 * (length + width)
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter length: 4
        Enter width: 6
        ```
    - Example Output: 
        ```
        Perimeter of rectangle 20.0
        ```

12. **Perimeter Of Square**
    - Formula: Perimeter = 4 * side
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter side: 5
        ```
    - Example Output: 
        ```
        Perimeter of square 20.0
        ```

13. **Perimeter Of Rhombus**
    - Formula: Perimeter = 4 * side
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter side: 5
        ```
    - Example Output: 
        ```
        Perimeter of rhombus 20.0
        ```

14. **Volume Of Cone Java Program**
    - Formula: Volume = (1/3) * π * radius^2 * height
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter radius: 3
        Enter height: 7
        ```
    - Example Output: 
        ```
        Volume of cone 65.97
        ```

15. **Volume Of Prism**
    - Formula: Volume = base_area * height
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter base area: 5
        Enter height: 10
        ```
    - Example Output: 
        ```
        Volume of prism 50.0
        ```

16. **Volume Of Cylinder**
    - Formula: Volume = π * radius^2 * height
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class VolumeOfCylinder {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double pie = 3.14;

            System.out.println("Enter cylinder radius: ");
            double radius = input.nextDouble();

            System.out.println("Enter cylinder height: ");
            double height = input.nextDouble();

            double volume = pie * (radius * radius) * height;

            System.out.println("volume: " + volume);
        }
    }
    ```
    - Example Input: 
        ```
        Enter cylinder radius: 
        4
        Enter cylinder height: 
        10
        ```
    - Example Output: 
        ```
        volume: 502.4
        ```

17. **Volume Of Sphere**
    - Formula: Volume = (4/3) * π * radius^3
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter radius: 5
        ```
    - Example Output: 
        ```
        Volume of sphere 523.6
        ```

18. **Volume Of Pyramid**
    - Formula: Volume = (1/3) * base_area * height
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter base area: 6
        Enter height: 9
        ```
    - Example Output: 
        ```
        Volume of pyramid 18.0
        ```

19. **Curved Surface Area Of Cylinder**
    - Formula: CSA = 2 * π * radius * height
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter radius: 4
        Enter height: 7
        ```
    - Example Output: 
        ```
        Curved surface area of cylinder 175.84
        ```

20. **Total Surface Area Of Cube**
    - Formula: TSA = 6 * side^2
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class TotalSurfaceAreaOfCube {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter length of one of the cube's sides");
            double a = input.nextDouble();

            double TotalSurfaceAreaOfCube = 6 * (a * a);

            System.out.println("TotalSurfaceAreaOfCube: " + TotalSurfaceAreaOfCube);
        }
    }
    ```
    - Example Input: 
        ```
        Enter length of one of the cube's sides
        5
        ```
    - Example Output: 
        ```
        TotalSurfaceAreaOfCube: 150.0
        ```

21. **Fibonacci Series In Java Programs**
    - Logic: Print Fibonacci series up to n terms
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class Fibo {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a = 0;
            int b = 1;
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
    - Example Input: 
        ```
        7
        ```
    - Example Output: 
        ```
        13
        ```

22. **Subtract the Product and Sum of Digits of an Integer**
    - Logic: Calculate the product and sum of digits, then subtract the sum from the product
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter number: 234
        ```
    - Example Output: 
        ```
        Result: 15
        ```

23. **Input a number and print all the factors of that number**
    - Logic: Use loops to find all factors
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter number: 28
        ```
    - Example Output: 
        ```
        Factors: 1, 2, 4, 7, 14, 28
        ```

24. **Take integer inputs till the user enters 0 and print the sum of all numbers**
    - Logic: Use a while loop to read inputs and sum them
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter numbers: 5, 3, 8, 0
        ```
    - Example Output: 
        ```
        Sum: 16
        ```

25. **Take integer inputs till the user enters 0 and print the largest number from all**
    - Logic: Use a while loop to read inputs and find the largest number
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter numbers: 5, 3, 8, 0
        ```
    - Example Output: 
        ```
        Largest number: 8
        ```

26. **Addition Of Two Numbers**
    - Logic: Add two integers
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter first number: 4
        Enter second number: 6
        ```
    - Example Output: 
        ```
        Sum: 10
        ```

### Intermediate Java Programs

1. **Factorial Program In Java**
    - Logic: Calculate factorial using a loop or recursion
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter number: 5
        ```
    - Example Output: 
        ```
        Factorial: 120
        ```

2. **Calculate Electricity Bill**
    - Logic: Calculate the electricity bill based on units consumed
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
    - Example Input: 
        ```
        Enter the number of units consumed: 150
        ```
    - Example Output: 
        ```
        Electricity Bill Calculator
        ---------------------------
        Units consumed: 150
        Rate per unit: $0.12
        Total bill: $18.00
        ```

3. **Calculate Average Of N Numbers**
    - Logic: Calculate the average using the sum and count of numbers
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter numbers: 4, 6, 8
        ```
    - Example Output: 
        ```
        Average: 6.0
        ```

4. **Calculate Discount Of Product**
    - Logic: Calculate discount based on original price and discount rate


    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter original price: 100
        Enter discount rate: 10
        ```
    - Example Output: 
        ```
        Discounted price: 90.0
        ```

5. **Calculate Distance Between Two Points**
    - Logic: Use the distance formula sqrt((x2-x1)^2 + (y2-y1)^2)
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class DistanceBetweenPoints {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter x1");
            double x1 = input.nextDouble();

            System.out.println("Enter y1");
            double y1 = input.nextDouble();

            System.out.println("Enter x2");
            double x2 = input.nextDouble();

            System.out.println("Enter y2");
            double y2 = input.nextDouble();

            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

            System.out.println("distance between points " + distance);
        }
    }
    ```
    - Example Input: 
        ```
        Enter x1: 3
        Enter y1: 4
        Enter x2: 7
        Enter y2: 1
        ```
    - Example Output: 
        ```
        Distance between points 5.0
        ```

6. **Calculate Commission Percentage**
    - Logic: Calculate commission based on sales amount and commission rate
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter sales amount: 1000
        Enter commission rate: 5
        ```
    - Example Output: 
        ```
        Commission: 50.0
        ```

7. **Power In Java**
    - Logic: Use Math.pow(base, exponent) to calculate power
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class Power {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter base");
            double base = input.nextDouble();

            System.out.println("Enter exponent");
            double exponent = input.nextDouble();

            double power = Math.pow(base, exponent);

            System.out.println("Result " + power);
        }
    }
    ```
    - Example Input: 
        ```
        Enter base: 2
        Enter exponent: 3
        ```
    - Example Output: 
        ```
        Result 8.0
        ```

8. **Calculate Depreciation of Value**
    - Logic: Calculate depreciation based on initial value, depreciation rate, and time period
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter initial value: 1000
        Enter depreciation rate: 10
        Enter time period: 5
        ```
    - Example Output: 
        ```
        Depreciated value: 590.49
        ```

9. **Calculate Batting Average**
    - Logic: Batting average = total runs scored / number of times out
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter total runs scored: 500
        Enter number of times out: 10
        ```
    - Example Output: 
        ```
        Batting average: 50.0
        ```

10. **Calculate CGPA Java Program**
    - Logic: Calculate CGPA based on total grade points and total subjects
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter total grade points: 36
        Enter total subjects: 6
        ```
    - Example Output: 
        ```
        CGPA: 6.0
        ```

11. **Compound Interest Java Program**
    - Formula: CI = P * (1 + r/n)^(nt)
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class CompoundInterest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter principal");
            double principal = input.nextDouble();

            System.out.println("Enter rate");
            double rate = input.nextDouble();

            System.out.println("Enter time");
            double time = input.nextDouble();

            System.out.println("Enter number of times interest is compounded per unit time");
            double n = input.nextDouble();

            double Amount = principal * Math.pow((1 + rate / n), (n * time));

            double CI = Amount - principal;

            System.out.println("Compound Interest: " + CI);
        }
    }
    ```
    - Example Input: 
        ```
        Enter principal: 1000
        Enter rate: 0.05
        Enter time: 2
        Enter number of times interest is compounded per unit time: 4
        ```
    - Example Output: 
        ```
        Compound Interest: 104.714
        ```

12. **Calculate Average Marks**
    - Logic: Calculate average marks from a list of marks
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter marks: 85, 90, 78
        ```
    - Example Output: 
        ```
        Average marks: 84.33
        ```

13. **Sum Of N Numbers**
    - Logic: Calculate the sum of first N natural numbers
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter N: 5
        ```
    - Example Output: 
        ```
        Sum: 15
        ```

14. **Armstrong Number In Java**
    - Logic: Check if a number is an Armstrong number
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter number: 153
        ```
    - Example Output: 
        ```
        153 is an Armstrong number
        ```

15. **Find Ncr & Npr**
    - Logic: Use factorial to calculate Ncr and Npr
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class NcrNpr {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter value of n");
            int n = input.nextInt();

            System.out.println("Enter value of r");
            int r = input.nextInt();

            int ncr = fact(n) / (fact(r) * fact(n - r));
            int npr = fact(n) / fact(n - r);

            System.out.println("NCR " + ncr);
            System.out.println("NPR " + npr);
        }

        static int fact(int num) {
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            return fact;
        }
    }
    ```
    - Example Input: 
        ```
        Enter value of n: 5
        Enter value of r: 2
        ```
    - Example Output: 
        ```
        NCR 10
        NPR 20
        ```

16. **Reverse A String In Java**
    - Logic: Reverse a string using StringBuilder or loops
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class ReverseString {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter string to reverse: ");
            String original = input.nextLine();

            String reverse = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                reverse = reverse + original.charAt(i);
            }

            System.out.println("Reversed string: " + reverse);
        }
    }
    ```
    - Example Input: 
        ```
        Enter string to reverse: 
        hello
        ```
    - Example Output: 
        ```
        Reversed string: olleh
        ```

17. **Find if a number is palindrome or not**
    - Logic: Check if a number reads the same backward as forward
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class PalindromeNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter number: ");
            int num = input.nextInt();

            int originalNum = num;
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a palindrome number.");
            } else {
                System.out.println(originalNum + " is not a palindrome number.");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter number: 
        121
        ```
    - Example Output: 
        ```
        121 is a palindrome number.
        ```

18. **Future Investment Value**
    - Formula: FIV = P * (1 + r/n)^(nt)
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter principal: 1000
        Enter rate: 0.05
        Enter time: 10
        Enter number of times interest is

 compounded per unit time: 4
        ```
    - Example Output: 
        ```
        Future Investment Value: 1647.009
        ```

19. **HCF Of Two Numbers Program**
    - Logic: Use Euclidean algorithm to find HCF
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class HCF {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            while (num1 != num2) {
                if (num1 > num2) {
                    num1 = num1 - num2;
                } else {
                    num2 = num2 - num1;
                }
            }
            System.out.println("HCF: " + num1);
        }
    }
    ```
    - Example Input: 
        ```
        Enter first number: 
        24
        Enter second number: 
        36
        ```
    - Example Output: 
        ```
        HCF: 12
        ```

20. **LCM Of Two Numbers**
    - Logic: Use the relation LCM * HCF = product of the numbers
    ```java
    // Your code here
    ```
    - Example Input: 
        ```
        Enter first number: 12
        Enter second number: 18
        ```
    - Example Output: 
        ```
        LCM: 36
        ```

21. **Java Program Vowel Or Consonant**
    - Logic: Check if a character is a vowel or consonant
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class VowelOrConsonant {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a character: ");
            char ch = input.next().charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter a character: 
        a
        ```
    - Example Output: 
        ```
        a is a vowel
        ```

22. **Perfect Number In Java**
    - Logic: Check if a number is equal to the sum of its proper divisors
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class PerfectNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = input.nextInt();
            int sum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num + " is a perfect number.");
            } else {
                System.out.println(num + " is not a perfect number.");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        6
        ```
    - Example Output: 
        ```
        6 is a perfect number.
        ```

23. **Check Leap Year Or Not**
    - Logic: Check if a year is divisible by 4, but not by 100 unless also by 400
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class LeapYear {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter year: ");
            int year = input.nextInt();

            boolean isLeap = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = true;
                    }
                } else {
                    isLeap = true;
                }
            }

            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter year: 
        2020
        ```
    - Example Output: 
        ```
        2020 is a leap year.
        ```

24. **Future Investment Value**
    - Formula: FIV = P * (1 + r/n)^(nt)
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class FutureInvestmentValue {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter principal: ");
            double principal = input.nextDouble();

            System.out.println("Enter rate: ");
            double rate = input.nextDouble();

            System.out.println("Enter time: ");
            double time = input.nextDouble();

            System.out.println("Enter number of times interest is compounded per unit time: ");
            double n = input.nextDouble();

            double Amount = principal * Math.pow((1 + rate / n), (n * time));

            System.out.println("Future Investment Value: " + Amount);
        }
    }
    ```
    - Example Input: 
        ```
        Enter principal: 1000
        Enter rate: 0.05
        Enter time: 10
        Enter number of times interest is compounded per unit time: 4
        ```
    - Example Output: 
        ```
        Future Investment Value: 1647.009
        ```

25. **Java Program to check whether the number is even or odd**
    - Logic: Use modulus operator to check if a number is even or odd
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class EvenOrOdd {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        7
        ```
    - Example Output: 
        ```
        7 is an odd number.
        ```

26. **Java Program to calculate marks to grades**
    - Logic: Convert marks into grades based on predefined ranges
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class MarksToGrades {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter marks: ");
            int marks = input.nextInt();
            char grade;

            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Grade: " + grade);
        }
    }
    ```
    - Example Input: 
        ```
        Enter marks: 
        85
        ```
    - Example Output: 
        ```
        Grade: B
        ```

27. **Java Program to Display Prime Numbers Between Intervals**
    - Logic: Check each number in the interval to see if it is prime
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class PrimeNumbersInInterval {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the lower bound: ");
            int lower = input.nextInt();

            System.out.println("Enter the upper bound: ");
            int upper = input.nextInt();

            System.out.println("Prime numbers between " + lower + " and " + upper + " are: ");

            for (int i = lower; i <= upper; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    ```
    - Example Input: 
        ```
        Enter the lower bound: 
        10
        Enter the upper bound: 
        20
        ```
    - Example Output: 
        ```
        Prime numbers between 10 and 20 are: 
        11
        13
        17
        19
        ```

28. **Java Program to Display Armstrong Number Between Intervals**
    - Logic: Check each number in the interval to see if it is an Armstrong number
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class ArmstrongNumbersInInterval {
        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.println("Enter the lower bound: ");
            int lower = input.nextInt();

            System.out.println("Enter the upper bound: ");
            int upper = input.nextInt();

            System.out.println("Armstrong numbers between " + lower + " and " + upper + " are: ");

            for (int i = lower; i <= upper; i++) {
                if (isArmstrong(i)) {
                    System.out.println(i);
                }
            }
        }

        public static boolean isArmstrong(int num) {
            int originalNum = num;
            int result = 0;
            int n = 0;

            for (; originalNum != 0; originalNum /= 10, ++n);

            originalNum = num;

            for (; originalNum != 0; originalNum /= 10) {
                int remainder = originalNum % 10;
                result += Math.pow(remainder, n);
            }

            return result == num;
        }
    }
    ```
    - Example Input: 
        ```
        Enter the lower bound: 
        100
        Enter the upper bound: 
        1000
        ```
    - Example Output: 
        ```
        Armstrong numbers between 100 and 1000 are: 
        153
        370
        371
        407
        ```

29. **Sum Of Digits Program**
    - Logic: Calculate the sum of the digits of a number
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class SumOfDigits {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = input.nextInt();
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            System.out.println("Sum of digits: " + sum);
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        123
        ```
    - Example Output: 
        ```
        Sum of digits: 6
        ```

30. **Java Program to Reverse a Number**
    - Logic: Reverse the digits of a number
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class ReverseNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = input.nextInt();
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            System.out.println("Reversed number: " + reversed);
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        123
        ```
    - Example Output: 
        ```
        Reversed number: 321
        ```

31. **Power of a Number**
    - Logic: Use a loop to calculate power instead of Math.pow()
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class PowerOfNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter base: ");
            int base = input.nextInt();

            System.out.println("Enter exponent: ");
            int exponent = input.nextInt();

            long result = 1;

            for (int i = 0; i < exponent; i++) {
                result *= base;
            }

            System.out.println("Result: " + result);
        }
    }
    ```
    - Example Input: 
        ```
        Enter base: 
        2
        Enter exponent: 
        3
        ```
    - Example Output: 
        ```
        Result: 8
        ```

32. **Prime Number Program**
    - Logic: Check if a number is prime
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        7
        ```
    - Example Output: 
        ```
        7 is a prime number.
        ```

33. **Check If a Number is Positive or Negative**
    - Logic: Use if-else to determine if a number is positive or negative
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class PositiveOrNegative {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            double num = input.nextDouble();

            if (num > 0) {
                System.out.println(num + " is a positive number.");
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println(num + " is neither positive nor negative.");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        -5
        ```
    - Example Output: 
        ```
        -5 is a negative number.
        ```

34. **Find Factorial Of A Number**
    - Logic: Calculate the factorial of a number using a loop
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class Factorial {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = input.nextInt();
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial: " + factorial);
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        5
        ```
    - Example Output: 
        ```
        Factorial: 120
        ```

35. **Check Armstrong Number**
    - Logic: Check if a number is an Armstrong number
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class ArmstrongNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            int originalNum = num;
            int result = 0;
            int n = 0;

            for (; originalNum != 0; originalNum /= 10, ++n);

            originalNum = num;

            for (; originalNum != 0; originalNum /= 10) {
                int remainder = originalNum % 10;
                result += Math.pow(remainder, n);
            }

            if (result == num) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        153
        ```
    - Example Output: 
        ```
        153 is an Armstrong number.
        ```

36. **Check if a Number is Prime or Not**
    - Logic: Check if a number is prime
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class CheckPrime {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
    ```
    - Example Input: 
        ```
        Enter a number: 
        29
        ```
    - Example Output: 
        ```
        29 is a prime number.
        ```

37. **Calculate Simple Interest**
    - Formula: SI = (P * R * T) / 100
    ```java
    package com.prateek;

    import java.util.Scanner;

    public class SimpleInterest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter principal: ");
            double principal = input.nextDouble();

            System.out.println("Enter rate: ");
            double rate = input.nextDouble();

            System.out.println("Enter time: ");
            double time = input.nextDouble();

            double SI = (principal * rate * time) / 100;

            System.out.println("Simple Interest: " + SI);
        }
    }
    ```
    - Example Input: 
        ```
        Enter principal: 
        1000
        Enter rate:
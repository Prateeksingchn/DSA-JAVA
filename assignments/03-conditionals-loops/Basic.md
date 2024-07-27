## Write Java Programs for the Following:

### Basic Java Programs
1. [Area Of Circle Java Program](#1-area-of-circle-java-program) ✅
2. [Area Of Triangle](#2-area-of-triangle) 🟩
3. [Area Of Rectangle Program](#3-area-of-rectangle-program) 🟩
4. [Area Of Isosceles Triangle](#4-area-of-isosceles-triangle) 🟩
5. [Area Of Parallelogram](#5-area-of-parallelogram) ✅
6. [Area Of Rhombus](#6-area-of-rhombus) 🟩
7. [Area Of Equilateral Triangle](#7-area-of-equilateral-triangle) 🟩
8. [Perimeter Of Circle](#8-perimeter-of-circle) 🟩
9. [Perimeter Of Equilateral Triangle](#9-perimeter-of-equilateral-triangle) 🟩
10. [Perimeter Of Parallelogram](#10-perimeter-of-parallelogram) 🟩
11. [Perimeter Of Rectangle](#11-perimeter-of-rectangle) 🟩
12. [Perimeter Of Square](#12-perimeter-of-square) 🟩
13. [Perimeter Of Rhombus](#13-perimeter-of-rhombus) 🟩
14. [Volume Of Cone Java Program](#14-volume-of-cone-java-program) 🟩
15. [Volume Of Prism](#15-volume-of-prism) 🟩
16. [Volume Of Cylinder](#16-volume-of-cylinder) ✅
17. [Volume Of Sphere](#17-volume-of-sphere) 🟩
18. [Volume Of Pyramid](#18-volume-of-pyramid) 🟩
19. [Curved Surface Area Of Cylinder](#19-curved-surface-area-of-cylinder) 🟩
20. [Total Surface Area Of Cube](#20-total-surface-area-of-cube) ✅
21. [Fibonacci Series In Java Programs](#21-fibonacci-series-in-java-programs) ✅
22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/) ✅
23. [Input a number and print all the factors of that number](#23-input-a-number-and-print-all-the-factors-of-that-number) 🟩
24. [Take integer inputs till the user enters 0 and print the sum of all numbers](#24-take-integer-inputs-till-the-user-enters-0-and-print-the-sum-of-all-numbers) 🟩
25. [Take integer inputs till the user enters 0 and print the largest number from all](#25-take-integer-inputs-till-the-user-enters-0-and-print-the-largest-number-from-all) 🟩
26. [Addition Of Two Numbers](#26-addition-of-two-numbers) 🟩

---

### 1. Area Of Circle Java Program

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
[Back to Top](#write-java-programs-for-the-following)

---

### 2. Area Of Triangle

**Formula:**
\[ \text{Area} = \frac{1}{2} \times \text{base} \times \text{height} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 3. Area Of Rectangle Program

**Formula:**
\[ \text{Area} = \text{length} \times \text{width} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 4. Area Of Isosceles Triangle

**Formula:**
\[ \text{Area} = \frac{1}{2} \times \text{base} \times \text{height} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 5. Area Of Parallelogram

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
    5
    Enter Base
    10
    ```
- Example Output:
    ```
    area 50.0
    ```
[Back to Top](#write-java-programs-for-the-following)

---

### 6. Area Of Rhombus

**Formula:**
\[ \text{Area} = \frac{1}{2} \times \text{diagonal1} \times \text{diagonal2} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 7. Area Of Equilateral Triangle

**Formula:**
\[ \text{Area} = \frac{\sqrt{3}}{4} \times \text{side}^2 \]

[Back to Top](#write-java-programs-for-the-following)

---

### 8. Perimeter Of Circle

**Formula:**
\[ \text{Perimeter} = 2 \times \pi \times \text{radius} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 9. Perimeter Of Equilateral Triangle

**Formula:**
\[ \text{Perimeter} = 3 \times \text{side} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 10. Perimeter Of Parallelogram

**Formula:**
\[ \text{Perimeter} = 2 \times (\text{base} + \text{side}) \]

[Back to Top](#write-java-programs-for-the-following)

---

### 11. Perimeter Of Rectangle

**Formula:**
\[ \text{Perimeter} = 2 \times (\text{length} + \text{width}) \]

[Back to Top](#write-java-programs-for-the-following)

---

### 12. Perimeter Of Square

**Formula:**
\[ \text{Perimeter} = 4 \times \text{side} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 13. Perimeter Of Rhombus

**Formula:**
\[ \text{Perimeter} = 4 \times \text{side} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 14. Volume Of Cone Java Program

**Formula:**

\[ \text{Volume} = \frac{1}{3} \times \pi \times \text{radius}^2 \times \text{height} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 15. Volume Of Prism

**Formula:**
\[ \text{Volume} = \text{base area} \times \text{height} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 16. Volume Of Cylinder

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
    5
    Enter cylinder height:
    10
    ```
- Example Output:
    ```
    volume: 785.0
    ```
[Back to Top](#write-java-programs-for-the-following)

---

### 17. Volume Of Sphere

**Formula:**
\[ \text{Volume} = \frac{4}{3} \times \pi \times \text{radius}^3 \]

[Back to Top](#write-java-programs-for-the-following)

---

### 18. Volume Of Pyramid

**Formula:**
\[ \text{Volume} = \frac{1}{3} \times \text{base area} \times \text{height} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 19. Curved Surface Area Of Cylinder

**Formula:**
\[ \text{Curved Surface Area} = 2 \times \pi \times \text{radius} \times \text{height} \]

[Back to Top](#write-java-programs-for-the-following)

---

### 20. Total Surface Area Of Cube

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
[Back to Top](#write-java-programs-for-the-following)

---

### 21. Fibonacci Series In Java Programs

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
[Back to Top](#write-java-programs-for-the-following)

---

### 22. Subtract the Product and Sum of Digits of an Integer

```java
package com.prateek;

import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();

        int product = 1;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            product = product * rem;
            sum = sum + rem;
        }

        int difference = product - sum;
        System.out.println("difference: " + difference);
    }
}
```
- Example Input:
    ```
    Enter the number:
    234
    ```
- Example Output:
    ```
    difference: 15
    ```
[Back to Top](#write-java-programs-for-the-following)

---

### 23. Input a number and print all the factors of that number

**Hint:**
- Use a loop to iterate through numbers from 1 to the input number and check if each number is a factor.

[Back to Top](#write-java-programs-for-the-following)

---

### 24. Take integer inputs till the user enters 0 and print the sum of all numbers

**Hint:**
- Use a while loop to take inputs and keep a running total of the sum.

[Back to Top](#write-java-programs-for-the-following)

---

### 25. Take integer inputs till the user enters 0 and print the largest number from all

**Hint:**
- Use a while loop to take inputs and keep track of the largest number encountered.

[Back to Top](#write-java-programs-for-the-following)

---

### 26. Addition Of Two Numbers

**Hint:**
- Take two integer inputs and print their sum.

[Back to Top](#write-java-programs-for-the-following)
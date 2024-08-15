
# Table of Contents

1. [Introduction to Arrays](#introduction-to-arrays)
2. [Why We Need Arrays](#why-we-need-arrays)
3. [What is an Array?](#what-is-an-array)
4. [Syntax of an Array](#syntax-of-an-array)
5. [Dynamic Memory Allocation](#dynamic-memory-allocation)
6. [Index of an Array](#index-of-an-array)
7. [Array Input](#array-input)
8. [Multidimensional Array](#multidimensional-array)
9. [2D Array](#2d-array)
10. [Dynamic Array](#dynamic-array)
11. [ArrayList](#arraylist)
12. [Swapping Elements in an Array](#swapping-elements-in-an-array)
13. [Reversing an Array](#reversing-an-array)
14. [Finding Maximum in an Array](#finding-maximum-in-an-array)

---

## 1. Introduction to Arrays

Arrays are fundamental data structures that store multiple values of the same type in a contiguous block of memory. Instead of creating individual variables for each data point, arrays allow efficient management of large datasets.

---

## 2. Why We Need Arrays

Arrays solve the problem of handling multiple data points by storing them in a single variable. This makes it easier to perform operations on the data and reduces the complexity of the code.

**Example:**
- Instead of creating multiple variables for storing roll numbers, you can use an array to store them.

```java
// Storing individual roll numbers
int rn1 = 23;
int rn2 = 16;
int rn3 = 26;

// Using an array to store roll numbers
int[] rn = {23, 16, 26};
```

---

## 3. What is an Array?

An array is a collection of elements that are of the same data type, and they are stored in contiguous memory locations. Arrays are fixed in size, meaning the number of elements an array can hold is defined when the array is created.

---

## 4. Syntax of an Array

The syntax for declaring an array in Java is as follows:

```java
datatype[] variable_name = new datatype[size];
```

**Notes:**
- **Declaration**: This only declares the array and doesn't allocate memory for elements.
- **Initialization**: Allocates memory and can assign initial values to the array elements.

**Example:**

```java
// Declaration
int[] ros;

// Initialization
ros = new int[5];

// Direct declaration and initialization
int[] rn2 = {23, 12, 34, 46, 15};
```

*Note:* When you declare an array, the memory is allocated in the heap, and all elements are initialized to their default values (e.g., 0 for int, null for objects).

---

## 5. Dynamic Memory Allocation

Dynamic memory allocation allows you to allocate memory at runtime rather than at compile time. This is particularly useful for creating arrays whose size is determined during the execution of a program.

**Example:**

```java
// Array of integers with dynamic memory allocation
int[] ros = new int[5];

// Array of strings with dynamic memory allocation
String[] arr = new String[4];
```

*Note:* You cannot assign null to primitive data types (e.g., int, float), but you can assign null to objects (e.g., String).

---

## 6. Index of an Array

The index of an array refers to the position of an element within the array. The index starts at 0 for the first element and increments by 1 for each subsequent element.

**Example:**

```java
int[] arr = {23, 45, 233, 543, 3};
System.out.println(arr[3]); // Output: 543
```

*Note:* Accessing an index outside the array's bounds (e.g., arr[5] in the above example) will result in an `IndexOutOfBoundsException`.

---

## 7. Array Input

You can take input for array elements from the user and store them in the array using loops.

**Example:**

```java
import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        // Input using a for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Printing array elements
        System.out.println(Arrays.toString(arr));
    }
}
```

*Note:* Loops are useful when dealing with large arrays where manual entry for each element would be inefficient.

---

## 8. Multidimensional Array

A multidimensional array is an array of arrays. In Java, the most common multidimensional array is the 2D array.

**Example:**

```java
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

*Note:* Each element of a multidimensional array is itself an array.

---

Here's the full code with the corresponding notes for the 2D array:

---

## 9. 2D Array

A 2D array is a type of multidimensional array where data is stored in rows and columns.

### Example:

```java
int[][] arr = new int[3][3];
```

This declaration creates a 2D array with 3 rows and 3 columns.

### Key Points:

- **Representation**: 2D arrays are often used to represent matrices, grids, or tables.
- **Row Count**: `arr.length` gives the number of rows in the 2D array.
- **Column Count**: `arr[row].length` gives the number of columns in a specific row.

### Input in a 2D Array:

```java
for (int row = 0; row < arr.length; row++) {
    for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = input.nextInt();
    }
}
```

This loop structure allows for user input to populate the 2D array.

### Output of a 2D Array:

#### 1st Way:

```java
for (int row = 0; row < arr.length; row++) {
    for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
    }
    System.out.println();  // Moves to the next line after printing each row
}
```

*Example Output:*

```
1 2 3
4 5 6
7 8 9
```

#### 2nd Way:

```java
for (int row = 0; row < arr.length; row++) {
    System.out.println(Arrays.toString(arr[row]));
}
```

*Example Output:*

```
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
```

#### 3rd Way (Enhanced For Loop):

```java
for (int[] a : arr) {
    System.out.println(Arrays.toString(a));
}
```

*Example Output:*

```
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
```

*Note:* The enhanced for loop simplifies the process of iterating through the elements of the 2D array, making the code more readable.

---

### Full Code:

```java
package com.prateek;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        Scanner input = new Scanner(System.in);

        // This is how you denote 2-D Arrays
        int[][] arr = new int[3][3];

        System.out.println(arr.length); // Number of rows

        // Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        // Output (1st way to Print)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " "); // Prints each element
            }
            System.out.println(); // Moves to the next line after printing each row
        }

        // Output (2nd way to Print)
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row])); // Prints each row as a string
        }

        // Output (3rd way to Print using Enhanced For Loop)
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a)); // Prints each row as a string using enhanced for loop
        }
    }
}
```
[Back to Index](#index)

---

## 10. Dynamic Array

A dynamic array allows resizing during runtime. In Java, the `ArrayList` class is used to implement dynamic arrays.

**Example:**

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>(5);
```

*Note:* `ArrayList` provides methods to add, remove, and access elements dynamically.

---

## 11. ArrayList

The `ArrayList` class in Java implements a dynamic array that can grow and shrink as needed.

**Example:**

```java
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // Accessing elements in the ArrayList
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
```

*Note:* Unlike arrays, `ArrayList` can grow and shrink in size dynamically.

---

## 12. Swapping Elements in an Array

Swapping is the process of exchanging the positions of two elements in an array.

**Example:**

```java
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        swap(arr, 1, 3); // Output: [1, 9, 23, 3, 18]
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
```

*Note:* Swapping is commonly used in algorithms like sorting.

---

## 13. Reversing an Array

Reversing an array involves flipping the array elements so that the last element becomes the first, the second last becomes the second, and so on.

**Example:**

```java
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        reverse(arr); // Output: [18, 9, 23, 3, 1]
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
```

---

## 14. Finding Maximum in an Array

Finding the maximum value in an array involves iterating through the array and comparing each element to find the highest value.

**Example:**

```java
public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(maxRange(arr, 1, 3));  // Output: 23
    }

    static int maxRange(int[] arr, int start, int end) {
        if (end < start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
```

*Note:* The function `maxRange



## Programming Concepts Index

1. [Understanding Your First Java Program](#first-java-program)
2. [Primitive Data Types in Java](#primitive-data-types)
3. [Literals and Identifiers](#literals-and-identifiers-in-java)
4. [Conditions for Type Conversion](#conditions-for-type-conversion-in-java)
5. [Rules of Type Promotion in Java](#rules-of-type-promotion-in-java)

---


### First Java Program

# Structure of Java File

“Source code that we write will be saved using extension .java” 
- Every thing written in .java file must be in classes or we can say that 
  every file having .java extension is a class 
- A class with same name as file name must be present in .java file. 
# #First alphabet of class name can be in upper case. It is the naming convention 
of class name. however, it is not compulsory to do so. 
- Class which is having same name as file must be public class 
- A main function/method must be present in this public class, main is a 
  function from where the program starts. 


```java
public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}
```

### Line-by-Line Explanation

1. **`public class Main {`**
   - **`public`**:
     - **Accessibility Modifier**: This keyword makes the class accessible from any other class. It indicates that the class can be used by any other class in any package.
   - **`class`**:
     - **Keyword**: This keyword is used to declare a class, which is a blueprint for objects. It defines a new data type with methods and properties.
   - **`Main`**:
     - **Class Name**: The name of the class. In Java, the class name should start with an uppercase letter and follow camel case naming conventions. This is the entry point of your Java application.

2. **`public static void main(String[] args) {`**
   - **`public`**:
     - **Accessibility Modifier**: This keyword makes the `main` method accessible from anywhere(It is used to allow the program to use main 
        function from anywhere). It is required because the JVM needs to call this method to start the program.
   - **`static`**:
     - **Keyword**: This keyword means that the method belongs to the class, not instances of the class. It can be called without               creating an object of the class. (It is a keyword which helps the main method to run without using objects. 
)
   - **`void`**:
     - **Return Type**: This keyword indicates that the method does not return any value.
   - **`main`**:
     - **Method Name**: The name of the method. The `main` method is special because it is the entry point for any Java application. The JVM looks for this method to start execution.
   - **`String[] args`**:
     - **Parameter**: This is an array of `String` objects. It allows the program to accept command-line arguments. `String[]` denotes an array of strings, and `args` is the name of the array.

3. **`System.out.println("Hello world!");`**
   - **`System`**:
     - **Class**: This is a built-in class in the `java.lang` package. It provides access to system resources.
   - **`out`**:
     - **Field**: This is a static member of the `System` class. It represents the standard output stream (console).
   - **`println`**:
     - **Method**: - It is a method of PrintStream class, It prints the argumants passed to it and adds a new line. print can aalso be used     here but it prints only arguments passed to it. It do not adds a new line. 
   - **`"Hello world!"`**:
     - **String Literal**: This is a sequence of characters enclosed in double quotes. It is the message that will be printed to the console.

4. **`}`** (both closing braces)
   - **Closing Braces**: These braces close the `main` method and the `Main` class, respectively. In Java, braces define the scope of classes and methods.

### Summary

Your program defines a public class named `Main` that includes a `main` method. This method is the starting point of the program and prints "Hello world!" to the console. Each keyword and symbol has a specific purpose to ensure the program is structured correctly and can be executed by the JVM.

[Back to Top](#programming-concepts-index)

### Primitive Data Types
   - **Primitive Data Types**: Primitives data types are those data types which is not breakable. The simplest and most basic data types. 
        - Java has 8 primitive data types.

   - **Ex:-** 
        String is not a primitive data type so we can break this data type into 
        char 
         i.e., String “Prateek” can be divided into 
         ‘P’ ‘r’ ‘a’ ‘t’ ‘e’ ‘e’ ‘k’ 
        But primitives data type are not breakable. We cannot break a char ,int etc. 
     
### Primitive Data Types in Java

![Primitive Data Types in Java](./notes/primitive%20datatype.png)

In float and long we have used f and l, it denotes that the number in the 
variable is float or long type, if we do not use this java consider float value as 
double and long value as int. 

**Java Primitive Data Types**

Java provides eight fundamental data types called primitives. These are the building blocks for storing simple values in your programs.

| Data Type | Size (bits) | Description | Common Uses |
|---|---|---|---|
| `byte` | 8 |  Smallest integer type | Memory-efficient storage of integers in large arrays |
| `short` | 16 | Small integer type | Similar to `byte`, but with a wider range |
| `int`  | 32 | Most common integer type | General-purpose integer storage |
| `long` | 64 | Large integer type | When `int` isn't big enough (e.g., for very large numbers) |
| `float` | 32 | Single-precision floating-point | Decimal numbers with lower precision (and memory usage) |
| `double` | 64 | Double-precision floating-point | Default for decimal numbers, higher precision than `float` |
| `boolean` | 1 (typically) | Represents `true` or `false` | Logical conditions and flags |
| `char` | 16 | Represents a single character | Letters, numbers, symbols, etc. |

**Key Points:**

* **Size:** Each data type has a fixed size, which determines the range of values it can store.
* **Choice:** The data type you choose depends on the kind of data you need to represent and the memory constraints of your application.
* **Non-Primitive Types:** Java also has non-primitive types (e.g., classes, arrays), which are more complex and can store references to objects.


### Example Usage

#### Primitive Data Types Example:
```java
public class Main {
    public static void main(String[] args) {
        byte smallNumber = 10;
        short mediumNumber = 2000;
        int number = 50000;
        long largeNumber = 100000L;
        float decimalNumber = 5.75f;
        double largeDecimalNumber = 19.99;
        boolean isJavaFun = true;
        char grade = 'A';

        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Int: " + number);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + decimalNumber);
        System.out.println("Double: " + largeDecimalNumber);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("Char: " + grade);
    }
}

```

[Back to Top](#programming-concepts-index)

## Literals and Identifiers in Java

This section will explain literals and identifiers in Java, providing a simple explanation followed by detailed definitions and examples.

### Simple Explanation

- **Literals**: These are the actual values you assign to variables. Think of them as the specific numbers, characters, or strings you write in your code.
- **Identifiers**: These are the names you give to variables, methods, classes, and other entities in your code. Think of them as labels you use to refer to different parts of your program.

### Detailed Definition

### Literals

Literals in Java are fixed values that appear directly in your code. They represent constant values that do not change during the execution of the program. Here are the different types of literals in Java:

1. **Integer Literals**:
   - Represent whole numbers.
   - **Examples**:
     - Decimal (Base 10): `int a = 10;`
     - Hexadecimal (Base 16): `int b = 0x1A;`
     - Octal (Base 8): `int c = 012;`
     - Binary (Base 2): `int d = 0b1101;`

2. **Floating-Point Literals**:
   - Represent decimal numbers.
   - **Examples**:
     - Float: `float e = 3.14f;`
     - Double: `double f = 3.14;`

3. **Character Literals**:
   - Represent single characters.
   - **Examples**:
     - `char g = 'A';`
     - Unicode: `char h = '\u0041';`

4. **String Literals**:
   - Represent sequences of characters.
   - **Example**:
     - `String i = "Hello, World!";`

5. **Boolean Literals**:
   - Represent true or false values.
   - **Examples**:
     - `boolean j = true;`
     - `boolean k = false;`

6. **Null Literal**:
   - Represents a null reference.
   - **Example**:
     - `String l = null;`

### Identifiers

Identifiers in Java are names used to identify variables, methods, classes, and other entities. Identifiers must follow certain rules and conventions:

1. **Rules for Identifiers**:
   - Must begin with a letter (A-Z or a-z), currency character ($), or an underscore (_).
   - Subsequent characters can be letters, digits (0-9), currency characters, or underscores.
   - Cannot be a reserved keyword (e.g., `class`, `public`, `int`).
   - Java is case-sensitive, so `myVariable` and `myvariable` are different identifiers.

2. **Examples of Valid Identifiers**:
   - `myVariable`
   - `_myVariable`
   - `$myVariable`
   - `variable1`

3. **Examples of Invalid Identifiers**:
   - `1variable` (cannot start with a digit)
   - `my-variable` (hyphens are not allowed)
   - `public` (reserved keyword)

### Examples

#### Literals Example:
```java
public class Example {
    public static void main(String[] args) {
        int decimal = 100;            // Integer literal
        float pi = 3.14f;             // Floating-point literal
        char letter = 'A';            // Character literal
        String greeting = "Hello";    // String literal
        boolean flag = true;          // Boolean literal
        int hex = 0x1A;               // Hexadecimal literal
        int octal = 012;              // Octal literal
        int binary = 0b1101;          // Binary literal
    }
}
```

#### Identifiers Example:
```java
public class Example {
    public static void main(String[] args) {
        int myVariable = 10;           // Valid identifier
        float _myVariable = 3.14f;     // Valid identifier
        char $myVariable = 'A';        // Valid identifier
        boolean isJavaFun = true;      // Valid identifier
        // int 1variable = 5;          // Invalid identifier, starts with a digit
        // String my-variable = "Hi";  // Invalid identifier, contains a hyphen
        // int public = 20;            // Invalid identifier, reserved keyword
    }
}
```

### Summary

- **Literals**: Fixed values directly written in the code, representing various data types such as integers, floating-point numbers, characters, strings, and boolean values.
- **Identifiers**: Names given to variables, methods, classes, and other entities. They must follow specific rules, such as starting with a letter, dollar sign, or underscore, and cannot be reserved keywords.

[Back to Top](#programming-concepts-index)


## Conditions for Type Conversion in Java

This section will explain the conditions for type conversion in Java, providing a simple explanation followed by detailed definitions and examples.

### Simple Explanation

- **Type Conversion**: Changing a value from one data type to another. It can be done automatically (implicit) or manually (explicit).
- **Implicit Conversion**: The Java compiler automatically changes the type.
- **Explicit Conversion**: You have to tell the compiler to change the type using casting.

### Detailed Definition

### Type Conversion in Java

Type conversion in Java refers to changing a value from one data type to another. There are two main types of type conversions:

1. **Implicit Type Conversion (Widening)**:
   - Java automatically converts a smaller data type to a larger data type.
   - This is also known as widening conversion.
   - No data loss occurs in this type of conversion.
   - **Examples**:
     - `byte` to `short`, `int`, `long`, `float`, or `double`
     - `short` to `int`, `long`, `float`, or `double`
     - `char` to `int`, `long`, `float`, or `double`
     - `int` to `long`, `float`, or `double`
     - `long` to `float` or `double`
     - `float` to `double`

2. **Explicit Type Conversion (Narrowing)**:
   - You manually convert a larger data type to a smaller data type.
   - This is also known as narrowing conversion.
   - It requires a cast operator and can result in data loss or precision loss.
   - **Examples**:
     - `double` to `float`, `long`, `int`, `short`, `char`, or `byte`
     - `float` to `long`, `int`, `short`, `char`, or `byte`
     - `long` to `int`, `short`, `char`, or `byte`
     - `int` to `short`, `char`, or `byte`
     - `short` to `char` or `byte`
     - `char` to `short` or `byte`

### Implicit Conversion Example

In implicit type conversion, also known as widening conversion, the compiler automatically handles the conversion.

```java
public class ImplicitConversion {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;  // byte to int
        float c = b;  // int to float
        double d = c;  // float to double

        System.out.println("byte value: " + a);
        System.out.println("int value: " + b);
        System.out.println("float value: " + c);
        System.out.println("double value: " + d);
    }
}
```

### Explicit Conversion Example

In explicit type conversion, also known as narrowing conversion, you need to specify the type you are converting to using a cast.

```java
public class ExplicitConversion {
    public static void main(String[] args) {
        double a = 9.78;
        float b = (float) a;  // double to float
        long c = (long) b;  // float to long
        int d = (int) c;  // long to int
        short e = (short) d;  // int to short
        byte f = (byte) e;  // short to byte

        System.out.println("double value: " + a);
        System.out.println("float value: " + b);
        System.out.println("long value: " + c);
        System.out.println("int value: " + d);
        System.out.println("short value: " + e);
        System.out.println("byte value: " + f);
    }
}
```

### Key Points

- **Implicit Type Conversion**:
  - No special syntax required.
  - Always safe, no data loss.
  - Automatically done by the Java compiler.

- **Explicit Type Conversion**:
  - Requires a cast operator.
  - Can lead to data loss or precision loss.
  - Must be explicitly specified by the programmer.

### Summary

- **Type Conversion**: Changing a value from one data type to another.
- **Implicit Conversion**: Automatically handled by Java for widening conversions.
- **Explicit Conversion**: Requires casting for narrowing conversions, may lead to data or precision loss.

[Back to Top](#programming-concepts-index)

## Rules of Type Promotion in Java

This section will explain the rules of type promotion in Java, providing a simple explanation followed by detailed definitions and examples.

### Simple Explanation

- **Type Promotion**: Automatically converting a smaller data type to a larger data type during operations.
- **Rules**:
  - Smaller types (`byte`, `short`, `char`) are promoted to `int` when used in expressions.
  - If any operand is `long`, the whole expression is promoted to `long`.
  - If any operand is `float`, the whole expression is promoted to `float`.
  - If any operand is `double`, the whole expression is promoted to `double`.

### Detailed Definition

Type promotion in Java is the process where smaller data types are automatically converted to larger data types to ensure that operations are performed correctly without losing precision.

### Rules of Type Promotion

1. **Arithmetic Operations**:
   - When performing arithmetic operations, smaller data types are promoted to `int` if they are `byte`, `short`, or `char`.

2. **Mixed-Type Expressions**:
   - In expressions involving different data types, Java promotes the data types to the largest type in the expression to prevent data loss.
   - **Example Order**: `byte` → `short` → `int` → `long` → `float` → `double`.

3. **Specific Rules**:
   - If either operand is of type `double`, the other operand is converted to `double`.
   - If either operand is of type `float`, the other operand is converted to `float`.
   - If either operand is of type `long`, the other operand is converted to `long`.
   - If both operands are of type `byte`, `short`, or `char`, they are both converted to `int`.

### Examples

#### Example of Arithmetic Promotion:
```java
public class ArithmeticPromotion {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // a and b are promoted to int, and the result is an int
        int result = a + b;

        System.out.println("Result: " + result);  // Output: Result: 30
    }
}
```

#### Example of Mixed-Type Expressions:
```java
public class MixedTypeExpressions {
    public static void main(String[] args) {
        int a = 10;
        long b = 20L;
        float c = 30.0f;
        double d = 40.0;

        // a is promoted to long, then the result of (a + b) is promoted to float
        float result1 = a + b + c;
        // a, b, and c are promoted to double
        double result2 = a + b + c + d;

        System.out.println("Result1: " + result1);  // Output: Result1: 60.0
        System.out.println("Result2: " + result2);  // Output: Result2: 100.0
    }
}
```

### Additional Points

1. **Unary Operators**:
   - Unary operators like `+`, `-`, `~`, and `!` can also cause type promotion.
   - Example: `byte a = 10; int b = -a;` // `a` is promoted to `int` before negation.

2. **Conditional Expressions**:
   - In conditional expressions, the resulting type is promoted to the larger of the two types involved.
   - Example: `byte a = 10; int b = 20; long c = (a > b) ? a : b;` // Result is promoted to `long`.

### Summary

- **Type Promotion**: Automatic conversion of smaller data types to larger ones in expressions to ensure correct operations.
- **Rules**:
  - `byte`, `short`, and `char` are promoted to `int`.
  - Mixed expressions promote to the largest type involved.
  - Unary and conditional operations follow type promotion rules.

[Back to Top](#programming-concepts-index)
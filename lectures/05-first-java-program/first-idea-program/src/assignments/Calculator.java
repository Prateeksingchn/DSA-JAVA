package assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();

        // Prompt the user to enter the operator
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = input.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        // Variable to store the result
        double result = 0;

        // Perform the calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Check for division by zero
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                input.close();
                return;
            }
        } else {
            // Handle invalid operator
            System.out.println("Error: Invalid operator.");
            input.close();
            return;
        }

        // Print the result
        System.out.println("The result is: " + result);

        // Close the scanner (optional but recommended)
        input.close();
    }
}

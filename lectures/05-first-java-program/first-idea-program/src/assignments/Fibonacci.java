package assignments;

import java.util.Scanner;

public class Fibonacci {
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

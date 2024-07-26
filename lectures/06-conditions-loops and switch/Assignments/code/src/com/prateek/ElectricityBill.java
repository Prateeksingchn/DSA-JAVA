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

        /*
    Let's break down the $%.2f%n format specifier used in the printf statement:

    $ is a literal dollar sign character that will be printed as-is.
    % marks the beginning of a format specifier.
    .2 specifies that we want 2 decimal places.
    f indicates that we're formatting a floating-point number (like a double).
    %n is a platform-independent newline character.

    So, $%.2f%n means:

    Print a dollar sign
    Format the following number as a floating-point with 2 decimal places
    Add a newline at the end
    */

    }
}

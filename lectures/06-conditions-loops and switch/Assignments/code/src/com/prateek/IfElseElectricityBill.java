package com.prateek;

import java.util.Scanner;

public class IfElseElectricityBill {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Variable to store the bill amount
        double bill;

        // Calculate the bill based on units consumed
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 0.10;  // $0.10 per unit for first 100 units
        } else if (unitsConsumed <= 200) {
            bill = 100 * 0.10 + (unitsConsumed - 100) * 0.15;  // $0.15 per unit for next 100 units
        } else if (unitsConsumed <= 300) {
            bill = 100 * 0.10 + 100 * 0.15 + (unitsConsumed - 200) * 0.20;  // $0.20 per unit for next 100 units
        } else {
            bill = 100 * 0.10 + 100 * 0.15 + 100 * 0.20 + (unitsConsumed - 300) * 0.25;  // $0.25 per unit for units above 300
        }

        // Print the result
        System.out.println("Electricity Bill Calculator");
        System.out.println("---------------------------");
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.printf("Total bill: $%.2f%n", bill);

        // Close the scanner
        scanner.close();
    }
}
package assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the principal amount
        System.out.println("Enter Principal (P):");
        int p = input.nextInt();

        // Prompting the user to enter the rate of interest
        System.out.println("Enter Rate of Interest (R):");
        int r = input.nextInt();

        // Prompting the user to enter the time period
        System.out.println("Enter Time Period in Years (T):");
        int t = input.nextInt();

        // Calculating Simple Interest
        int simpleInterest = (p * r * t) / 100;

        // Printing the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        // Closing the scanner (optional but recommended)
        input.close();
    }
}

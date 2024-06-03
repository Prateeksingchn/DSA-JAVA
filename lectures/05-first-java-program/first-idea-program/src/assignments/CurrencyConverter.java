package assignments;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount in rupees:");
        double rupees = input.nextDouble();

        double conversionRate = 80.0; // Example conversion rate

        double dollars = rupees / conversionRate;

        System.out.println("Your amount in dollars: " + dollars);

    }
}

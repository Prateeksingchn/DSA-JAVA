package assignments;

import java.util.Scanner;

public class PrintLargerNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("The larger num is: " + num1);
        } else if (num1 < num2) {
            System.out.println("The larger num is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }


    }
}

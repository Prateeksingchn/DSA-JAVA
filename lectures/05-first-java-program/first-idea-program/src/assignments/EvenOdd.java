package com.prateek;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = input.nextInt();

        if (a % 2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Close the scanner (its not compulsory to use this)
        input.close();

    }
}

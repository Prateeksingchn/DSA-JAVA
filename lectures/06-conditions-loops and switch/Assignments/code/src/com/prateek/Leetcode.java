package com.prateek;

import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = input.nextInt();

        int product = 1;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n /= 10;

            product = product * rem;
            sum = sum + rem;
        }

        int difference = product - sum;
        System.out.println("difference: " + difference);
    }
}

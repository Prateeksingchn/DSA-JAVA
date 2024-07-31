package com.prateek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q. take input of 2 numbers and print the sum
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum: " + sum);

        /* This is easy to do it one time,what if we want to do it 10-times
           (we could print it 10-times) but what if its 100 times,
           then it would be a problem, so that's why we use Functions or Methods.
           bundle this code in a function or method, and then we can use it anywhere
           in Java we called functions --> Method. */
    }
}

package com.prateek;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();  // name--> sum, () used to call the function.
    }
    static void sum () {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum: " + sum);
    }
    /*
        //Method(function) syntax:
        return_type name () {
            //body
            return statement;
        }
    */
}

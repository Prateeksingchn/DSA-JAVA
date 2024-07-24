package com.prateek;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Note:- This is for "int"
//        System.out.print("Please enter 1st no: ");
//        int num1 = input.nextInt();
//
//        System.out.print("Please enter 2nd no: ");
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("Sum = " + sum);

        /* If in this we put float value it will give error */
//----------------------------------------------------------------------------------------

        //Note:- This is for "float" same thing
        System.out.print("Enter 1st num: ");
        float num1 = input.nextFloat();

        System.out.print("Enter 2nd num: ");
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        System.out.print("Sum = " + sum );

        /* But, if we give int value in this, it will not give error */
    }
}

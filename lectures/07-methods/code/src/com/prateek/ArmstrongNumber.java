package com.prateek;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));   //Input: 153, Output: 153

        //All the 3-digit Armstrong number
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }                         //Output: 153 370 371 407
        }                             //if line-8 is on, then we have to put input first,and same output
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        //Either do this
//        if (sum == original) {
//            return true;
//        }
//        return false;

        //Or this directlly
        return sum == original;
    }
}

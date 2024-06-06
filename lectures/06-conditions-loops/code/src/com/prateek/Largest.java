package com.prateek;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q. Find the largest of the 3 numbers.

        // first method-
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max + " is the largest number");

        //Second method-
//        int max = 0;
//        if (a > b){
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//
//        System.out.println(max + " is the largest number");

        //Third method
/*  int max = Math.max(a, b); this will give the max value out of these two */

        int max = Math.max(c, Math.max(a, b)); //isme 3 ko compare karke max value dega
        System.out.println(max + " is the largest number");

        /* upar ke baaki sab ko comment out karke we can direct use Math.max
        System.out.println(Math.max(50, 80)); //output= 80 */
    }
}

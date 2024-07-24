package com.prateek;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        /*
            Syntax of "for loops":

            for (initialisation; condition; increment/decrement) {
                //body
            }
        */

        // Q. Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);  /* if num += 1, then output-1 2 3 4 5 */
//                                      /* But if num += 2,then output-1 3 5 */
//        }

        //print number from 1 to n
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++) {
//            System.out.println(num + " ");       /* it will ask you to give any number,and it will
////                                                  give you all the number b/w 0 and your number */
////            System.out.println("Hello world"); /* This will ask you for a num and will print
////                                                  "Hello world" that num of times*/
//        }

/*-------------------------------------------------------------------------------------------------*/

        //While loop
        /*
            Syntax:
            while (conditions) {
                //body
            }
        */
        /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                //body
            }

            for (int num = 1; num <=5; num +=1) {
                System.out.println(num);  // output-1 2 3 4 5
            }
        */
        //converting for loop to while loop
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }

/*-------------------------------------------------------------------------------------------------*/
        //do-while loop
        /*
            Syntax

            do{
                //body
            } while (condition);
        */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}

package com.prateek;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        Scanner input = new Scanner(System.in);
        //This is how you denote 2-D Arrays
//        int[][] arr = new int[3][0];

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5},   // 1th index
//                {6, 7, 8, 9}  // 2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); //no of rows

        //Input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        //Output (1st way to Print)
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " "); //if we only use this line, it will print like below
//                /* Input:- 1 2 3 4 5 6 7 8 9
//                   Output:- 1 2 3 4 5 6 7 8 9   */
//            }
//            System.out.println();  //but If we use the line it will print like below, in a 2d matrix
//            /* Input:- 1 2 3 4 5 6 7 8 9
//               Output:-  1 2 3
//                         4 5 6
//                         7 8 9      */
//        }

//        //Output (2nd way to Print)
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row])); /* Input:- 1 2 3 4 5 6 7 8 9
//                                                              Output:- [1, 2, 3]
//                                                                       [4, 5, 6]
//                                                                       [7, 8, 9]     */
////        }
// 

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a)); /* Input:- 1 2 3 4 5 6 7 8 9
                                                       Output:- [1, 2, 3]
                                                                [4, 5, 6]
                                                                [7, 8, 9]     */
        }
    }
}

package com.prateek;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
//        System.out.println(arr[3]);  //output:- 543

        /* But what if we have to do this 1000 times,
        we cannot write this again and again, so we use loops */

        //input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr)); /* this is the best method to print array,
//                                                     its use for in the backend */


//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr) {  //for every element in array, print the element
//            System.out.print(num + " "); // here num represents elements of the array
//        }

//        System.out.println(arr[5]); //Error-  Index 5 out of bounds for length 5

/*-----------------------------------------------------------------------------------------------*/
        // Arrays of Objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str)); //it automatically add the comma and square brackets
        /* Input: aa bb cc dd
           Output: [aa, bb, cc, dd]*/

        //Modify a string array
        str[1] = "Prateek";

        System.out.println(Arrays.toString(str));
        /* Input: aa bb cc dd
           Output: [aa, Prateek, ccc, dd] */
    }
}

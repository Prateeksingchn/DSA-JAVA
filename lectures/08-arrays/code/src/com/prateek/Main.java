package com.prateek;

public class Main {
    public static void main(String[] args) {
        // Q. store a roll no
        int a = 15;

        // Q. store a person's name
        String name = "Prateek Singh Chouhan";
        int rn1 = 23;
        int rn2 = 16;
        int rn3 = 26;

        // Syntax of Array
        // datatype[] variable_name == new datatype[size];
        // store 5 roll number:
        int[] rn = new int[5];
        // or directly
//        int[] rn2 = {23, 12, 34, 46, 15};
        /* if in Array you have mention datatype as int,
           so all the values should be int, no string, boolean or other datatypes  */

        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; /* initialization: actually here object is being
                                             created in the memory(heap memory) */
//        System.out.println(ros[1]);  //output: 0


        String[] arr = new String[4];
        System.out.println(arr[0]);   // output: null
    }
}

package com.prateek;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {

        /* When, there is two or more function with the same name,
           but different arguments it's known as Function Overloading
           (either the number of arguments should be different or type of argument should be different)
           Function Overloading happens at compile time.
           after compiling its check, ohh this fun have integer so run integer one  */

//        fun(26);       //if only this is called then, output:- Second one Prateek Singh Chouhan
//        fun("Prateek Singh Chouhan");  //if only this is called then, output:- First one 26
/*--------------------------------------------------------------------------------------------------*/
//        int ans = sum(3, 4, 26); //here 3 input so it will run,but if we give more than 3 error
//        System.out.println(ans);
/*--------------------------------------------------------------------------------------------------*/
//        demo(2, 3, 5); //output:- [2, 3, 5]
//        demo("Prateek", "Bateman");  //output:- [Prateek, Bateman]
        demo(); /* if we don't write anything here, it will give error
                   This is called as Ambiguity,
                   if we take Function Overloading we cannot be empty */
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    /*---------------------------------------------------------------------------------------------------*/
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

/*----------------------------------------------------------------------------------------------------*/

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}

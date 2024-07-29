package com.prateek;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
         fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
        // fun();

        multiple(2, 5, "prateek", "ayush", "manik");
    }
    // for multiple Arguments
    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));  //output:- [prateek, ayush, manik]
    }


    static void fun(int ...v) {
        //System.out.println(Arrays.toString(v)); //output:- [2, 3, 4, 5, 56, 87, 23, 45, 65]
                                //if fun(); is empty like above its will print empty Array []
    }
}

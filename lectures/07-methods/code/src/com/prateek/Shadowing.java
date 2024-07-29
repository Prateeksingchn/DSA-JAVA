package com.prateek;

public class Shadowing {
    static int x = 90; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // output: 90


        /* NOTE for these 3 lines below:-
         * declaring = int x;   (declare a variable)
         * initialise = x = 40; (means setting (assign) up the value.) */
        int x; // (declaration) the class variable at line 4 is shadowed by this.
//      System.out.println(x); // scope will begin when value is initialised, inke beech mein kuch nahi chalega
        x = 40; // (initialization)

        System.out.println(x);  // output: 40
        fun();
    }
    static void fun() {
        System.out.println(x);  // output: 90
    }
}

package com.prateek;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your roll no: ");
//        int rollno = input.nextInt();
//        System.out.print("Your roll no is " + rollno);  //input-> 80, output-> Your roll no is 80


        //String
        //Note:- input- hello im prateek,
        //if we use next, output- hello (only first word)
        //but if we use nextLine, output- hello im prateek (full sentence)
//          String name = input.nextLine();
//          System.out.println(name);


        //float
        //Note:-
        // input-> 564.6758463
        // output-> 564.67584
        //This is a Float point error, and if we give input- 10,then output- 10.0
        // its still gives output as float but we gave integer, its known as CASTING.
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}

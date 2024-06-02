package com.prateek;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hey, How are you?");  //this line means in standard output stream print something
        Scanner input = new Scanner(System.in);
        //System.out.println(input.nextInt()); //If i pass 1526 it will pass, but if if i pass "prateek" it will give an error
        //System.out.println(input.next());  //If we give input hey how are you, then it will only give hey(only the fisrt word)
        System.out.println(input.nextLine());  //If we give input hey how are you, then here it will print hey how are you, full sentence
    }
}
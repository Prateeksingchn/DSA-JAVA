package com.prateek;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temp in C: ");

        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);  //input- 40 | output- 104.0
    }
}

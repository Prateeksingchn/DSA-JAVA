package com.prateek;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = input.nextDouble();

        double pie = 3.14;
        
        double area = pie * (radius * radius);
        System.out.println("Area of circle " + area );
    }
}

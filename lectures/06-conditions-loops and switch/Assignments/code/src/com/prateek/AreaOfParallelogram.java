package com.prateek;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Height");
        double height = input.nextDouble();

        System.out.println("Enter Base");
        double base = input.nextDouble();

        double area = height * base;
        System.out.println("area " + area);
    }
}

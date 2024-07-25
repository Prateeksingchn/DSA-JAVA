package com.prateek;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of one of the cube's sides");
        double a = input.nextDouble();

        double TotalSurfaceAreaOfCube = 6 * (a * a);

        System.out.println("TotalSurfaceAreaOfCube: " + TotalSurfaceAreaOfCube);
    }
}

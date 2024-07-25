package com.prateek;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pie = 3.14;

        System.out.println("Enter cylinder radius: ");
        double radius = input.nextDouble();

        System.out.println("Enter cylinder height: ");
        double height = input.nextDouble();

        double volume = pie * (radius * radius) * height;

        System.out.println("volume: " + volume);
    }
}

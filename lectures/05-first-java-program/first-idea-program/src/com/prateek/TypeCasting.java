package com.prateek;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //Type casting
//        int num = (int)(67.56f);  //This is how you convert a type to int, known as type casting
//        System.out.println(num);  //output- 67 (only integer value will be printed)

        //Automatic type promotion in expressions
//        int a = 257;
//        //byte b = a; //error
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b); //output- 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//
//        System.out.println(d);  //output- 20

//        byte b = 50;
//        b = b * 2;   //error

//        int number = 'A';
//        System.out.println(number); //output- 65 (Here java is converting char to int)

        //Rules for type conversion
         byte b = 42;
         char c = 'a';
         short s = 1024;
         int i = 50000;
         float f = 5.67f;
         double d = 0.1234;
         double result = (f * b) + (i / c) - (d * s);
         //float + int + double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));  //output- 238.14 515 126.3616
        System.out.println(result);  //output- 626.7784146484375

    }
}

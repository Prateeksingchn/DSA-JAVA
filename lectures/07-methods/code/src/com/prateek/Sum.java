package com.prateek;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();  // name--> sum, () used to call the function.
//        System.out.println(ans);

        int ans = sum3(20, 30);   //in this line a,b intelli-j-idea ne
                                      // khud a & b liye hai, code mein nahi lena hota hai.
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;  // whenever wwe use return, it means khatam after it nothing will execute
//        System.out.println("This will never execute");
    }


    static void sum () {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum: " + sum);
    }
    /*
        //Method(function) syntax:
        return_type name (arguments) {
            //body
            return statement;
        }
    */
}

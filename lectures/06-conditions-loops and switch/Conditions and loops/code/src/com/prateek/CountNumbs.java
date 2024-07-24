package com.prateek;

public class CountNumbs {
    public static void main(String[] args) {
        int n = 45537;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);  //output-2
    }
}

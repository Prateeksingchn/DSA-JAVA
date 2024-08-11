package com.prateek;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));  //output: [3, 4, 5, 12]
        change(nums);
        System.out.println(Arrays.toString(nums));  //output: [99, 4, 5, 12]
    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}

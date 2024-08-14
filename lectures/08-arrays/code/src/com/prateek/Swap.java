package com.prateek;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
//        swap(arr, 1, 3); //output:- [1, 9, 23, 3, 18]
//        swap(arr, 0, 4); //output:- [18, 3, 23, 9, 1]

        reverse(arr); //output:- [18, 9, 23, 3, 1]
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

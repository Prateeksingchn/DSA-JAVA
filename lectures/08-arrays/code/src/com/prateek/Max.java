package com.prateek;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
//        System.out.println(max(arr));  //output:- 23
        System.out.println(maxRange(arr, 1, 3));  //output:- 23
    }
    // finding maxVal in a Range
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }

        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    // Imagine that arr is not empty
//    static int max(int[] arr) {
//        int maxVal = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > maxVal) {
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }

}

package com.prateek;

public class SmallestLetter{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);  // Ans: 5 (means index 5, "16")
    }

    // return the index of smallest number >= target
    static int ceiling(int[] letters, int target) {

        //but what if the target is greater than the greatest number in the array
        if (target > letters[letters.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            //find the middle element
//            int mid = (start + end) / 2; //might be possible that (start + end) exceeds the range of int in java

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

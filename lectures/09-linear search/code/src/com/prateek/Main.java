package com.prateek;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
//        int target = 19; // output:- 5
        int target = 190; // output:- -1  //bcz 190 doesn't exist
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search the target amd return the true or false
    static boolean linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        /* This will execute if none of the return statements above have executed,
         * hence the target not found */
        return false;

    }

    /*------------------------------------------------------------------------------------------------*/
    // search the target amd return the element
//    static int linearSearch2(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        //run a for loop
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//        /* This will execute if none of the return statements above have executed,
//         * hence the target not found */
//        return Integer.MAX_VALUE;
//
//    }

/*------------------------------------------------------------------------------------------------*/
    // search in the Array: return the index if item found
    // otherwise if item not found return -1
//    static int linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        //run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            // check for element at every index of its is = target
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        /* This will execute if none of the return statements above have executed,
//         * hence the target not found */
//        return -1;
//
//    }

}

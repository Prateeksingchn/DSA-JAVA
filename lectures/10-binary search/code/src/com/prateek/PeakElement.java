package com.prateek;

public class PeakElement {
    public static void main(String[] args) {

    }
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid+1]) {
                // you are in decreasing part of array
                // this may be the answer, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of Array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2  checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuzz of the above line is the best possible answer
        return start; // or return end as both are equal
    }
}

# This file contains LeetCode solutions for medium Array problems.

## Table of Contents
1. [Rotate Array](#problem-1-rotate-array)

# Problem 1: Rotate Array
[189. Rotate Array](https://leetcode.com/problems/rotate-array/)

## Solution 1
```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        if (k == 0) return;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
```
[Back to Index](#table-of-contents)

# Problem 2: Search in Rotated Sorted Array
[33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)

## Solution 2
```java
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
```
[Back to Index](#table-of-contents)
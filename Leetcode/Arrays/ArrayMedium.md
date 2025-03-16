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


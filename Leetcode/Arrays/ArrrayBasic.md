# This file contains LeetCode solutions for easy Array problems.

## Table of Contents
1. [Remove Duplicates from Sorted Array](#problem-1-remove-duplicates-from-sorted-array)
2. [Check if Array Is Sorted and Rotated](#problem-2-check-if-array-is-sorted-and-rotated)
3. [Move all Zeros to the end of the array](#problem-3-move-all-zeros-to-the-end-of-the-array)
4. [Single Number (Find the number that appears once, and the other numbers twice)](#problem-4-single-number)

# Problem 1: Remove Duplicates from Sorted Array
[8. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## Solution 1
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
```

# Problem 2: Check if Array Is Sorted and Rotated
[1752. Check if Array Is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)

## Solution 2
```java
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}
```

# Problem 3: Move all Zeros to the end of the array
[283. Move Zeroes](https://leetcode.com/problems/move-zeroes/)

## Solution 3
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums [i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}
```

# Problem 4: Single Number (Find the number that appears once, and the other numbers twice)
[136. Single Number](https://leetcode.com/problems/single-number/)

## Solution 4
```java
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }
}
```


## Write Java Programs for the Following:

### Basic Java Programs

### Easy
1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
15. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)
16. [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
17. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)
18. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
19. [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
20. [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)
21. [Two Sum](https://leetcode.com/problems/two-sum/)
22. [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
23. [Lucky Number In a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)
24. [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
25. [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)
26. [Plus One](https://leetcode.com/problems/plus-one/)
27. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
28. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/)


### Solutions
1. buildArray

```java
    class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
```
---

2. getConcatenation

```java
    class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
```
---

3. runningSum

```java
    class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for(int i = 1; i < nums.length; i++ ) {
            result[i] = result[i-1] + nums[i];
        }

        return result;
    }
    
}
```
---

4. maximumWealth

```java
    class Solution {
    public int maximumWealth(int[][] accounts) {
       int maxWealth = 0; 
       for (int wealth = 0; wealth < accounts.length; wealth++) {
           int wealthSum = 0;
           for (int account = 0; account < accounts[wealth].length; account++) {
               wealthSum += accounts[wealth][account];
           }
           if (wealthSum > maxWealth) {
               maxWealth = wealthSum;
           }    
       }
       return maxWealth;
    }
}
```
---

5. shuffle

```java
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];        // x elements
            result[2 * i + 1] = nums[n + i]; // y elements
        }
        return result;
    }
}
```
---


6. 
```java

```
---


7. 
```java

```
---


8. 
```java

```
---


9. 
```java

```
---


10. 
```java

```
---


11. 
```java

```
---


12. 
```java

```
---


13. 
```java

```
---
# This file contains LeetCode solutions for basic math problems.

# Problem 1: Reverse Integer
[7. Reverse Integer](https://leetcode.com/problems/reverse-integer/)

# Solution 1
```java
class Solution {
    public int reverse(int x) {
        int n = x;
        int revNum = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            n = n / 10;

            if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }
            if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            revNum = (revNum * 10) + lastdigit;
        }
        return revNum;
    }
}
```

# Problem 2: Palindrome Number
[9. Palindrome Number](https://leetcode.com/problems/palindrome-number/)

# Solution 2
```java
class Solution {
    public boolean isPalindrome(int x) {
        int revNum = 0;
        int dup = x;
        while (x > 0) {
            int lastdigit = x % 10;
            revNum = (revNum * 10) + lastdigit;
            x = x / 10;
        }
        return dup == revNum;
    }
}
```

package com.prateek;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Prateek";
        char target = 'r';
//        System.out.println(search(name, target));  //output: true

        //for-each loop
        System.out.println(Arrays.toString(name.toCharArray()));  //ouput: [P, r, a, t, e, e, k]
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
/*--------------------------------------------------------------------------------------------------*/
    // for-each method
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (str.length() == 0) {
                return false;
            }
        }
        return false;
    }

}

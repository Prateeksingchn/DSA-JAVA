package com.prateek;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());  /* If we do not use this we will get error,
                                             bcz of this the list is created
                                             And if this is not there, there will be no list*/
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
        /*
            Input: 1 2 3 4 5 6 7 8 9
            Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        */
    }
}

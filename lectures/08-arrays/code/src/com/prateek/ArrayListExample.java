package com.prateek;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(8765);

//        System.out.println(list.contains(654));  //Output: true
//        System.out.println(list.contains(9858));  //Output: false
//        System.out.println(list);  //Output: [67, 234, 654, 43, 8765]

//        //Update the list
//        list.set(0, 99);
//        System.out.println(list);  //Output: [99, 234, 654, 43, 8765]

//        //Remove from list
//        list.remove(2);
//        System.out.println(list);  //Output: [99, 234, 43, 8765]

        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index(do this, not the one we did above)
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass the index here, list[index] syntax will not work here
        }
//        System.out.println(list);
    }
}

package com.prateek;

public class Scope {
    public static void main(String[] args) {
        /* Note: Anything that is initialise outside block, can be used inside the block(update and all that),
        *        but anything which is initialise inside the block, cannot be used outside */

        /* Note 2: Anything that is initialise outside block, cannot again be initialise inside the block,
         *        but anything which is initialise inside the block, can definetly be initialise outside the block */

        // initialise means setting (assign) up the value.
        /* NOTE in summary:- Anything that is initialise outside block, can be used inside the block
                             (update and all that) but cannot again be initialise inside the block.

                             And Anything which is initialise inside the block, cannot be used outside,
                             but can definetly be initialise outside the block (Since outside the block
                             it will not know ki something exist, so we can initialise again) */


        int a = 10; // this is initialising
        int b = 20; // this is initialising
        String name = "Parteek"; // this is initialising
        {
//            int a = 78; // already initialised outside the block in the same, method, hence you cannot initialised agian
            //but you can change the value
            a = 100; // re-assign the origin ref variable to some other value | // this is initialising
            System.out.println(a);
            int c = 99;
            name = "Ayush"; // this is updating
            System.out.println(name);
            // if values initialised in this block, will remain in block
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); //cannot use outside the block

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            int a = 10;
        }
        System.out.println(i);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

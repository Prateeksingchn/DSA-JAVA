package com.prateek;

public class ChangeName {
    public static void main(String[] args) {
        String name = "Prateek Chouhan";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Ayush Malviya"; // creating a new object
        /* This will not change the name, bcz strings cannot be changed(can't modify strings).
           they are final classes and in this we are not modifying the string,
           we are creating a new object */
    }
}

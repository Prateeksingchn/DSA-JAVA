package com.prateek;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);  //trim will remove the extra space form both ends

        if (ch >= 'a' && ch <= 'z') {       //&& is used for two comdition at a time, it means if this and that condition is true
            System.out.println("Lowercase");
        } else{
            System.out.println("Uppercase");
        }
    }
}

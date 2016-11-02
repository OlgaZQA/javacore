package com.olgazelenskaya.app.classwork.lesson8;

import java.util.Scanner;

/**
 * Created by PC on 29.10.2016.
 */
public class CaseSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println("This is an odd number: \n" + 1);
                break;
            case 2:
                System.out.println("This is an even number:\r" + 2);
                break;
            case 0:
                break;
            default:
                System.out.println("Try numbers 1-10");
        }

//}
//       if (a == 1) {
//        System.out.println("This is an odd number!");
//    }
//        if (a == 2) {
//        System.out.println("This is an even number!");
//    } else {
//        System.out.println("Try numbers 1-10");
    }
}
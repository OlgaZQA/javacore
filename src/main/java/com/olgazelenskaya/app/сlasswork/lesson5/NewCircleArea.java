package com.olgazelenskaya.app.сlasswork.lesson5;

import java.util.Scanner;

/**
 * Created by PC on 19.10.2016.
 */
public class NewCircleArea {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        System.out.println("Enter any number");
        int b = scanner.nextInt();
        scanner.close();
        if (a == 1){
            System.out.println("This is an odd number!");
        } if (a == 2) {
            System.out.println("This is an even number!");
        }
        else {
            System.out.println("Try numbers 1-10");
        }

    }
}

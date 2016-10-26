package com.olgazelenskaya.runners.classwork.classwork7;

import java.util.Scanner;

/**
 * Created by PC on 22.10.2016.
 */
public class CounterRunner {
//    public static void main(String[] args) {
        public void increment(){
        int k = 0;
        for (int i = 0; i <= 20; i += 2) {
            k++;
            //  System.out.println(k);
            System.out.println(i);

        }
   }

//  public static void main(String[] args) {
    public void incr() {
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment " + a);
    }
    //}

  public static void main(String[] args) {
//    public void decrement() {
        for (int k = 11; k > 0; k = k - 1) {
            System.out.print(k + " ");
        }
    }


    public void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number and press 'Enter' ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        while (a > b) {
            System.out.println("Your a is " + a + " Your b is " + b);
            a = a - 1;
        }
        if (a < b) {
            System.out.println("Your number " + a + " is less than " + b);
        }

    }
}



package com.olgazelenskaya.runners.homework.lesson7;

/**
 * Created by PC on 25.10.2016.
 */
public class ArrayClass {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i ++) {
            a[i] = (i+1)*2;
               System.out.println(a[i]+ " ");
            }
        }
    }
//    public static void main(String[] args) {
//        int[] a = new int[50];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i*2+1;
//
//            System.out.print(a[i] + " ");
//        }
//        System.out.println(" ");
//        for(int i = a.length-1; i >= 0; i--){
//            System.out.print(a[i] + " ");
//
////        for (int i = 0; i < a.length; i++){
////            System.out.print(a[a.length-1-i] + " ");
//        }
//
//    }

//        public static void main(String[] args) {
//        int[] a = new int[15];
//        int evenNumbers = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = (int) (Math.random() * 9 + 1);
//            System.out.print(a[i] + " ");
//
//            if ((a[1] % 2 == 0) && (a[i] != 0)) {
//                evenNumbers++;
//            }
//        }
//              System.out.print(evenNumbers);
//            }
//        }

//    public static void main(String[] args) {
//        int[] a = new int[15];
//        int max = a[0];
//        int min = a[0];
//
//        for (int i = 0; i < a.length; i++) {
//
//            a[i] = (int) (Math.random() * 998 + 1);
//            System.out.print(a[i] + " ");}
//
//            for (int i = 0; i != a.length; i++) {
//                if (a[i] > max) {
//                    max = a[i];
//                }
//                if (a[i] < min) {
//                    min = a[i];
//                }
//                System.out.println(min + " " + max);
//
//        }
//    }
//}
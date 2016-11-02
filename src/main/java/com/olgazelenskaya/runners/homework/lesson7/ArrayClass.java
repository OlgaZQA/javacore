package com.olgazelenskaya.runners.homework.lesson7;

import java.util.Random;

/**
 * Created by PC on 25.10.2016.
 */
public class ArrayClass {

    //public static void main(String[] args) {
    public void taskOne() {

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (i + 1) * 2;
            System.out.println(a[i] + " ");
        }
    }

    public void taskTwo() {
        //    public static void main(String[] args) {

        int[] a = new int[50];

        for (int i = 0; i < a.length; i++) {
            a[i] = i * 2 + 1;

            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");


            //      for(int i = 0; i < a.length; i++){
            //      System.out.print(a[a.length-1-i] + " ");
        }
        System.out.println(" ");
    }

    public void taskThree() {
        //   public static void main(String[] args) {

        int[] a = new int[15];
        int evenNumbers = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 9 + 1);
            System.out.print(a[i] + " ");

            if ((a[i] % 2 == 0) && (a[i] != 0)) {
                evenNumbers++;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Ответ: ");
        System.out.println("Четных элементов: " + evenNumbers);
    }

    public void taskFour() {
        // public static void main(String[] args) {

        int[] a = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 998 + 1);
            System.out.print(a[i] + " ");
            System.out.println(" ");

            int min = a[0];
            int max = min;

            for (i = 1; i < a.length; ++i) {
                if (a[i] > max) max = a[i];
                else if (a[i] < min) min = a[i];
            }
            System.out.println(" ");
            System.out.println("Ответ:");
            System.out.println("Минимальное число - это " + min + ";");
            System.out.println("Максимальное число - это " + max + ".");
        }
    }

    public void taskFive() {
        // public static void main(String[] args) {

        int[][] a = new int[8][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Ответ:");
        System.out.println("Восемь строк и пять столбцов");
    }

   // public static void main(String[] args) {
    public void taskSix(){
        int[][] arr = new int[8][5];
        int a = 10, b = 99;
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (a + Math.random() * (b - a + 1));

            System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

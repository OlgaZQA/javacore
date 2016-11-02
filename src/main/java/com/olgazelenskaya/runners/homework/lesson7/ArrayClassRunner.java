package com.olgazelenskaya.runners.homework.lesson7;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * Created by PC on 31.10.2016.
 */
public class ArrayClassRunner {
    //public static void main(String[] args) {
    public void HomeworkIf() {
        Scanner scan = new Scanner(System.in);
        ArrayClass myArrayClass = new ArrayClass();
        int task1 = 1, task2 = 2, task3 = 3, task4 = 4, task5 = 5, task6 = 6;

        System.out.println("Введите номер задачи от 1 до 6");
        int a = scan.nextInt();
        scan.close();

        if (a == 1) {
            System.out.println("Задача № 1");
            System.out.println(" ");

            myArrayClass.taskOne();
            System.out.println(" ");
        }

        if (a == 2) {
            System.out.println("Задача № 2");
            System.out.println(" ");

            myArrayClass.taskTwo();
            System.out.println(" ");
        }

        if (a == 3) {
            System.out.println("Задача № 3");
            System.out.println(" ");

            myArrayClass.taskThree();
            System.out.println(" ");
        }

        if (a == 4) {
            System.out.println("Задача № 4");
            System.out.println(" ");

            myArrayClass.taskFour();
            System.out.println(" ");
        }

        if (a == 5) {
            System.out.println("Задача № 5");
            System.out.println(" ");

            myArrayClass.taskFive();
            System.out.println(" ");
        }

        if (a == 6) {
            System.out.println("Задача № 6");
            System.out.println(" ");

            myArrayClass.taskSix();
            System.out.println(" ");
        } else {
            System.out.println("Вы ввели неверное число. Введите число от 1 до 6.");
        }
    }

   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayClass myArrayClass = new ArrayClass();

        System.out.println("Введите номер задачи от 1 до 6");
        int a = scan.nextInt();
        scan.close();

        switch (a) {
            case 1:
                // (a == 1)
                System.out.println("Задача № 1");
                System.out.println(" ");

                myArrayClass.taskOne();
                System.out.println(" ");
                break;

            case 2: //(a == 2)
                System.out.println("Задача № 2");
                System.out.println(" ");

                myArrayClass.taskTwo();
                System.out.println(" ");
                break;

            case 3: //(a == 3)
                System.out.println("Задача № 3");
                System.out.println(" ");

                myArrayClass.taskThree();
                System.out.println(" ");
                break;

            case 4: //(a == 4)
                System.out.println("Задача № 4");
                System.out.println(" ");

                myArrayClass.taskFour();
                System.out.println(" ");
                break;

            case 5: //(a == 5)
                System.out.println("Задача № 5");
                System.out.println(" ");

                myArrayClass.taskFive();
                System.out.println(" ");
                break;

            case 6: //(a == 6)
                System.out.println("Задача № 6");
                System.out.println(" ");

                myArrayClass.taskSix();
                System.out.println(" ");
                break;

            default:
                System.out.println("Вы ввели неверное число. Введите число от 1 до 6.");
        }
    }

//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        ArrayClass myArrayClass = new ArrayClass();
//
//        System.out.println("Введите номер задачи от 1 до 6");
//        int a = scan.nextInt();
//        scan.close();
//
//        do {
//            if (a == 1)
//                switch (a) {
//                    case 1:
//                        // (a == 1)
//                        System.out.println("Задача № 1");
//                        System.out.println(" ");
//
//                        myArrayClass.taskOne();
//                        System.out.println(" ");
//                        break;
//
//                    case 2: //(a == 2)
//                        System.out.println("Задача № 2");
//                        System.out.println(" ");
//
//                        myArrayClass.taskTwo();
//                        System.out.println(" ");
//                        break;
//
//                    case 3: //(a == 3)
//                        System.out.println("Задача № 3");
//                        System.out.println(" ");
//
//                        myArrayClass.taskThree();
//                        System.out.println(" ");
//                        break;
//
//                    case 4: //(a == 4)
//                        System.out.println("Задача № 4");
//                        System.out.println(" ");
//
//                        myArrayClass.taskFour();
//                        System.out.println(" ");
//                        break;
//
//                    case 5: //(a == 5)
//                        System.out.println("Задача № 5");
//                        System.out.println(" ");
//
//                        myArrayClass.taskFive();
//                        System.out.println(" ");
//                        break;
//
//                    case 6: //(a == 6)
//                        System.out.println("Задача № 6");
//                        System.out.println(" ");
//
//                        myArrayClass.taskSix();
//                        System.out.println(" ");
//                        break;
//
//                    default:
//                        System.out.println("Вы ввели неверное число. Введите число от 1 до 6.");
//                }
//            System.out.println("Неверное число. Введите число от 1 до 6 включительно");}
//
//            while (a < 6) ;
//        }
    }

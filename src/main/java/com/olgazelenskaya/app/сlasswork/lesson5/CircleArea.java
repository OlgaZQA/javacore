package com.olgazelenskaya.app.сlasswork.lesson5;

import java.util.Scanner;

/**
 * Created by PC on 19.10.2016.
 */
public class CircleArea {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();
        double circleArea = pi * radius * radius;
        System.out.println("Area is " + circleArea);

    }

}

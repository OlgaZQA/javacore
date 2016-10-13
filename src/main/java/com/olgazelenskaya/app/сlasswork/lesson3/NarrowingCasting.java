package com.olgazelenskaya.app.сlasswork.lesson3;

/**
 * Created by PC on 08.10.2016.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.86f;

    public void narrowing(){
        int1 = (int) float1;
        System.out.println(int1);
    }
}

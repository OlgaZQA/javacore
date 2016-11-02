package com.olgazelenskaya.app.classwork.lesson8;

import java.util.Arrays;

/**
 * Created by PC on 29.10.2016.
 */
public class CharArray {
    public static void main(String[] args) {
        char[] someArray = new char [256];
        for (int a = 0; a < someArray.length; a++){
            someArray[a] = (char) a;}

        String myString = Arrays.toString(someArray);
        System.out.println(myString);
        }
    }

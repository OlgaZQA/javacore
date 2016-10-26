package com.olgazelenskaya.app.homework.homework3;

/**
 * Created by PC on 24.10.2016.
 */
public class SomeClass {

        public static int[] getEvenNumbersFromZeroToTwentyRight() {
            int[] result = new int[11]; //From 0 to 20
            for (int i = 0; i < result.length; i++) {
                result[i] = i * 2;
            }
            return result;
        }
}

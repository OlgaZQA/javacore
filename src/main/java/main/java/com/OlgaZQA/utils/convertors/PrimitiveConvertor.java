package main.java.com.OlgaZQA.utils.convertors;

/**
 * Created by PC on 13.10.2016.
 */
public class PrimitiveConvertor {

    public char floatToChar (float myFloat) {
        char myChar = (char) myFloat;
        System.out.println("Input float value is " + myFloat + ". Output char value is " + myChar);
        return myChar;
    }
    public char intToChar (int myInt) {
        char myChar = (char) myInt;
        System.out.println ("Input int value is " + myInt + ". Output char value is " + myChar);
        return myChar;
    }
    public int charToInt (char myChar) {
        int myInt = (int) myChar;
        System.out.println ("Input char value is " + myChar + ". Output char value is " + myInt);
        return myInt;
    }
}

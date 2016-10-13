package main.java.com.OlgaZQA.utils.convertors;

/**
 * Created by PC on 13.10.2016.
 */
public class PrimitiveConvertor {

    public char floatToChar (float myfloat) {
        char mychar = (char) myfloat;
        System.out.println("Input float value is " + myfloat + ". Output char value is " + mychar);
        return mychar;
    }
    public char IntToChar (int myint) {
        char mychar = (char) myint;
        System.out.println ("Input int value is " + myint + ". Output char value is " + mychar);
        return mychar;
    }
    public int CharToInt (char mychar) {
        int myint = (int) mychar;
        System.out.println ("Input char value is " + mychar + ". Output char value is " + myint);
        return myint;
    }
}

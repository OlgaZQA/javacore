package main.java.com.OlgaZQA.utils.runners;

import main.java.com.OlgaZQA.utils.convertors.PrimitiveConvertor;

/**
 * Created by PC on 13.10.2016.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.CharToInt('b');
        convertor.floatToChar(23);
        convertor.IntToChar('d');
    }

}

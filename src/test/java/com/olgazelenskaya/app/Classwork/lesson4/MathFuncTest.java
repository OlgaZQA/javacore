package com.olgazelenskaya.app.classwork.lesson4;

import com.olgazelenskaya.app.classwork.lesson4.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by PC on 12.10.2016.
 */
public class MathFuncTest {

    @Test // JUnit framework annotation
    public void multiplyTest(){
        int a = 3, b = 5, expRes = 15;
        MathFunc myMathFunc = new MathFunc();
        myMathFunc.multiply(a, b);
        Assert.assertEquals(expRes, myMathFunc.multiply(a, b));
    }
}
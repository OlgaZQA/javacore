package com.olgazelenskaya.app.homework.homework3;

import com.olgazelenskaya.app.utils.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by PC on 24.10.2016.
 */
public class Lesson3RunnerTest {
    @Test
    public void testOne() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        char a = 'A', exRes = 65;
        Assert.assertEquals(exRes, a);

    }

    @Test
    public void testTwo() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        char a = 'v', exRes = 65;
        if (exRes != 65) Assert.fail();
    }

    @Test
    public void testThree() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        float a = 100, exRes = 'd';
        Assert.assertTrue(a == 'd');
    }

    @Test
    public void testFour() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        float a = 100, exRes = 'd';
        if (exRes != 'd') Assert.fail();
    }

    @Test
    public void testFive() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        int a = 109, exRes = 'm';
        Assert.assertTrue(a == 'm');
    }

    @Test
    public void testSix() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        int a = 109, exRes = 'm';
        if (exRes != 'm') Assert.fail();
    }
}




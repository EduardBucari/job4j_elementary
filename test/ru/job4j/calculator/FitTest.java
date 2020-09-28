package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan187Than100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWoman170Then69() {
        short in1 = 170;
        double expected1 = 69;
        double out1 = Fit.womanWeight(in1);
        Assert.assertEquals(expected1, out1, 0.01);
    }
}
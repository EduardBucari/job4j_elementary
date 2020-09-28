package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to93then6() {
        int expected2 = 6;
        int x1 = 3;
        int y1 = 3;
        int x2 = 9;
        int y2 = 3;
        double out2 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected2, out2, 0.01);
    }

    @Test
    public void when11to41then3() {
        int expected3 = 3;
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 1;
        double out3 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected3, out3, 0.01);
    }
}
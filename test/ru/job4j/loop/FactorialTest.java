package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl2 = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl2, is(expected));
    }
}

package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result1 = MultiMax.max(3, 1, 2);
        assertThat(result1, is(3));
    }

    @Test
    public void whenSecondMax() {
        int result2 = MultiMax.max(1, 4, 2);
        assertThat(result2, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenAllEquals() {
        int result = MultiMax.max(2, 2, 2);
        assertThat(result, is(2));
    }
}



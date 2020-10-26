package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'x', 'x', 'x'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'x', ' ', ' '},
                {' ', 'x', ' '},
                {' ', ' ', 'x'}
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'x', 'x', 'x'};
        assertThat(result, is(expect));
    }
}
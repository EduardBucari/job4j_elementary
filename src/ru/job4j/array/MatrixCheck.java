package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
                if (i == 'x') {
                    result = false;
                    break;
                }
            }
        return result;
    }
}

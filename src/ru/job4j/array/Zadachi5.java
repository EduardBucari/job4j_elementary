package ru.job4j.array;

import java.util.Arrays;
// Используя двумерный массив, определить последовательность
// от верхнего левого угла в правый нижний и от верхнего правого угла в левый нижний.

public class Zadachi5 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        fillDiags(matrix);
        // второй вариант;
        int[][] matrix2 = new int[6][6];
        fillDiags2(matrix2);
    }
    public static void fillDiags(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (i + j == array.length - 1) {
                    array[i][j] = 2;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    //второй вариант;
    public static void fillDiags2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 3;
            array[i][array.length - 1 - i] = 4;
        }
        printArray(array);
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

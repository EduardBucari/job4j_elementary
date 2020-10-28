package ru.job4j.array;

import java.util.Arrays;
//пройтись "улиткой", от левого верхнего угла до центра.
public class Zadachi6 {

    public static void main(String[] args) {
        int[][] matrixForSnail = new int[5][5];
        snailMatrix(matrixForSnail);
    }

    public static void snailMatrix(int[][] array) {
        int a = 0;
        int n = array.length;
        int m;
        if (n % 2 == 0) {
            m = n / 2;
        } else {
            m = (n + 1) / 2;
        }
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n - i; j++) { //направо
                array[i][j] = a;
                a++;
            }
            for (int j = i + 1; j < n - i; j++) { //вниз
                array[j][n - i - 1] = a;
                a++;
            }
            for (int j = n - i - 2; j >= i; j--) { //налево
                array[n - i - 1][j] = a;
                a++;
            }
            for (int j = n - i - 2; j > i; j--) { //вверх
                array[j][i] = a;
                a++;
            }
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
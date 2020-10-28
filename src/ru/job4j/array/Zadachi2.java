package ru.job4j.array;

import java.util.Arrays;

public class Zadachi2 {
    public static void main(String[] args) {
        int[] array = {1, 90, 15, 60, 21, 11};

        // сортируем массив от макс. к мин.
        bubbleSortDesc(array);
    }
    public static void bubbleSortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

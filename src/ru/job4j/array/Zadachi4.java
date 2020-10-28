package ru.job4j.array;

import java.util.Arrays;

public class Zadachi4 {
    // найти самого старшего и самого младшего участника в группе
    // и найти между ними разницу.
    public static void main(String[] args) {
        int[] array = {8, 215, 12, 17, 13, 200};
        findMinMax(array);
    }
    public static void findMinMax(int[] array) {
        int min = array[0], max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
        System.out.println("Difference: " + (max - min));
    }

}

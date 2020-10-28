package ru.job4j.array;
// Easy Java – Junior - Урок 6 – Алгоритмы и задачи
import java.util.Arrays;
public class Zadachi {

    public static void main(String[] args) {
        int[] array = {1, 90, 15, 60, 21, 11};

        // сортируем массив от мин. к макс.
        bubbleSort(array);
    }
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

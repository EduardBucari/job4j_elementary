package ru.job4j.array;
// Объединить два отсортированных массива.
// Даны два отсортированных по возрастанию массива, без сортировки их объединить в третий массив.

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (index2 >= right.length || index1 < left.length && left[index1] < right[index2]) {
                rsl[i] = left[index1];
                index1++;
            } else {
                rsl[i] = right[index2];
                index2++;
            }
        }
        return rsl;
    }
}

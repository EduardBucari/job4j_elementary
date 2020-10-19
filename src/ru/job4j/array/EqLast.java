package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            int a = left[i];
            for (int j = 0; j < right.length; j++) {
                if (a == right[j]) {
                    break;
                }
            }
        }
        return false;
    }
}

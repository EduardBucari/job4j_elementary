package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
       int lastNum1 = left[left.length - 1];
       int lastNum2 = right[right.length - 1];
        if (lastNum1 == lastNum2) {
            return true;
        } else {
            return false;
        }
    }
}

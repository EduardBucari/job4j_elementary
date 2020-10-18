package ru.job4j.array;

public class ArrayChar {

    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int i2 = 0; i2 < pref.length; i2++) {
                if (i == i2) continue;
                if (pref[i2] != word[i]) {
                    break;
                }
            }
        }
        return result;
    }
}

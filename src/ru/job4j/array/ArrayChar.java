package ru.job4j.array;

public class ArrayChar {

    public static boolean startWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < word.length; i++) {
                if (pref[i] != word[i]) {
                    break;
                }

        }
        return result;
    }
}

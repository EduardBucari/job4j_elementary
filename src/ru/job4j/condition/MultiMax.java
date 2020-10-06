package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int rsl = first > second ? first : second;
        int rsl2 = rsl > third ? rsl : third;
        return rsl2;
    }
}
package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int x = 1; x <= 10; x++) {
            sum = sum + x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 5));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}

package ru.job4j.condition;

public class Cinema2 {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 21) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema2.access(21);
        Cinema2.access(16);

    }
}

package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        //Добавил в параметр дополнительно целочисленную переменую age;
        System.out.println("Hello, " + name);
        }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name, age);
        // закоментировал остальные методы.
       // ArgMethod.hello;

        //ArgMethod.hello(age);

        //ArgMethod.hello(name, name, name);
    }
}

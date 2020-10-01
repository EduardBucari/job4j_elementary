package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            String rsl2 = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            String rsl3 = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl2 = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl2);
        String rsl3 = DummyBot.answer("Пока.");
        System.out.println(rsl3);
    }
}

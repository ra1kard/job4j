package ru.job4j.condition;

/**
 * @author = Stanislav Kufarev (91raykard@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
/*    public static void main(String[] args) {
        DummyBot bot1 = new DummyBot();
            String result = bot1.answer("Привет, Бот.");
            System.out.println(result);
        DummyBot bot2 = new DummyBot();
            String result2 = bot2.answer("Пока.");
            System.out.println(result2);
        DummyBot bot3 = new DummyBot();
            String result3 = bot3.answer("Сколько будет 2 + 2?");
            System.out.println(result3);
    }*/
}

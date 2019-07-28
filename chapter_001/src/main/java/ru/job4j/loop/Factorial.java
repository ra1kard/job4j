package ru.job4j.loop;

/**
 * Factorial - класс для вычисления факториала.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 27.07.2019
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i<=n; i++) {
            result = result * i;
        }
        return result;
    }
}

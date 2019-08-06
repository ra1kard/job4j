package ru.job4j.loop;

/**
 * Mortgage - класс подсчёта количества необходимых лет для погашения кредита.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 06.08.2019
 */

public class Mortgage {
    public int year(int amount, int monthly, double percent) {  //100р   10р в мес   50% в год
        int year = 0;
        int percentInt = (int) percent;
        //произвести вычисление кредитной суммы за год и оставшейся
        while (amount > 0) {
            amount = (amount+(amount * percentInt / 100)) - (monthly * 12);  //30р = 150р - 120р         остаток = кредит в год - платеж в год по факту
            year++;
        }
        return year;
    }
}

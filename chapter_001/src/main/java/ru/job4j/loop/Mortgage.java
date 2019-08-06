package ru.job4j.loop;

/**
 * Mortgage - класс подсчёта количества необходимых лет для погашения кредита.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 28.07.2019
 */

public class Mortgage {
    public int year(int amount, int monthly, double percent) {  //100р   10р в мес   50% в год
        int year = 0;
        //произвести вычисление кредитной суммы за год и оставшейся
        double remainder = 1;


        while (remainder > 0) {
            remainder = (amount + percent) - (monthly * 12);        //30р = 150р - 120р         остаток

            //creditInYear = amount + percent;             //150р = 100р + 50%         кредит в год
            //payInYear = monthly * 12;                    //120р = 10 * 12            платеж в год по факту

            year++;
        }
        return year;
    }
}

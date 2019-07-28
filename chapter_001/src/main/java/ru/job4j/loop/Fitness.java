package ru.job4j.loop;

/**
 * Fitness - класс для Протеиновой диеты (кол-во мес., необх.Ивану, чтобы обогнать в тяге Николая)
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 28.07.2019
 */
public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        while (nik>ivan){
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}

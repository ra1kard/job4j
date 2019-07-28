package ru.job4j.loop;

/**
 * Counter - класс для подсчета суммы чётных чисел в диапазоне, например 30 (2 + 4 + 6 + 8 + 10).
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 27.07.2019
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
            else continue;
        }
        return sum;
    }
}

package ru.job4j.condition;

/**
 * Max - класс для вычисления максимума из двух чисел.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 27.07.2019
 */
public class Max {
    public int max(int left, int right){
        return left > right ? left : right;
    }
}

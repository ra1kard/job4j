package ru.job4j.condition;

/**
 * MultiMax - класс для вычисления максимума из трех чисел.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 27.07.2019
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        int resultMaxFirstAndSecond = first > second ? first : second;
        int result = resultMaxFirstAndSecond > third ? resultMaxFirstAndSecond : third;
        return result;
    }
}

package ru.job4j.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * 6.5. Поиск индекса в диапазоне.[#159304]
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 07.09.2019
 *
 */
public class FindLoop {

    /**
     * метод сравнивает значения и когда находит, возвращает index
     *
     * @param data - массив
     * @param el - значение которое ищем
     * @return - возвращаем индекс
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * метод сравнивает значения в опр.диапазоне и когда находит, возвращает index
     *
     * @param data - массив
     * @param el - значение которое ищем
     * @param start - начало диапазона поиска
     * @param finish - конец диапазона поиска
     * @return - возвращаем индекс
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * метод сортировки выборкой по возрастанию
     *
     * @param data - массив
     * @return - массив отсортированный
     */
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            int min = data[i];
            int minIndex = 0;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                }
                //с пом.метода index0f узнаем индекс найденного значения min
                minIndex = indexOf(data, min, i, data.length);
                //производим замену
                int tmp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = tmp;
            }
        }
        return data;
    }
}

package ru.job4j.array;

/**
 * 6.5. Поиск индекса в диапазоне.[#159304]
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 07.09.2019
 *
 */
public class FindLoopTwo {
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
}

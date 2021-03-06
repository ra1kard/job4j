package ru.job4j.array;

/**
 * 6.0. Заполнить массив степенями чисел.[#159293]
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int index = 0; index < bound; index++) {
            rst[index] = square(index + 1);
        }
        return rst;
    }

    static int square(int a) {
        int rst = a*a;
        return rst;
    }
}

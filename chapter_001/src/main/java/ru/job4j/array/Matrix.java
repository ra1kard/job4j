package ru.job4j.array;

/**
 * 6.6. Двухмерный массив. Таблица умножения.[#159295]
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 07.09.2019
 */
public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i+1)*(j+1);
            }
        }
        return table;
    }
}

package ru.job4j.array;

/**
 * 6.2. Перевернуть массив.[#159302]
 */
public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length-(array.length/2); i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}

package ru.job4j.array;

import java.util.Arrays;

//сортировка выборкой (находим наименьшее и меняем местами, грубый пример)
public class ArrayExample2 {
    public static void main(String[] args) {
        int[] data = {5, 3, 2, 1, 4};
        System.out.println(Arrays.toString(data));
        int tmp = data[0];
        data[0] = data[3];
        data[3] = tmp;
        System.out.println(Arrays.toString(data));
    }
}

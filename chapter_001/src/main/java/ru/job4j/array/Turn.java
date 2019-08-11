package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tmp = array[0];
            array[0] = array[3];
        }
        return array;
    }
}

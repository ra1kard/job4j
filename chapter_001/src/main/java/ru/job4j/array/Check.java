package ru.job4j.array;

/**
 * 6.3. Массив заполнен true или false[#159297]
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int countFalse = 0;
        int countTrue = 0;
        //берем элемент массива
        for (int i = 0; i < data.length; i++) {
            //сравниваем с каждым элементом массива
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    countTrue++;
                }
                else {
                    countFalse++;
                }
            }
        }
        if (countTrue > 0 && countFalse == 0) {
            return result = true;
        }
        else if (countFalse > 0 && countTrue == 0) {
            return result = true;
        }
        else {
            return result = false;
        }
    }
}

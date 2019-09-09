package ru.job4j.array;

/**
 * 6.8. Удаление дубликатов в массиве.[#159300]
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 09.09.2019
 */
public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length-1; index++) {
            if (array[index] == null) {
                int currentIndex = index;
                String tmp = array[currentIndex];
                int nextIndex = currentIndex+1;
                while (array[nextIndex] == null && nextIndex < array.length-1) {
                    nextIndex++;
                }
                array[currentIndex] = array[nextIndex];
                array[nextIndex] = tmp;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}

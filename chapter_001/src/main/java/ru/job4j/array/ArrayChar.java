package ru.job4j.array;

/**
 * Слово начинается с ...[#159296]
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 07.09.2019
 *
 */
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < 2; i++) {
            if (word[i] == pref[i]) {
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}

package ru.job4j.array;

/**
 * 6.4.1. Слово заканчивается с ...[#159303]
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 07.09.2019
 *
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = 0; i < 2; i++) {
            if (word[word.length-1-i] == post[post.length-1-i]) {
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

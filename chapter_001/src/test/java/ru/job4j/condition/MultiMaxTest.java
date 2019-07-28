package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * MultiMaxTest - тест для вычисления максимума из трех чисел.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 27.07.2019
 */
public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(9,5,8);
        assertThat(result, is(9));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(11,7,13);
        assertThat(result, is(13));
    }
}

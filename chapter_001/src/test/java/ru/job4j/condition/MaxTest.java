package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MaxTest - тест для вычисления максимума из двух чисел.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 27.07.2019
 */
public class MaxTest {
    @Test
    public void whenMax1To2Then2(){
        Max max = new Max();
        int result = max.max(1,2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then1(){
        Max max = new Max();
        int result2 = max.max(2,1);
        assertThat(result2, is (2));
    }

    @Test
    public void whenMax1To2ThenEqual(){
        Max max = new Max();
        int result3 = max.max(2,2);
        assertThat(result3, is (2));
    }
}

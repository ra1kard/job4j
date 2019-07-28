package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * FitnessTest - тест для проверки Протеиновой диеты (кол-во мес., необх.Ивану, чтобы обогнать в тяге Николая).
 *
 *  * @author Stanislav Kufarev (91raykard@gmail.com)
 *  * @version 1
 *  * @since 28.07.2019
 */
public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(95, 90);
        assertThat(days, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(90, 95);
        assertThat(days, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(50, 90);
        assertThat(days, is(2));
    }
}

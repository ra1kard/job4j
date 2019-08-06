package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * MortgageTest - тест для подсчёта количества необходимых лет для погашения кредита.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 06.08.2019
 */
public class MortgageTest {
    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 100, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 10, 50);
        assertThat(year, is(2));
    }
}

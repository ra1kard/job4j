package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CalculateTest - тест для вычисления арифметических операций.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 24.07.2019
 */
public class CalculateTest {
    /**
     * Test echo.
     */
    @Test
    public void whenTakeNameThenThreeEchoPlusName() {
        String input = "Stanislav Kufarev";
        String expect = "Echo, echo, echo : Stanislav Kufarev";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }
}

package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * CalculatorTest - тест калькулятора.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 21.07.2019
 */
public class CalculatorTest {
    @Test
    public void whenAddFiveToNineThenFourteen() {
        Calculator calcAdd = new Calculator();
        double result = calcAdd.add(5, 9);
        assertThat(result, is(14.0));
    }

    @Test
    public void whenDivNineToThreeThenThree() {
        Calculator calcDiv = new Calculator();
        double result = calcDiv.div(9, 3);
        assertThat(result, is(3.0));
    }

    @Test
    public void whenMultiplyFourToTwoThenEight() {
        Calculator calcMultiply = new Calculator();
        double result = calcMultiply.multiply(4, 2);
        assertThat(result, is(8.0));
    }

    @Test
    public void whenSevenToTwoThenFive() {
        Calculator calcSubtract = new Calculator();
        double result = calcSubtract.subtract(7, 2);
        assertThat(result, is(5.0));
    }
}

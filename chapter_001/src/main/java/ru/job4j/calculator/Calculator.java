package ru.job4j.calculator;

/**
 * Calculator - класс калькулятор.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 21.07.2019
 */
public class Calculator {
    public Double add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
        return result;
    }

    public Double div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
        return result;
    }

    public Double multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
        return result;
    }

    public Double subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        calculator.div(4, 2);
        calculator.multiply(2, 1);
        calculator.subtract(10, 5);
    }
}

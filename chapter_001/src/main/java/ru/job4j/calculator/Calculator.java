package ru.job4j.calculator;

public class Calculator {

    public static double add(double first, double second){
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
        return result;
    }

    public static double div(double first, double second){
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
        return result;
    }

    public static double multiply(double first, double second){
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
        return result;
    }

    public static double subtrack(double first, double second){
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
        return result;
    }

    public static void main(String[] args) {
/*      add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);*/
    }

}

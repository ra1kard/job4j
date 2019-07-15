package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int euroToDollar(int value){
        return value * 60;
    }

    public static void main(String[] args){
        int euro = rubleToEuro(70);
        System.out.println("70 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(60);
        System.out.println("60 rubles are " + dollar + " dollar.");
        int rubleToEur = euroToRuble(2);
        System.out.println("2 euro are " + rubleToEur + " ruble.");
        int rubleToDoll = euroToDollar(2);
        System.out.println("2 dollar are " + rubleToDoll + " ruble.");
    }

}

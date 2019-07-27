package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int resultMaxFirstAndSecond = first > second ? first : second;
        int result = resultMaxFirstAndSecond > third ? resultMaxFirstAndSecond : third;
        return result;
    }
}

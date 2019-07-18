package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k){
        int w;                          //сторона w!
        int h;                          //сторона h
        int s;                          //площадь
        int sumAB = p / 2;              //сумма сторон w и h согласно формуле: P=2(w+h) -> P/2=w+h
        int result = sumAB / (k + 1);   //высчитываем общее кол-во "раз" (w больше h в k раз + 1)
        w = result * k;                 //высчитываем соотношение, если w больше h в k раз
        h = sumAB - w;
        s = w * h;
        return s;
    }

    public static void main(String[] args) {
        int result1 = square(4,1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        int result2 = square(6,2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}

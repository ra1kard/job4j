package com.oreilly.chapter_1;

public class PhraseMatic {
    public static void main(String[] args) {
        String[] wordlistOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш",
        "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути",
        "динамичный"};
        String[] wordListTwo = {"Уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
        "распределенный", "кластеризированный", "фирменный", "нестандартный ум", "позиционированный", "сетевой",
        "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на ", "общий", "совместный",
        "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант",
        "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};
        //Вычисляем, сколько слов в каждом списке
        int oneLength = wordlistOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //Генерим 3 случайных числа
        int rand1 = (int) (Math.random()* oneLength);
        int rand2 = (int) (Math.random()* twoLength);
        int rand3 = (int) (Math.random()* threeLength);
        //Строим фразу
        String phrase = wordlistOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        //Вывод
        System.out.println("Все, что нам нужно, - это " + phrase);
        //Выведем кол-во слов
        System.out.println(oneLength + " " + twoLength + " " + threeLength);
    }
}

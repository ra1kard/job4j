package com.oreilly.chapter_3.Dog;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        //Хмм.. какое имя у myDogs[2]?
        System.out.println("Имя последней собаки - " + (myDogs[2].name));

        //Теперь переберем все элементы массива и вызовем для каждого метод bark()
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }

    public void eat() { }
    public void chaseCat() { }
}
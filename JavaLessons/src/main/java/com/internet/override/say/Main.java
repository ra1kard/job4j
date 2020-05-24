package com.internet.override.say;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.say();

        Animal animal2 = new Animal("Animal", 99);
        animal2.say();

        Dog dog = new Dog("Ronny",1);
        dog.say();

        Tiger tiger = new Tiger("Jacky", 12);
        tiger.say();
    }

}

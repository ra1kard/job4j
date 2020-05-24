package com.internet.override.voice;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        Dog dog = new Dog();
        dog.voice();

        Cow cow = new Cow();
        cow.voice();
    }
}

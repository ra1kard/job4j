package com.oreilly.chapter_2.Dog;

class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Гав");
    }
}

class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
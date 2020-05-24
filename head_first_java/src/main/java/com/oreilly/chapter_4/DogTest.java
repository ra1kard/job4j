package com.oreilly.chapter_4;

public class DogTest {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        one.name = "Tom";

        Dog two = new Dog();
        two.size = 8;
        two.name = "Ronny";

        Dog three = new Dog();
        three.size = 35;
        three.name = "Teo";

        one.bark();
        two.bark();
        three.bark();
    }
}

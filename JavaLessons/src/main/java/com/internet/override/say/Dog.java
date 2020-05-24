package com.internet.override.say;

public class Dog extends Animal {

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void say(){
        System.out.println("It's a dog! Gav!");
    }
}

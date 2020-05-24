package com.internet.override.say;

public class Tiger extends Animal {

    public Tiger(String name, int age){
        super(name, age);
    }

    @Override
    public void say(){
        System.out.println("It's a tiger! Rrr!");
    }
}

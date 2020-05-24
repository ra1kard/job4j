package com.internet.override;

class Parent {
    int method() {
        return 1;
    }
}

class Child extends Parent {
    @Override       //представим: нам не нравится поведение метода класса Parent, не хотим чтобы он возвращал 1, хотим 2
    int method() {
        return 2;
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.method());

        Parent child = new Child();
        System.out.println(child.method());
    }
}

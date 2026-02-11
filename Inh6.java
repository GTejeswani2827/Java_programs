package com.java.javacodingprograms.Inheritannce;
class Parent {
    int a = 10;
}

class Child extends Parent {
    int b = 20;
}

public class Inh6 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
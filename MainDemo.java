package com.java.javacodingprograms.Abstraction;
abstract class Demo {
    abstract void show();
}

class Sample1 extends Demo {
    void show() {
        System.out.println("Sample1 implementation");
    }
}

class Sample2 extends Demo {
    void show() {
        System.out.println("Sample2 implementation");
    }
}

public class MainDemo {
    public static void main(String[] args) {
        Demo d1 = new Sample1();
        Demo d2 = new Sample2();

        d1.show();
        d2.show();
    }
}
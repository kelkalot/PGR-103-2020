package com.prg103.instanceofexamples;

class Animal1 { }

class Dog1 extends Animal1 {

    static void method(Animal1 a) {
        Dog1 d=(Dog1)a;//downcasting
        System.out.println("ok downcasting performed");
    }

    public static void main (String [] args) {
        Animal1 a=new Dog1();
     //   Animal1 a=new Animal1();
        Dog1.method(a);
    }
}
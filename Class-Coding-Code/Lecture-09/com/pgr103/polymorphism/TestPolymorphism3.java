package com.pgr103.polymorphism;


//Animal: A program that allows to different types of
// animals from the parent class Animal.
// The child classes are implementing the specific eat methods.


class Animal{
    void eat(){System.out.println("eating...");}
}

class Dog extends Animal{
    void eat(){System.out.println("eating bread...");}
}

class Cat extends Animal{
    void eat(){System.out.println("eating rat...");}
}

class Lion extends Animal{
    void eat(){System.out.println("eating meat...");}
}

class TestPolymorphism3{
    public static void main(String[] args){
        Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
        a=new Lion();
        a.eat();
    }}

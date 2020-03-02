package com.pgr103.polymorphism;


//Example of Runtime Polymorphism with multilevel inheritance

class Animal2{
    void eat(){System.out.println("eating");}
}
class Dog2 extends Animal2{
    void eat(){System.out.println("eating fruits");}
}
class BabyDog2 extends Dog2{
    void eat(){System.out.println("drinking milk");}

    public static void main(String args[]){
        Animal2 a1,a2,a3;
        a1=new Animal2();
        a2=new Dog2();
        a3=new BabyDog2();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}
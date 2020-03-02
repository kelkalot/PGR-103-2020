package com.pgr103.polymorphism;



class Animal3{
    void eat(){System.out.println("animal is eating...");}
}
class Dog3 extends Animal3{
    void eat(){System.out.println("dog is eating...");}
}

class BabyDog3 extends Dog3{

    public static void main(String args[]){
        Animal3 a=new BabyDog3();
        a.eat();
    }
}
















//BabyDog is not overriding the eat() method, therefore the eat() method of Dog class is invoked.
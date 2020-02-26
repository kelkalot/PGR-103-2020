package com.pgr103.superexamples;


//The super keyword can also be used to invoke parent class method.
// It should be used if subclass contains the same method as parent class.
// In other words, it is used if method is overridden.
//In theexample Animal and Dog both classes have eat() method if we call
// at() method from Dog class, it will call the eat() method of Dog
// class by default because priority is given to local.
// To call the parent class method, we need to use super keyword.

class Animal2{
    void eat(){System.out.println("eating...");}
}

class Dog2 extends Animal2{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        bark();
    }
}
class TestSuper2{
    public static void main(String args[]){
        Dog2 d=new Dog2();
        d.work();
    }}
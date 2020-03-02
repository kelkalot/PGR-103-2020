package com.prg103.instanceofexamples;

class Animal { }


//downcasting is possible by instanceof operator.

class Dog3 extends Animal {
    static void method(Animal a) {

        if(a instanceof Dog3){
            Dog3 d=(Dog3)a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }

    public static void main (String [] args) {
        Animal a=new Dog3();
       //    Animal a=new Animal();
        Dog3.method(a);


        Animal aa = new Dog3();
        Dog3 d = (Dog3)aa; //Dog 'd' is referring to Animal reference 


    }

}


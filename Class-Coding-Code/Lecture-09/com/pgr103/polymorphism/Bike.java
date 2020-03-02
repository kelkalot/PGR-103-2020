package com.pgr103.polymorphism;
//An example of two classes Bike and Splendor.
// Splendor class extends Bike class and overrides its run() method.
// We are calling the run method by the reference variable of the parent class


class Bike{
    void run(){System.out.println("running");}
}
class Splendor extends Bike{
    void run(){System.out.println("running safely with 60km");}

    public static void main(String args[]){
        Bike b = new Splendor();//upcasting
        b.run();
    }
}
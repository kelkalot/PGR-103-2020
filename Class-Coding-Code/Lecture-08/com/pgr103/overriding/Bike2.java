package com.pgr103.overriding;

//Java Program to illustrate the use of Java Method Overriding
//Creating a parent class.
//Defined the run method in the subclass as defined in
// the parent class but it has some specific implementation.
// The name and parameter of the method are the same, and there
// is s IS-A relationship between the classes, so there is method overriding.


class Vehicle2{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike2 extends Vehicle2{
    //defining the same method as in the parent class: OVERRIDING
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}
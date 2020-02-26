package com.pgr103.overriding;

//A Java Program to demonstrate why we need method overriding
//Here, we are calling the method of parent class with a child
// class object.
//Creating a parent class

//The Problem is that we have to provide a specific implementation of the run()
// method in the subclass that shows the behaviour of the bike and not the vehicle.
// That is why we use method overriding.


class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike extends Vehicle{
    public static void main(String args[]){
        //creating an instance of child class
        Bike obj = new Bike();
        //calling the method with child class instance
        obj.run();
    }
}


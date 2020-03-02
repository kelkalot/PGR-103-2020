package com.prg103.instanceofexamples;

//In this example we will show how to use the operator instanceof
// in Java.This operator is a Type Comparison Operator and can
// be used when we want to check if an object is an instance of
// a specific class, an instance of a subclass, or an instance of
// a class that implements a particular interface. The instanceof
// operator compares an object to a specified type and returns
// true if the type of object and the specified type are the same.

//The operator instanceof has the following general form:

//object instanceof type

//In the above expression, object is an instance of a class,
// and type is a class type. If object is of the specified type
// in the right side of the expression or can be cast into that
// type, then the instanceof operator returns true, otherwise it
// returns false. Also, instanceof operator returns false if the
// object in the left side of the expression is null, no matter
// what the type is, because null is not an instance of anything.


public class InstanceofTest2 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        MotorCycle moto = new MotorCycle();

        // Those will evaluate to true
        System.out.println("vehicle instanceof Vehicle: "
                + (vehicle instanceof Vehicle));
        System.out.println("car instanceof Vehicle: "
                + (car instanceof Vehicle));
        System.out.println("car instanceof Car: " + (car instanceof Car));
        System.out.println("car instanceof DriveCar: "
                + (car instanceof DriveCar));
        System.out.println("moto instanceof Vehicle: "
                + (moto instanceof Vehicle));
        System.out.println("moto instanceof MotorCycle: "
                + (moto instanceof MotorCycle));

        // those will evaluate to false
        System.out.println("vehicle instanceof Car: "
                + (vehicle instanceof Car));
        System.out.println("vehicle instanceof DriveCar: "
                + (vehicle instanceof DriveCar));
        System.out.println("moto instanceof DriveCar: "
                + (moto instanceof DriveCar));

        // those will evaluate to false, as the object car is null
        car = null;
        System.out.println("(car=null) instanceof Vehicle: "
                + (car instanceof Vehicle));
        System.out.println("(car=null) instanceof Car: "
                + (car instanceof Car));
    }

}

class Vehicle {
}

class Car extends Vehicle implements DriveCar {
}

class MotorCycle extends Vehicle {
}

interface DriveCar {
}


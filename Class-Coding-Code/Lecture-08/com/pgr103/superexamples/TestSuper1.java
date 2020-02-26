package com.pgr103.superexamples;

//We can use super keyword to access the data member or
// field of parent class. It is used if parent class
// and child class have same fields.
// Animal and Dog both classes have a common property color.
// If we print color property, it will
// print the color of current class by default.
// To access the parent property, we need to use super keyword.

class Animal{
    String color="white";
}
class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
    }}
package com.pgr103.encapsulation;

//A Java class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.
public class Student{
    //private data member
    private String name;
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}
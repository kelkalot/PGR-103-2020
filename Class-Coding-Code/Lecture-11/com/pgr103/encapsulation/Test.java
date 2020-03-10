package com.pgr103.encapsulation;

//A Java class to test the encapsulated class.

class Test{
    public static void main(String[] args){
//creating instance of the encapsulated class
        Student s=new Student();
//setting value in the name member
        s.setName("Olav");
//getting value of the name member
        System.out.println(s.getName());
    }
}
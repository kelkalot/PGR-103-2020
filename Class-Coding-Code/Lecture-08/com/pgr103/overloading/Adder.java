package com.pgr103.overloading;

//In this example, we have created two methods,
// first add() method which performs addition of two numbers
// and a second add method which performs addition of three numbers.
//In this example, we are creating static methods so that we
// do not need to create an instance for calling methods.

class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}

class TestOverloading1{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }}

package com.pgr103.finalexamples;

//Inherited final method, cannot be overridden!
class Bike4{
    final void run(){System.out.println("running...");}
}
class Honda2 extends Bike4{
    public static void main(String args[]){
        new Honda2().run();
    }
}
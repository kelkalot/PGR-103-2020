package com.pgr103.finalexamples;

class Bike2{
    final void run(){System.out.println("running");}
}

class Honda extends Bike2{
   // void run(){System.out.println("running safely with 100kmph");} // Compiler error due to static method cannot be overridden!

    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}
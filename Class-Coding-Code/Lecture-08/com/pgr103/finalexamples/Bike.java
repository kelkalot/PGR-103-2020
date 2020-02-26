package com.pgr103.finalexamples;

//There is a final variable speedlimit, we are going to change the value of this variable,
// but It can't be changed because final variable once assigned a value can never be changed.

class Bike{
    final int speedlimit=90;//final variable
    void run(){
      //  speedlimit=400; //Compile error since final cnanot be changed!
    }
    public static void main(String args[]){
        Bike obj=new  Bike();
        obj.run();
    }
}//end of class
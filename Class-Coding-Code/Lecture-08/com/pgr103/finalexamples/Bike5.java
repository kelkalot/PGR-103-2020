package com.pgr103.finalexamples;

class Bike5{
    final int speedlimit;//blank final variable

    Bike5(){
        speedlimit=70;
        System.out.println(speedlimit);
    }

    public static void main(String args[]){
        Bike5 myBike = new Bike5();

        //Will not work because speedLimit is static and can only be initialized one in the constructor
        //myBike.speedlimit = 50;

    }
}

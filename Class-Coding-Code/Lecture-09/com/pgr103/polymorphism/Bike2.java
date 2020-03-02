package com.pgr103.polymorphism;
//Two classes have a data member speedlimit.
// We are accessing the data member by the reference
// variable of the parent class which refers to the subclass object.
// Since we are accessing the data member which is not overridden it
// will always access the data member of the parent class.


class Bike2{
    int speedlimit=90;
}
class Honda3 extends Bike2 {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike2 obj = new Honda3();
        System.out.println(obj.speedlimit); // will result in 90 not 150!
    }
}
package com.pgr103.overriding;

//Example to demonstrate the real world scenario of method overriding
//where three classes are overriding the method of a parent class.


//Creating a parent class.
class Bank{
    int getRateOfInterest(){return 0;}
}

//Creating child classes. Three different banks.
//Bank1
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}
//Bank2
class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
//Bank3
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}

//Test class to create objects and call the methods
class BankRateExample{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}

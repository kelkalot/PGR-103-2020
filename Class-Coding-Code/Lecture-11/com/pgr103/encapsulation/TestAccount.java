package com.pgr103.encapsulation;

//A Java class to test the encapsulated class Account.
public class TestAccount {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc=new Account();
        //setting values through setter methods
        acc.setAcc_no(9999904000L);
        acc.setName("Frank Sinatra");
        acc.setEmail("frank@ny.com");
        acc.setAmount(1500000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
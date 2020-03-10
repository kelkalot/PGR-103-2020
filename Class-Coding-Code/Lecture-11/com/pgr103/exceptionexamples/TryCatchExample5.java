package com.pgr103.exceptionexamples;

public class TryCatchExample5 {

    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
        }
        // handling the exception
        catch(Exception e)
        {
            // displaying the custom message
            System.out.println("Cannot be divided by zero");
        }
    }

}
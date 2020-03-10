package com.pgr103.exceptionexamples;

public class TryCatchExample3 {

    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
            // if exception occurs, the remaining statement will not exceute
            System.out.println("rest of the code");
        }
        // handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

    }

}

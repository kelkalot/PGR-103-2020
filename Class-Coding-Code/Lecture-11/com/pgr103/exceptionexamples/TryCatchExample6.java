package com.pgr103.exceptionexamples;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample6 {


    public static void main(String[] args) {


            PrintWriter pw;
            try {
                pw = new PrintWriter("hello world.txt"); //may throw exception
                pw.println("saved");
            }
            // providing the checked exception handler
            catch (FileNotFoundException e) {

                System.out.println(e);
            }
            System.out.println("File saved successfully");
        }
    }
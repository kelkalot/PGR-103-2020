//List of numbers example without the solution

import java.io.*;
        import java.util.Vector;

public class ListOfNumbersM {
    private Vector v;
    private static final int SIZE = 10;

    public ListOfNumbersM() {
        v = new Vector(SIZE);
        for (int i = 0; i < SIZE; i++)
            v.addElement(new Integer(i));
    }
    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < (SIZE + 1) ; i++)
                System.out.println("Value at: " + i + " = " + v.elementAt(i));

        }
        //TODO: Catch ArrayIndexOutOfBoundsException here!
        catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
        //TODO: Add finally here that closes the print writer if not null or doesn’t do anything if not print writer is open!

    }
}


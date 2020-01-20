//
// OPE 1 - Calculator
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
//     Read in a string allowing the values +, -, * and /.
//     After that read in two integer values and perform the operation based on what was provided in the string.
//
// Example:
//     For example. String input +, integer a 5 integer b 10, 5+10=15
//
// Hints:
//     You should be able to solve this with if and else.
//     As we learned in the lecture you cannot use == to check if the Strings are equal for this use:
//     if(text.equals("+"))
//         System.out.println("It was plus");
//
//
// We must import the Scanner before we can use it below
import java.util.Scanner;

public class OPE01
{
    public static void main(String[] args)
    {
        System.out.println("OPE 1 - Calculator");
        System.out.println("==============================");

        // Initialise a new Scanner object
        Scanner scan = new Scanner(System.in);

        // Read the operator string
        System.out.print("Operator (+, -, * or /): ");
        String operator = scan.nextLine();

        // Read first integer
        System.out.print("First integer: ");
        int num1 = scan.nextInt();

        // Read second integer
        System.out.print("Second integer: ");
        int num2 = scan.nextInt();

        // Do the operation
        int result = 0;
        if(operator.equals("+"))
            result = num1 + num2;
        else if(operator.equals("-"))
            result = num1 - num2;
        else if(operator.equals("*"))
            result = num1 * num2;
        else if(operator.equals("/"))
            result = num1 / num2;
        else
        {
            System.out.println("Operator \""+operator+"\" is not allowed");
        }

        // Print the result
        System.out.println("Result: "+result);
    }
}

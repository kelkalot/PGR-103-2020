//
// OPE 3 - StringSplotion
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// OPE text:
//     Given a non-empty string like "Code" return a string like "CCoCodCode".
//
// Example:
//     stringSplosion("Code") → "CCoCodCode"
//     stringSplosion("abc") → "aababc"
//     stringSplosion("ab") → "aab"
//
// Hints:
//     To solve this task you will need the substring fuction
//     A good overview of all string functions can be found here: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
//
// Solution by: Cytlan checked by kelkalot
//

// We must import the Scanner before we can use it below
import java.util.Scanner;

public class OPE03
{
	public static String stringSplosion(String input)
	{
		String result = "";

		// Get the length of the input string, so that we don't have to calculate it all the time in the loop below
		int inputLength = input.length();

		// Splode the string
		for(int i = 0; i <= inputLength; i++)
			result += input.substring(0, i);

		return result;
	}

	public static void main(String[] args)
	{
		System.out.println("OPE 3 - StringSplotion");
		System.out.println("==================================");

		// Scanner object
		Scanner scan = new Scanner(System.in);

		// Read input
		System.out.print("Write a string: ");
		String input = scan.nextLine();

		// Splode the string
		String result = stringSplosion(input);

		// Print the sploded string
		System.out.println("Sploded string: "+result);
	}
}

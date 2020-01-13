//
// OPE 2 - Tea Party
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// OPE text:
//     We are having a party with amounts of tea and candy (two int variables).
//     Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
//     A party is good (1) if both tea and candy are at least 5.
//     However, if either tea or candy is at least double the amount of the other one, the party is great (2).
//     However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
//
// Example:
//     teaParty(6, 8) → 1
//     teaParty(3, 8) → 0
//     teaParty(20, 6) → 2
//
// Solution by: Cytlan checked by kelkalot
//
//
// We must import the Scanner before we can use it below
import java.util.Scanner;

public class OPE02
{
	public static int teaParty(int tea, int candy)
	{
		// If tea or candy is less than 5, the party is bad.
		if(tea < 5 || candy < 5)
			return 0;

		// If the tea or candy is at least double the amont of the other, the party is great (2).
		if(tea >= candy * 2 || candy >= tea * 2)
			return 2;

		// All other cases, both the tea and candy are at least 5, so the party is good (2)
		return 1;
	}

	public static void main(String[] args)
	{
		System.out.println("OPE 2 - Tea Party");
		System.out.println("=============================");

		// Scanner object
		Scanner scan = new Scanner(System.in);

		// Read first integer
		System.out.print("How much tea: ");
		int tea = scan.nextInt();

		// Read second integer
		System.out.print("How much candy: ");
		int candy = scan.nextInt();

		// Have the party
		int partyResult = teaParty(tea, candy);

		// Print the party result
		if(partyResult == 0)
			System.out.println("The party was bad");
		else if(partyResult == 1)
			System.out.println("The party was good");
		else if(partyResult == 2)
			System.out.println("The party was great");
		// This should never happen:
		else
			System.out.println("The party threw an error (result was not 0, 1 or 2)");
	}
}

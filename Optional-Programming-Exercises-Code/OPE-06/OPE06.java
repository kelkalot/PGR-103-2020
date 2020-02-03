//
// OPE 6 - Ninja replied
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// Text:
//     (inspired by https://www.youtube.com/watch?v=1i8AHCZrJUk)
//     You’re are JB and send a message to Ninja.
//     Unfortunately the message is send randomly to two different Ninjas.
//     The real Nina and the Youtube Ninja...
//     If it was the Youtube Ninja he will reply with a nice message and you sending him a fried request so that you can play Fortnite together.
//     If it was the Real, One and Only Ninja you get a negative message and you have to apologise.
//
// Example:
//     <No example>
//
// Hints:
//     Java random with range is the way to go:
//         import java.util.Random;
//         Random rand = new Random();
//         // Obtain a number between [0 - 49].
//         int n = rand.nextInt(50);
//         // Add 1 to the result to get a number from the required range
//         // (i.e., [1 - 50]).
//         n += 1;
//
// Solution by: Cytlan checked by  kelkalot
//

import java.util.Scanner;
import java.util.Random;

public class OPE06
{
	public static void main(String[] args)
	{
		System.out.println("OPE 6 - Ninja replied");
		System.out.println("=================================");

		// Scanner object
		Scanner scan = new Scanner(System.in);

		// Random object for random numbers
		Random rand = new Random();

		// Ask the user to write a message
		System.out.print("Write a message to Ninja: ");
		scan.nextLine(); // We don't actually care what they wrote, so we won't save it.

		// Get a random number between 0 and 1
		int randomNinja = rand.nextInt(2);

		// 0 is Youtube Ninja
		if(randomNinja == 0)
		{
			System.out.println("Youtube Ninja got your message!");
			System.out.println("He's very happy and wants to play Fortnite with you.");
		}
		// 1 is the Real Ninja
		else
		{
			System.out.println("The Real Ninja got your message!");
			System.out.println("He's very angry that you think he's Youtube Ninja. He wants and apology.");
		}
	}
}

//
// OPE9 - Numbers in text
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// OPE text:
//     Given a string, return all digits appearing in the text and the sum of them.
//     Return 0 if there are no digits in the string.
//     To make it simpler the example texts only contain single value digits (0-9).
//
// OPE example:
//     <No examples>
//
// OPE hints:
//     To store the digits you find Arraylists can be handy. https://beginnersbook.com/2013/12/java-arraylist/
//     Character.isDigit(char) tests if a character is one of the characters '0', '1', .. '9'. Integer.parseInt(string) converts a string to an integer.
//
// Solution by: Cytlan checked by kelkalot
//

import java.util.ArrayList;

public class OPE9
{
	public static ArrayList<Integer> getNumbersInText(String str)
	{
		int strLen = str.length();
		String curNum = "";
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for(int i = 0; i < strLen; i++)
		{
			// Get a character
			char c = str.charAt(i);

			// If it's a digit, add it to our num string (So that we can parse more than single digits)
			if(Character.isDigit(c))
				curNum += c;
			// If it's not a digit, and we have something in out num string, parse it!
			else if(!curNum.isEmpty())
			{
				// Parse it and add it to the list
				int num = Integer.parseInt(curNum);
				numbers.add(num);

				// Reset the string
				curNum = "";
			}
		}

		return numbers;
	}

	public static void main(String[] args)
	{
		System.out.println("OPE9 - Numbers in text");
		System.out.println("====================================");

		// The text to process
		String myText = "Det var en gang en liten geitekilling som hadde lært å telle til 3003. " +
		                "Da han kom til en vannpytt, stod han lenge og så på speilbildet sitt i " +
		                "vannet, og nå skal du høre hvordan det gikk: 1, sa geitekillingen. " +
		                "Dette hørte en kalv som gikk i nærheten og åt gras. – Hva gjør du for noe? sa kalven. " +
		                "Jeg teller meg, sa geitekillingen. – Skal jeg telle deg også? Hvis det ikke gjør vondt, " +
		                "så, sa kalven. Det gjør det vel ikke, stå stille, så skal jeg telle deg også? " +
		                "Nei, jeg tør ikke, kanskje jeg ikke får lov av mora mi engang, sa kalven og " +
		                "trakk seg unna. Men geitekillingen fulgte etter, og så sa han: Jeg er 1, og du er 2, 1-2. " +
		                "Mo-er! rautet kalven og begynte å gråte, og så kom mora til kalven, og det var selveste bjellekua " +
		                "på garden. Hva er det du rauter for? sa bjellekua. Geitekillingen teller meg! rautet kalven. " +
		                "Hva er det for noe? sa bjellekua. Jeg teller, sa geitekillingen. Jeg har lært å telle til 3, " +
		                "jeg gjør bare sånn: Jeg er 1, kalven 2, kua 3, 1-2-3. Å, nå telte han deg også! rautet kalven. " +
		                "Og da bjellekua skjønte det, ble den sint. Jeg skal lære deg å gjøre narr av kalven min og meg! " +
		                "Kom, kalven min, så tar vin’n.";

		// Get all the numbers
		ArrayList<Integer> numbers = getNumbersInText(myText);

		// Sum and print them
		int listLen = numbers.size();
		int sum = 0;
		for(int i = 0; i < listLen; i++)
		{
			int n = numbers.get(i);
			System.out.println(n);
			sum += n;
		}

		// Print sum
		System.out.println("Sum: "+sum);
	}
}

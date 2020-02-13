//
// OPE 07 - Read File
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// OPE text:
//     In OPE we will learn how to read content from a file.
//     In the example we have a text file containing a lot of image names.
//     The main goal is to count the different types of images (jpeg, png and gif).
//     So for example if you have 5 jpeg images and 3 gifs the output should be 5 and 3.
//     We will use BufferedReader for this (https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)
//     The text file you should use is attached. (images.txt)
//     To check if your code work correct, you should get the following numbers:
//     jpeg: 208
//     png: 252
//     gif: 120
//
// OPE example:
//     <No examples>
//
// OPE hints:
//     <No hints>
//
// Solution by: Cytlan checked by kelkalot
//

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class OPE07
{
	public static void main(String[] args)
	{
		System.out.println("OPE 07 - Read File");
		System.out.println("==============================");

		// Hashmap where file extension is the key, and the file count is the value
		HashMap<String, Integer> counters = new HashMap<>();

		try
		{
			// New reader
			BufferedReader reader = new BufferedReader(new FileReader("images.txt"));
			String line;

			// While there are new lines read them
			while((line = reader.readLine()) != null)
			{
				// Print the current line
				System.out.println(line);

				// Downcase for consistency
				line = line.toLowerCase();

				// Find last .
				int dotPos = line.lastIndexOf('.');
				if(dotPos == -1)
					continue;

				// Get extension
				String ext = line.substring(dotPos + 1);

				// Increment value in out hashmap
				int c = 1;
				if(counters.containsKey(ext))
					c = counters.get(ext) + 1;
				counters.put(ext, c);
			}

			// Remember to close the file
			reader.close();
		}
		catch(IOException e)
		{
			// Could not read the file
			e.printStackTrace();
		}

		// Iterate through the map and print all the keys (file extensions) and value (file counts)
		for(Map.Entry<String, Integer> entry : counters.entrySet())
		{
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}

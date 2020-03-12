//
// OPE 11 - Merge Two
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// OPE text:
//      Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
//      Return a new array containing the first N elements from the two arrays.
//      The result array should be in alphabetical order and without duplicates.
//      A and B will both have a length which is N or more.
//      The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order,
//      copying elements directly to the new array.
//
// OPE example:
//     mergeTwo(["a", "c", “x”], ["b", "f", “x”], 3) → ["a", "b", "c"]
//     mergeTwo(["a", "c", “x”], ["c", "f", “x”], 3) → ["a", "c", "f"]
//     mergeTwo(["f", "g", “x”], ["c", "f", "g"], 3) → ["c", "f", "g"]
//
// OPE hints:
//     <No hints>
//
// Solution by: Cytlan checked by kelkalot
//

import java.util.ArrayList;
import java.util.Arrays;

public class OPE11
{
	// Helper function to turn an array into a comma-separated string
	public static String arrayToString(String[] arr)
	{
		String r = "";
		for(int i = 0; i < arr.length; i++)
			r += arr[i]+(i < arr.length - 1 ? ", " : "");
		return r;
	}

	// Merge two alphabetically sorted arrays
	// This function also accepts arrays of varying lengths
	public static String[] mergeTwo(String[] a, String[] b, int length)
	{
		ArrayList<String> n = new ArrayList<String>();

		int bLen = b.length;
		int bIndex = 0;
		int aLen = a.length;
		int aIndex = 0;
		String prevStr = "";

		// Loop until both arrays have reached the end
		while(aIndex < aLen || bIndex < bLen)
		{
			String candidate;

			// If a is empty, use b
			if(aIndex >= aLen)
				candidate = b[bIndex++];
			// If b is empty, use a
			else if(bIndex >= bLen)
				candidate = a[aIndex++];
			else
			{
				// Compare a and b
				int res = a[aIndex].compareTo(b[bIndex]);

				// Select the lowest string
				candidate = res <= 0 ? a[aIndex] : b[bIndex];

				// If equal, consume both, otherwise consume the lowest string
				if(res <= 0)
					aIndex++;
				if(res >= 0)
					bIndex++;
			}

			// Discard duplicates
			if(!candidate.equals(prevStr))
				n.add(candidate);
			prevStr = candidate;
		}

		// Convert ArrayList to array
		String[] nArr = n.toArray(new String[n.size()]);

		// If nArr is smaller than the desired length, return the whole set
		int newLen = length;
		if(nArr.length < newLen)
			newLen = nArr.length;

		// Return desired elements
		return Arrays.copyOfRange(nArr, 0, newLen);
	}

	public static void main(String[] args)
	{
		System.out.println("OPE11 - Merge Two");
		System.out.println("==============================");

		// Tests to make sure the merging algorithm produces the expected results
		String tests[][][] = {
			{
				{"a", "b", "c", "d", "e"},
				{"a", "b", "c"},
				{"a", "b", "c", "d", "e"}
			},
			{
				{"a", "b", "c"},
				{"a", "b", "c", "d", "e"},
				{"a", "b", "c", "d", "e"}
			},
			{
				{"a", "c", "c", "d", "f"},
				{"a", "f", "w", "x", "y", "z"},
				{"a", "c", "d", "f", "w", "x", "y", "z"}
			},
			{
				{"a", "b", "c", "f", "h"},
				{"b", "c", "c", "e"},
				{"a", "b", "c", "e", "f", "h"}
			},
			{
				{"a", "c", "d", "f"},
				{"b", "f", "x", "z"},
				{"a", "b", "c", "d", "f", "x", "z"}
			}
		};

		// Run through all tests
		boolean anyTestFailed = false;
		for(int i = 0; i < tests.length; i++)
		{
			String[][] test = tests[i];
			String[] a = test[0];
			String[] b = test[1];
			String[] expected = test[2];

			// Test parameters
			System.out.println("Test "+i);
			System.out.println("--------");
			System.out.println("Array a:  "+arrayToString(a));
			System.out.println("Array b:  "+arrayToString(b));

			// Merge operation
			String[] c = mergeTwo(a, b, 8);

			// Operation results
			System.out.println("Merged:   "+arrayToString(c));
			System.out.println("Expected: "+arrayToString(expected));

			// Test result
			boolean fail = c.length != expected.length;
			for(int j = 0; j < expected.length; j++)
			{
				if(!expected[j].equals(c[j]))
					fail = true;
			}
			anyTestFailed = anyTestFailed || fail;
			System.out.println("Result:   "+(fail ? "Fail" : "Pass"));
			System.out.println();
		}

		// Overall result
		System.out.println("Test results: "+(anyTestFailed ? "Fail" : "Pass"));
		System.out.println();
	}
}

//
// OPE 08 - Sorting
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// OPE text:
//     The OPE is targeting a problem that comes up quite often when you program: How to sort an array.
//     The goal is to sort a given array from smallest to largest value and print the results to the console.
//
// OPE example:
//     <No examples>
//
// OPE hints:
//     <No hints>
//
// Solution by: Cytlan  checked by kelkalot
//

import java.util.ArrayList;
import java.util.Scanner;

public class OPE08
{
	// Partition the array
	public static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j < high; j++)
		{
			if(arr[j] <= pivot)
			{
				i++;

				// Swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Swap
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	// Quicksort
	public static void quicksort(int arr[], int low, int high)
	{
		if(low < high)
		{
			// Split the array
			int pindex = partition(arr, low, high);

			// Sort each half recursively
			quicksort(arr, low, pindex - 1);
			quicksort(arr, pindex + 1, high);
		}
	}

	// Print an array of ints
	public static void printIntArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);

			// If we're not at the last element in the array, print a comma
			if(i < arr.length - 1)
				System.out.print(", ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		System.out.println("OPE08 - Sorting");
		System.out.println("============================");

		// List to hold all the numbers (We don't know how many numbers the user will give us. A list is good here, because it's size is dynamic)
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Scanner object
		Scanner scanner = new Scanner(System.in);

		// Ask the user for numbers
		System.out.println("Enter random numbers, end by entering a blank number");
		int numCount = 1;
		while(true)
		{
			System.out.print("Number "+numCount+": ");
			String numStr = scanner.nextLine();

			// If the line is blank, exit the while loop
			if(numStr.isEmpty())
				break;

			// Otherwise add it to the list
			numbers.add(Integer.parseInt(numStr));
			numCount++;
		}

		// Convert the list into an array
		int arrSize = numbers.size();
		int intArr[] = new int[arrSize];
		for(int i = 0; i < arrSize; i++)
			intArr[i] = numbers.get(i);

		// Print the unsorted array
		System.out.println("Unsorted array:");
		printIntArray(intArr);

		// Sort the array
		quicksort(intArr, 0, arrSize - 1);

		// Print the sorted array
		System.out.println("Sorted array:");
		printIntArray(intArr);
	}
}

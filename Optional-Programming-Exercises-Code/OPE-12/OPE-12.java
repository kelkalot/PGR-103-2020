//
// OPE12 - Towers of Hanoi
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// OPE text:
//     The 'Towers of Hanoi' is a classical problem used to illustrate the power of recursion.
//     It is often used in coding interviews (most of the time with k discs instead of 3 to increase complexity).
//
//     The puzzle goes as follows.
//     There are three poles and 64 discs of different sizes.
//     Initially, all the discs are placed on the first pole with the largest disc at the bottom and the smallest one at the top.
//     We need to move all the discs from the first pole to the third pole, with the smallest disc at the top and the largest at the bottom
//     We can move only one disc at a time (which should be the topmost disc) and at any point of time,
//     a larger disc cannot be placed over a smaller one i.e. all the discs on a pole must be placed in such a way that the smallest is at the top and the largest
//     at the bottom. The second pole can be used as an intermediate pole to help us in transferring the discs.
//     This puzzle can be solved using recursion. For a moment, assume that there are just two discs
//     (disc 1 and 2; disc 2 being the larger one) on the first pole. The solution consists of three steps.
//     Step 1: Move disc 1 from pole 1 to pole 2.
//     Step 2: Move disc 2 from pole 1 to pole 3.
//     Step 3: Move disc 1 from pole 1 to pole 3.
//     Now, assume that disc 1 is not a single disc but a collection of discs.
//     The procedure would be similar to the above three steps, but steps 1 and 3 would be a collection of steps.
//     Step 1 would be to move the n-1 discs (assuming that there were a total of n discs) from pole 1 to pole 2.
//     For moving these (n -1) discs, we again follow the same strategy of considering them as 1 disc plus a set of n-2 discs.
//     Step 3 would also be similar. This gives us the recursive solution.
//
//     Recursive Algorithm
//     The recursive solution to move n discs from the start pole to the end pole using an auxiliary pole is given below.
//
//     Base Case - When n = 1
//     Move the disc from start pole to end pole
//
//     Recursive Case - When n > 1
//     Step 1: Move (n-1) discs from start pole to auxiliary pole.
//     Step 2: Move the last disc from start pole to end pole.
//     Step 3: Move the (n-1) discs from auxiliary pole to end pole.
//     Steps 1 and 3 are recursive invocations of the same procedure.
//
//     Write a method solve() that takes four arguments :
//     n - the number of discs in the puzzle
//     start, auxiliary, end -the names of the three poles which will be used for printing the solution
//
// OPE example:
//     <No example>
//
// OPE hints:
//     <No hints>
//
// Solution by: Cytlan checked by kelkalot
//

import java.util.ArrayList;
import java.util.Arrays;

// This class represents a disc, and is pretty dumb on its own
class Disc
{
	// Private members cannot be accessed from outside the class
	private int size;
	private Pole pole;

	public Disc(int size)
	{
		this.size = size;
		this.pole = null;
	}

	// Get the private size
	public int getSize()
	{
		return size;
	}

	// Get the pole
	public Pole getPole()
	{
		return pole;
	}

	// Set the pole
	public void setPole(Pole pole)
	{
		this.pole = pole;
	}

	// Convert to string
	public String toString()
	{
		return ""+getSize();
	}
}

// This class represents a pole, and can hold any number of discs
class Pole
{
	ArrayList<Disc> pole;

	public Pole()
	{
		pole = new ArrayList<Disc>();
	}

	// Add a disc top the top of this pole
	public void push(Disc disc)
	{
		pole.add(disc);
	}

	// Look at the disc on the top of this pole
	public Disc top()
	{
		int poleSize = pole.size();

		// If the pole is empty, return nothing
		if(poleSize == 0)
			return null;

		// Otherwise return the top disc
		return pole.get(poleSize - 1);
	}

	// Get and remove the disc on the top of this pole
	public Disc pop()
	{
		int poleSize = pole.size();

		// If the pole is empty, return nothing
		if(poleSize == 0)
			return null;

		// Get the disc
		Disc disc = pole.get(poleSize - 1);

		// Remove the disc from the pole
		pole.remove(poleSize - 1);
		disc.setPole(null);

		// Return the disc
		return disc;
	}

	// Convert the pole to a string
	public String toString()
	{
		int poleSize = pole.size();
		String s = "";
		for(int i = 0; i < poleSize; i++)
			s += pole.get(i).getSize() + (i < poleSize - 1 ? ", " : "");
		return s;
	}
}

// The Tower class contains all the discs and poles used in a game of Towers of Hanoi
// It also contains the solving algorithm
class Tower
{
	private Pole poles[];
	private Disc discs[];

	private int numberOfDiscs;
	private int numberOfPoles = 3; // You can solve it for more poles, but that needs a new algorithm!

	// Create a new tower
	public Tower(int numberOfDiscs)
	{
		// Create the poles
		poles = new Pole[numberOfPoles];
		for(int i = 0; i < numberOfPoles; i++)
			poles[i] = new Pole();

		// Create the array to hold our discs
		discs = new Disc[numberOfDiscs];
		this.numberOfDiscs = numberOfDiscs;

		// Create the discs and give them each a size greater than the previous
		for(int i = 0; i < numberOfDiscs; i++)
			discs[i] = new Disc(i);

		// Add all disks to the first pole, with the largest disc at the bottom
		for(int i = numberOfDiscs - 1; i >= 0; i--)
			poles[0].push(discs[i]);
	}

	// Helper function to print the condition that resulted in an illegal move being attempted
	private void printIllegalMove(Pole fromPole, Pole toPole)
	{
		System.out.println("Illegal move");
		System.out.println("From "+fromPole);
		System.out.println("To   "+toPole);
	}

	// Move from one pole to another, and enforce the rules of the game
	public boolean move(Pole fromPole, Pole toPole)
	{
		// Make sure the poles are valid
		if(fromPole == null || toPole == null)
		{
			printIllegalMove(fromPole, toPole);
			return false;
		}

		// Get the disc to move
		Disc disc = fromPole.top();

		// If disc is null, then the pole was empty
		if(disc == null)
		{
			printIllegalMove(fromPole, toPole);
			return false;
		}

		// Make sure the to pole has a disc that's larger than the disc to move
		Disc toDisc = toPole.top();
		if(toDisc != null && toDisc.getSize() < disc.getSize())
		{
			printIllegalMove(fromPole, toPole);
			return false;
		}

		// Remove the disc from the from pole
		fromPole.pop();

		// Add the disc to the new pole
		toPole.push(disc);

		return true;
	}

	// Overload solve(), because the internal solver and all the poles are private, we need ths helper function
	public boolean solve()
	{
		// Call the internal solver with the initial values
		return solve(numberOfDiscs, poles[0], poles[1], poles[2]);
	}

	// Solver algorithm
	private boolean solve(int n, Pole source, Pole auxiliary, Pole target)
	{
		// We'll return false on illegal moves.

		// Recursive Case - When n > 1
		if(n > 1)
		{
			// Step 1: Move (n-1) discs from start pole to auxiliary pole.
			if(!solve(n - 1, source, target, auxiliary))
				return false;

			// Step 2: Move the last disc from start pole to end pole.
			if(!move(source, target))
				return false;

			// Print progress
			System.out.println(this);

			// Step 3: Move the (n-1) discs from auxiliary pole to end pole.
			if(!solve(n - 1, auxiliary, source, target))
				return false;
		}
		//     Base Case - When n = 1
		//     Move the disc from start pole to end pole
		else if(n == 1)
		{
			if(!move(source, target))
				return false;
		}
		return true;
	}

	// Convert the tower to a string
	public String toString()
	{
		String s = "";
		for(int i = 0; i < numberOfPoles; i++)
			s += "["+i+"] "+poles[i]+"\n";
		return s;
	}
}

public class OPE12
{

	public static void main(String[] args)
	{
		System.out.println("OPE12 - Towers of Hanoi");
		System.out.println("====================================");

		// Create a new tower
		Tower tower = new Tower(3);

		// Print the initial tower
		System.out.println("Initial tower:");
		System.out.println(tower);

		// Solve it
		tower.solve();

		// Print the solved tower
		System.out.println("Solved tower:");
		System.out.println(tower);
	}
}

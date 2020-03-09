//
// OPE 10 - Game of Life
// For PGR103 Object-oriented Programming 2020
// Kristiania University College
//
// Challenge text:
//     This OPE is about the Game of Life.
//     Not this one: https://www.youtube.com/watch?v=hAvwGtRY7RA but the one of Conway (https://en.wikipedia.org/wiki/John_Horton_Conway).
//     The idea behind it is quite intuitive. We want to simulate the evolution of cells.
//     The input is a starting state and some "Rules of Life" that the cells have to follow.
//     More details can be found here about the Game of Life and a more visual explanation (https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life, https://bitstorm.org/gameoflife/).
//     Its a very interesting and fun problem for programmers and it is a good idea to include an implementation in your code portfolio if you planning to have one!
//     For this challenge we will keep it to the basics but feel free to expand once you managed to solve them.
//
//     Initially, there is a grid with some cells which may be alive or dead.
//
//     Our task to generate the next generation of cells based on the following rules of life:
//         1. Any live cell with fewer than two live neighbors dies, as if caused by under population.
//         2. Any live cell with two or three live neighbors lives on to the next generation.
//         3. Any live cell with more than three live neighbors dies, as if by overpopulation.
//         4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
//
// Challenge example:
//     See original challenge post.
//
// Challenge hints:
//     <No hints>
//
// Solution by: Cytlan checked by kelkalot
//

import java.util.Random;
import java.util.Scanner;

class World
{
	private int width;
	private int height;
	private int[] currentWorld; // This is the world we read from
	private int[] nextWorld;    // This is the world we write to
	private Random random = new Random();

	// Constructor
	public World(int width, int height)
	{
		this.width = width;
		this.height = height;

		// Create and initialize the world
		currentWorld = new int[width * height];
		nextWorld = new int[width * height];
		clear();
	}

	// Clear the world
	public void clear()
	{
		for(int i = 0; i < width * height; i++)
			currentWorld[i] = 0;
	}

	// Create a random world
	public void randomize()
	{
		for(int i = 0; i < width * height; i++)
			currentWorld[i] = random.nextInt(2);
	}

	// Set all cells of the world
	// Number of given cells must be equal to the number of cells in the world!
	public void setWorld(int ... cells)
	{
		// Must fill entire world!
		if(cells.length != width * height)
			return;

		for(int i = 0; i < width * height; i++)
			currentWorld[i] = cells[i];
	}

	// World width
	public int getWidth()
	{
		return width;
	}

	// World height
	public int getHeight()
	{
		return height;
	}

	// Count the number of neighbours of any given cell in an infinitely repeating world
	private int countNeighrbours(int x, int y)
	{
		int aliveNeightbours = 0;

		// Count alive neighbours
		for(int i = -1; i < 2; i++)
		{
			for(int j = -1; j < 2; j++)
			{
				// Don't count the current cell
				if(i == 0 && j == 0)
					continue;

				if(getCell(wrapX(x + i), wrapY(y + j)) != 0)
					aliveNeightbours++;
			}
		}
		return aliveNeightbours;
	}

	// Wrap X and Y coordintes to create an infinitely repeating world
	public int wrapX(int x)
	{
		if(x < 0)       x += width;
		if(x >= width)  x -= width;
		return x;
	}
	public int wrapY(int y)
	{
		if(y < 0)       y += height;
		if(y >= height) y -= height;
		return y;
	}

	// Get a current cell
	public int getCell(int x, int y)
	{
		return currentWorld[(y * width) + x];
	}

	// Kill cell in current world
	public void killCell(int x, int y)
	{
		currentWorld[(y * width) + x] = 0;
	}

	// Populate cell in current world
	public void populateCell(int x, int y)
	{
		currentWorld[(y * width) + x] = 1;
	}

	// Kill cell in next world
	private void killNextCell(int x, int y)
	{
		nextWorld[(y * width) + x] = 0;
	}

	// Populate cell in next world
	private void populateNextCell(int x, int y)
	{
		nextWorld[(y * width) + x] = 1;
	}

	// Run 1 simulation step
	public void tick()
	{
		for(int y = 0; y < height; y++)
		{
			for(int x = 0; x < width; x++)
			{
				// Game of Life algorithm
				int cell = getCell(x, y);
				int neighbours = countNeighrbours(x, y);

				// Death by under-population
				if(neighbours < 2)
					killNextCell(x, y);
				// Stabile population
				else if(cell != 0 && neighbours == 2)
					populateNextCell(x, y);
				// Growing population
				else if(neighbours == 3)
					populateNextCell(x, y);
				// Death by over-population
				else if(neighbours > 3)
					killNextCell(x, y);
				// Blank cell, but we must make sure to clear any garbage in it from the previous world
				else
					killNextCell(x, y);
			}
		}

		// Swap the worlds
		int[] t = currentWorld;
		currentWorld = nextWorld;
		nextWorld = t;
	}

	public String toString()
	{
		String s = "";
		for(int i = 0; i < width * height; i++)
		{
			s += currentWorld[i] != 0 ? "██" : "  ";
			if(i > 0 && (i % width == 0))
				s += "\n";
		}
		return s;
	}
}

public class OPE10
{
	public static void main(String[] args)
	{
		System.out.println("OPE 10 - Game of Life");
		System.out.println("=================================");

		Scanner scanner = new Scanner(System.in);
		World world;

		System.out.print("Which do you want to run the Figure-8 oscillator? (y/N): ");
		String res = scanner.nextLine();
		if(res.toLowerCase().equals("y"))
		{
			// Figure-8 oscillator
			world = new World(16, 16);
			world.setWorld(
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,
				0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,
				0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,
				0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,
				0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
			);
		}
		else
		{
			// Random world
			world = new World(16, 16);
			world.randomize();
		}

		// Make a separating string based on the world size, so that we more easily can tell one generation from the next
		String separator = "";
		for(int i = 0; i < world.getWidth() * 2 + 2; i++)
			separator += "-";

		System.out.print("How many generations? (0 for infinite): ");
		String generationsStr = scanner.nextLine();
		int generations = 0;

		// If no string was given, assume infinite
		if(!generationsStr.isEmpty())
			generations = Integer.parseInt(generationsStr);
		if(generations == 0)
			generations = -1;

		// Print initial world
		System.out.println(world);
		try
		{
			while(generations != 0)
			{
				// Run simulation
				world.tick();

				// Print resulting world
				System.out.println(separator);
				System.out.println(world);

				// Delay, so that we can see what's going on :)
				Thread.sleep(100);

				// Decrement generations counter
				if(generations != -1)
					generations--;
			}
		}
		catch(InterruptedException e)
		{
			// Ignore
		}
	}
}

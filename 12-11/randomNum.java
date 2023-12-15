public class randomNum {
	public static void main(String[] args) {
		/*
		 * RANDOM NUMBERS
		 *
		 * There are two ways we can generate random nums
		 * 	1. Math.random()
		 * 	2. Using the Random class
		 *
		 * Math.random()
		 *
		 * static double random()
		 * 	returns a random double value in the range [0, 1)
		 *
		 * How do I get numbers other outside of that range?
		 * 	Multiply, or add
		 *
		 * 	Random int 6 to 17
		 * 		1. Find the diff of 17 and 6: 11
		 * 		2. Find the offset from 0: 6
		 *		> int randint = (int)(Math.random()*12) + 6
		 *			Why multiply by 12?
		 *			because it will never be 11
		 *			and 11.999999 truncates to 11
		 *
		 *	Random double -3 to 3
		 *		1. Find the diff of 3 and -3: 6
		 *		2. Find the offset requried: -0.5 (because 0 to 1)
		 *		> double randouble = (Math.random()-0.5)*6
		 *
		 *		what about an int -3 to 3
		 *		> int randint (int)((Math.random()-0.5)*6) 
		 *
		 * Using the Random class
		 *
		 * First import random
		 * 
		 * 	> import java.util.Random;
		 *
		 * Init a random Object
		 * 	
		 * 	> Random rng = new Random()
		 * 	or 
		 * 	> Random rng = new Random(seed (a long))
		 *
		 * How to use:
		 *
		 * 2 primary functions
		 *
		 * Random.nextInt()
		 * 	Returns a random integer, within the total range 
		 * 	of an int
		 *
		 * Random.nextInt(int bound)
		 * 	Returns a random integer, within the range [0, bound)
		 *
		 * Random nextDouble()
		 * 	Returns a doulbe in the range [0.0, 1.0)
		 * 	uniformly distributed
		 * 		
		 */
	}
}

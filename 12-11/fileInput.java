public class fileInput {
	public static void main(String[] args) {
		/*
		 * There is a file class in java
		 *
		 * You must import these:
		 *
		 *	> import java.io.File; -> The actual class itself
		 *	> import java.io.FileNotFoundException; -> An exception needed
		 *	
		 * To create a new File object:
		 *
		 * 	> File file = new File("FILE_LOCATION");
		 *
		 * Because it is not guaranteed that the file you want will exist,
		 * it is mandatory that you put all your code that uses a file inside
		 * of a try/catch block, with the catch part looking for FileNotFoundExceptions
		 *
		 * 	> try {
		 *      > 	File file = new File("FILE_LOCATION");
		 * 	>	-- whatever code --
		 * 	> }
		 * 	> catch (FileNotFoundException e) {
		 * 	> 	-- handle exceptions --
		 * 	> }
		 *
		 * Now that we have a file, we need a way to read the contents of it.
		 * One way to read the contents of a file is to use the Scanner class.
		 *
		 * 	> import java.util.Scanner; 
		 *
		 * Initialize a scanner object
		 * 	
		 *	> Scanner input = new Scanner(file);
		 *	> -- or --
		 *	> Scanner input = new Scanner(new File("FILE_LOCATION"));
		 *
		 * The scanner breaks the file into "tokens" and the sequentially
		 * looks through each of them
		 *
		 * What is a token? 
		 *
		 * The entire input (stream) is split into individual tokesn by delimiters,
		 * which are by default whitespace
		 *
		 * The quick brown fox 12 22 3
		 *    ^     ^     ^   ^  ^  ^
		 *
		 * "^" is where a delimiter is, and where the entire input is split to make
		 * a token
		 *
		 * hasNext__ methods:
		 *
		 * We need to make sure that before we even read data from the file
		 * (and go to the next token) that we have data available to read in
		 * the first place
		 *
		 * boolean Scanner.hasNext() 
		 * 	returns true if a token exists at the input
		 *
		 * boolean Scanner.hasNextLine() 
		 * 	returns true if there is another line in the input
		 *
		 * boolean Scanner.hasNextInt()
		 * 	returns true if there is another line in the input
		 *
		 * boolean Scanner.hasNext__() 
		 *  	basically there is the same version of the methods
		 *  	mentioned above but for all types
		 *
		 * next__ methods:
		 *
		 * Now that we know that there is a token that can be read in, 
		 * we must actually read it.
		 *
		 * String next() 
		 * 	returns next complete token
		 *
		 * String nextLine()
		 * 	returns line of text from scanner
		 *
		 * int nextInt()
		 * 	returns the next int, does not read text as an int
		 * 	returns an exception (InputMismatchException) if 
		 * 	the next token cannot be interpreted as an integer
		 *
		 * double nextDouble()
		 *	returns the next token as a double (only consumes doubles)
		 *
		 * double nextBoolean()
		 * 	returns the next token as a boolean (only consumes booleans)
		 *
		 * Splitting inputs:
		 *
		 * Lets say that your input is seperated by something weird
		 * 	You can read in the entire line as a String,
		 *	then use the String method split(String regex)
		 * 	to turn the String into a String array, split by the regex
		 *
		 * 	> String input = "HiFISHmyFISHnameFISHisFISHbob";
		 *                          ^^^^  ^^^^    ^^^^  ^^^^
		 *      > String[] splitArr = input.split("FISH");
		 *      > System.out.println(splitArr.toString());
		 *
		 *      $ {"Hi", "my", "name", "is", "bob"}
		 *
		 *		 
		 */
	}
}

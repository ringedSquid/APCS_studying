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
		 *
		 *
		 * 	  
		 *
		 *
		 * 
	}
}

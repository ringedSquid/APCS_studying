public class dataTypes {
	public static void main(String[] args) {
		/*
		 * There are different data types in java,
		 * each with their own range of values.
		 * The type of datatype to use depends heavily
		 * on the situation at hand.
		 *
		 * There are 4 types of primitive data types
		 * 	Integer types
		 * 	Floating point types
		 *	Booleans
		 *	Characters (technically integers)
		 *
		*/

		//Integer types
		
		//long: range of -2^63 to 2^63 - 1
		long longer = 0;

		//int: range of -2^31 to 2^31 - 1
		int integer = 0;

		//short: range of -2^15 to 2^15 - 1
		short shorter = 0;

		//byte: range of -2^7 to 2^7 - 1
		byte byter = 0;


		//Floating point types

		//float: 4 bytes, 7 sig digs
		float floater = 0.0;

		//double: 8 bytes, 16 sig digs
		double doubler = 0.0;

		
		//Boolean types
		boolean booler = false;

		
		//Character types
		//NOT COMPATIBLE WITH NUMBER TYPES
		char charer = "A";

		
		/* Widening (Automatic conversion)
		 *
		 * This is an automatic process
		 * Happens when you assign a smaller data type to a
		 * larger one
		 *
		 * For example in a print statement
		 * print(int + byte + short + float)
		 * The output would be a float
		 *
		 * Byte -> Short -> Int -> Long -> Float -> Double
		 *
		 * int + double = double
		 *
		 * short + int = int
		 * byte + float = float
		 *
		 * It seems that chars will automatically
		 * be displayed as numbers on print whenever 
		 * arithmetic is done on them
		 * 	well chars are numbers anyway
		 *
		 */

		//The final result would be a double
		System.out.println(1.0 + 3 * 4 * 6.0);

		/* Strings
		 *
		 * A string is a non-primitive datatype
		 * (Starts with a capital letter)
		 *
		 * Strings are reference variables
		 * 	Meaning that they themselves do not
		 * 	hold data themselves but are instead
		 * 	pointers to a location in memory
		 * 	that contains that data
		 *
		 * Strings are immutable, meaning that their values cannot
		 * be changed.
		 * 
		 * Then how come strings can be concatenated?
		 * 	What is really happening is that
		 * 	When you concatenate a string,
		 * 	The two strings create a new buffer string,
		 * 	and the address of that buffer string gets 
		 * 	assigned to the original string variable 
		 * 	(Lets call it string pointer)
		 *
		 * 	String a -> adress 5000;
		 * 	a += "ebc" //Buffer is created;
		 * 	a -> adress 6969 //Some new address;
		 *
		 * Primitives and Strings are immutable
		 *
		 * Strings have some methods attached to them!
		 * 	You should already know these
		 * 	substring(start, end)
		 * 	charAt(index)
		 * 	indexOf(char or substring, optional fromIndex)
		 * 	lastIndexOf(char or substring optional fromindex) 
		 * 		looks backwards from fromIndex
		 * 	compareTo(other)
		 * 		lexicographic comparison
		 *	length()
		 *	
		 *	THESE METHODS WORK ON BUFFER STRINGS
		 *		i.e: "abc".length() returns 3
		 *
		 */

		/* Arrays
		 *
		 * Arrays are mutable
		 * 	meaning that you can change the contents of an 
		 * 	array from anywhere within the program
		 * 	like a pointer in C
		 * 		array a = {1, 2, 3}
		 * 		//From a seperate method
		 * 		a[1] = 0
		 * 		//Back to main
		 * 		array a = {1, 0, 3}
		 *
		 * The array variable is actually just a pointer
		 * to the array data in memory (A reference value)
		 *
		 * Declaring arrays!
		 *
		 * type[] variable; 
		 * 	Initialized the pointer to an array
		 * 	But it points to nothing!!!
		 * 	Throws an error if something isnt
		 * 	initialized (Anything uninitialized in java
		 * 	gets an error thrown when accessed)
		 *
		 * initializing an array 
		 * 
		 * type[] variable = new type[20];
		 *	Creates 20 empty types somewhere in memory
		 *	and makes variable point to them
		 *	all of the elements of the array are 
		 *	initialized to zero (0.0) whatever zero is
		 *
		 * If you want to put data in the initialized variable:
		 *
		 * int[] a = new int[] {1, 2, 3, 4}
		 * int[] b = new int[2] {1, 2}
		 *
		 * initialized array must have n elements when declared!!!
		 * new int[n] = {a0, an}
		 *
		 * or you could also:
		 * int[] c;
		 * c = new int[] {1, 2, 3, 4}
		 *
		 * or even:
		 *
		 * int[] d = {1, 2, 3, 4}
		 * this shortcut is nice, but not reccomended
		 * 
		 * d = {1, 2, 3} 
		 * ^THIS IS ILLEGAL AND DOESNT WORK
		 *
		 * if you want to make a larger array,
		 * you need to reassign the pointer
		 *
		 * comparing arrays doesnt work as you thing
		 * int[] a = new int[];
		 * int[] b = new int[];
		 * a == b is FALSE
		 * 	The addresses in a and b are compared
		 * 	not the actual data they point to
		 *
		 * a = b
		 * assigns the address content of b to a
		 * a == b is TRUE
		 * a now points to the data b points to
		 * the original data a pointed to is gone 
		 * unless something else also points to it
		 * 	analogy if nobody loves you, you disappear
		 *
		 * arrays have a property attache to them
		 * array.length  
		 * gives the length of the array (not a method)
		 *
		 * acsessing elements of an array
		 * a[n] = something
		 * 	changes the value of a[n]
		 * 	arrays are mutable
		 *
		 * a[n] += something
		 *
		 * What about an array of references to arrays?
		 * 2D arrays YAYAYAYAYAYAYAYYYY
		 *
		 * Initialize a 2D array like so
		 *
		 * type[][] variable;
		 * variable = new type[][] { {1, 2}, {2} }
		 * 	Notice that the arrays can be of different lengths
	         *	That's beause its a reference type
		 *
		 * all the stuff from 1D arrays applies to 2D arrays as well
		 *
		 */
	}
}
		
		
	


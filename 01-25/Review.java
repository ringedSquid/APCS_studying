public class Review {
	/*
	 * Things I need to review
	 * 
	 * Random numbers
	 * 	Math.random()
	 * 		returns a random double in the range [0, 1)
	 *
	 * 	How to use this:
	 * 		[2, 9)
	 * 		9 - 2 = 7,
	 * 		(Math.random()*7)+2
	 *
	 * 		Integers [3,5]
	 * 		5 - 3 = 2
	 * 		(int)(Math.random()*3)+3
	 * 		why do we do 3
	 * 			Integer rounding truncate
	 *
	 * 		[-3, 3)
	 * 		(Math.random()-0.5)*6
	 *
	 * Random Class
	 * 	Random is a class
	 * 	> Random rng = new Random()
	 *
	 * 	Random.nextInt()
	 * 		Returns a random integer
	 * 		the range is all possible integers
	 *
	 * 	Random.nextInt(int bound)
	 * 		Returns a random integer between [0, bound)
	 *
	 * 	Random.nextDouble()
	 * 		Returns a double in the range [0.0, 1.0)
	 *
	 * ArrayList
	 * 	Data structure in Java
	 * 		Resizable array
	 *
	 * 	Constructor
	 * 	ArrayList<E> a = new ArraList<E>(int initialCapacity)
	 * 		initialCapcity defaults to 10 for the no arg constructor
	 *
	 * 	void add(int index, E element)
	 * 		adds to certain index, shifts everything to the right
	 *
	 * 	void add(E e)
	 * 		adds element to end of list
	 *
	 * 	E get(int index)
	 * 		gets element at certain index
	 *
	 * 	int size()
	 * 		returns elements inside list
	 * 		NOT initialCapcity!!
	 *
	 * 	E remove(int index)
	 * 		removes element at index, then returns it
	 *
	 * 	boolean remove(Object o)
	 * 		removes first instanc of element in list
	 *
	 * String Methods
	 * 	char charAt(int index)
	 * 		returns char at index
	 *
	 * 	int compareTo(String anotherString)
	 * 		compares this string to anotherString lexicographically
	 *
	 * 		this.charAt(k) - anotherString.charAt(k)
	 *
	 * 		If indexes do not differ, the diff in lenght are shown
	 *
	 * For, Each loops
	 * 	nah
	 * 	cant add to arraylist inside for each loop :(
	 *
	 * Variable types
	 * 	final -> variable that cannot be modified
	 *
	 * Overriding methods 
	 * 	inside subclass,
	 * 	has to have same return type and arguments
	 *
	 * Subclasses
	 * 	blah blah extends blah blah
	 * 	the methods refered are default to the subclass ones
	 *
	 * 	when no constructors are provided, the default no args constructor is created
	 *
	 *
	 * Principles of OOP
	 * 	encapsulation
	 * 		hide data of implementation
	 * 	inheritance
	 * 		inheritance
	 * 	polymorphism
	 * 		two types, is-a blajh bah
	 * 	abstraction
	 * 		yk thios
	 *
	 * Arrays, initialization
	 * 	int[][] a = new int[][]{};
	 * 	int a[] = {};
	 * 	^shortcut
	 *      
	 *
	 *
	 * Order of operations

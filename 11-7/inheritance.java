public class Inheritence {
	/*
	 * What is Inheritence???
	 *
	 * You can create a new class that is based off of an old class!
	 * class newclass extends oldclass
	 *
	 * The new class (subclass) will inherit all the members (fields, methods)
	 * of the class is was derived from (superclass) 
	 *
	 * Hierarchial inheritence and single and multilevel are supported in java
	 * Hierarchial - many classes can be derived from the same one
	 * Single - obvious yk
	 * Multilevel A -> B -> C
	 * 	C is a child of B, descendant of A
	 *
	 * In a subclass you cannot access any private methods or fields 
	 * of the superclass.
	 * 	However you can use accessor methods
	 * You can use public methods and access public fields
	 * you can declare fields in the subclass that arent in the
	 * superclass
	 * You can override methods/fields of the superclass
	 *
	 * you can use constructors of the superlcass super()
	 * 
	 * If no constructor is made for the subclass
	 * the compiler automatically does
	 *
	 * subclass() {
	 * 	super()
	 * 	^Must be first call in constructor
	 * }
	 *
	 * makes a constructor and calls default constructor of the superclass
	 * any field in a class without modifier refers to this
	 *
	 * even in a superclass
	 * without super() keyword, the this.method() gets called 
	 *
	 * keyword super

public class objects {
	/*
	 * What is a class? what is an object?
	 *
	 * A class is a logical template to create objects
	 * that share common properties and methods
	 *
	 * classes are the blueprints for objects
	 * class -> object
	 *
	 * Declaring a class
	 * class MyClass {
	 * 	field, constructor, and methods delclared
	 * 	}
	 *
	 * What is a field?
	 * Varaibles that the class contains and uses (member variables)
	 * 	Types of variables
	 * 		local variables - variables inside a method or block
	 * 				  of code. Only accessed by things inside
	 * 				  the code block they were defined in
	 * 		parameters - things  u pass into functions, local
	 * 			     vars for that function
	 * 		fields (aka member variables aka instance variables)
	 *
	 * What is a constructor?
	 * A constructor is something that is invoked to create
	 * and object from the class blueprint
	 * It is like an init() function for the class
	 * 	You don't need to provide a constructor in your
	 * 	class definition because the compiler will automatically
	 * 	create a no argument default constructor
	 * 		This will call the non argument constructor of
	 * 		the superclass
	 *
	 * 	Passing info to methods/Constructors
	 * 		through arguments
	 * 		if a field and a constructor parameter have
	 * 		the same name, inside the constructor
	 * 		the parameter is being referenced
	 *
	 * 		int x;
	 *
	 * 		point(int x) {
	 * 			x = x;
	 * 		}
	 *
	 * 		What happens is that the parameter x gets
	 * 		set to x (which doesn't make any sense);
	 *
	 * 		so you need to use the this keyword
	 * 		(referring to the instance of the class)
	 *
	 * 		instead:
	 *
	 * 		int x;
	 * 		 
	 * 		point(int x) {
	 * 			this.x = x;
	 * 		}
	 *
	 * 	explicit contstructor invocation
	 * 	using this() to call another constructor in the same class
	 *
	 * 	example of use:
	 *
	 * 	public Rectangle() {
	 * 		this(0, 0, 1, 1);
	 * 	}
	 *
	 * 	public Rectangle(int x, int y, int width, int height) {
	 * 		blah blah
	 * 	}
	 *      As you can see here, the no arg constructor uses the other constructor
		 *      to function. Cool right?
		 *
		 *
	 *
	 * Public vs Private? 
	 * the modifiers public and private let you control what other classes
	 * who have access to the class have access to.
	 *
	 * by default, fields with no modifiers are public
	 *
	 * public - this field/method is accessible from all classes
	 * private - this field/method is accessible from only this class
	 *
	 * trying to access a private when you are not allowed to
	 * results in an error!!!!
	 *
	 * Static vs nonstatic methods
	 *
	 * static method - not part of instances, only part of classes
	 * 	- cannot access any instance variables, usually 
	 * 	  an input/output function
	 * 	  	- attempting to access instance vars
	 * 	  	from a static method results in a runtime error!
	 * 	- only one static method exists in memory
	 *
	 * Static fields - Only one instance of it exists
	 * So if you have a static variable that increments whenever
	 * an object of that class is made, that variable will increment globally
	 * All objects of that class will point to that specific static variable
	 *
	 * ^ same with methods
	 *
	 *
	 *
	 * overloading methods
	 * 	void draw(int i);
	 * 	void draw(String i);
	 * 	Java can tell the difference between the two
	 * 	and use the appropriate one
	 *
	 * Creating objects
	 * first create a reference value of type class
	 *
	 * say there is class Poop
	 *
	 * Poop objectPoop = new Poop();
	 * 
	 * Accessor methods:
	 * 	Methods specifically made to access private fields inside of a class instance
	 * 	Its much better as you can change what the getVariable() function returns
	 * 	It's more flexible to change
	 *
	 * Mutator methods:
	 * 	Methods that modify private fields 
	 *
	 * If a field/method is public you can call it by
	 * 	object.method() or object.field
	 *
	 * toString()
	 * All java classes are subclasses of the class Object
	 * 	Object has a default method toString() that print() calls
	 * 	whenever the object is called inside of it.
	 *
	 * 	on default toString is the address in memory to the object
	 * 	If you overwrite toString() print will use that instead
	 *
	 *
	 *
	 */

}

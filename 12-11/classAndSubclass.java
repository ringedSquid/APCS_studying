public class classAndSubclass {
	public void static main(String[] args) {
		/*
		 * Classes
		 *
		 * We know what these are, 
		 * However just for a quick overview:
		 * 	Classes are blueprints for things called
		 * 	objects. An object is a data structure
		 * 	that can represent something (cars, cats, etc)
		 * 	An object can hold its own local variables, methods and constructors
		 *
		 * 		> Fields (local vars) - What objects use to store data
		 *
		 *		> Methods - Things that objects can do
		 *
		 *		> Consructors - How an object is initialized
		 *
		 *	A class will define all of these three things within it
		 *
		 *		Public vs Private:
		 *
		 *		Public basically means that it can be accessed by
		 *		things outside of that object. 
		 *
		 *		Private means that it can NOT be accessed by things
		 *		outside of that object.
		 *
		 *			If a method is private, you cannot do
		 *			> Object.method()
		 *
		 *			But within the Object, this method() can be called.
		 *
		 *	The use of objects in programming is called Object Oriented Programming,
		 *	which has 4 main concepts
		 *
		 *		1. Abstraction - Hiding implementation details from user, "Black-box" 
		 *		2. Encapsulation - hide data and code within a single unit
		 *		3. Inheritance - 
		 *		4. Polymorphism - 
		 *
		 * Inheritance
		 *
		 * Classes can be derived from other classes (a derived class is called a subclass)
		 * these subclasses will inherit all the PUBLIC methods and fields from its superclass (parent)
		 * Constructors will not be inherited
		 *
		 * Keep in mind that the private methods/fields still exist within the subclass, its just that
		 * through the subclass you cannot access anything in the superclass that is private.
		 * If a method is public in the superclass and uses private fields within it,
		 * the method will still work if ran from the subclass.
		 *
		 * (^Basically encapsulation at work!)
		 * 
		 * Is-A relationships
		 *
		 * X is-a Y says that X is a subclass of Y
		 *
		 * Therefore:
		 * 	> A is a class
		 * 	> B is a class that extends A
		 *
		 * 	> A example = new B();
		 *
		 * 	B is-a A
		 *
		 * 	> B example != new A();
		 *
		 * 	A is-NOT-a B
		 *
		 * Has-A relationship
		 *
		 * X has-a Y
		 * 
		 * suggest that X contains at least one Y inside of it
		 *
		 */	
	}
}

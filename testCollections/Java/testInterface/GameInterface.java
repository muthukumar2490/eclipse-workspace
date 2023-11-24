package testInterface;

public interface GameInterface {
	public void up();
	public void down();
	public void left();
	public void right();
	
	
	//1.an Interface can extends another interface
	//2.an implementing class should implement all methods in both the interfaces
	//3.if an implementing class dont want to implement all methods in the interfaces
	//then declare the implementing class as abstract
		
	//4.abstract is a relationship. only one class can extend an abstract class.
	//where in interface, class can implement any number of interfaces
	//5.abstract class can have a variable where as in interface only constants are allowed
	//6.private variable declaration in allowed in abstract. all methods are public by default
	//7.abstract class can not have method implementation where as in interface default method 
	//implementation is allowed.
	//8.abstract class cannot be instantiated
	
}

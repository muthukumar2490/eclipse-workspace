package testAbstract;

// class name should be abstract

public abstract class Vehicle {
	

	//abstract class can have abstract method
	public abstract void vehicleType();
	public abstract void registeredArea();
	
	//abstract class can have concrete method as well
	public void execute() {
		 getSpeed();
		 SetSpeed();
	}
	protected abstract void SetSpeed();
	protected abstract void getSpeed();
	
	
	// abstract class can have another abstract class
	
	//abstract class can have normal veriables 
	int index;
	
}

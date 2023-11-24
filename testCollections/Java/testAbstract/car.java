package testAbstract;

public class car extends Vehicle {
	String Model;
	String Manufacture;
	

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getManufacture() {
		return Manufacture;
	}

	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}

	public car(String M, String Man) {
		String Model = M;
		String Manufacture = Man;
	}

	@Override
	public void vehicleType() {
		System.out.println("car");

	}
	@Override
	public void registeredArea() {
		System.out.println("Hyderabad");

	}

	@Override
	protected void SetSpeed() {
		System.out.println("inside set Speed");
		
	}

	@Override
	protected void getSpeed() {
		System.out.println("inside get speed method");
		
	}

}

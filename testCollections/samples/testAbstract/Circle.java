package testAbstract;

public class Circle extends Shape{
	 private double radius;
	    public Circle(String name, double radius){
	        super(name);
	        this.radius = radius;
	    }
	    public double calculateArea(){
	        return Math.PI*radius*radius;
	    }
	     
}

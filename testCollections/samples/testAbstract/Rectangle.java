package testAbstract;

public class Rectangle extends Shape {
	 private double length;
	    private double width;
	    
	    public Rectangle(String name, double l, double w){
	        super(name);
	        this.length = l;
	        this.width = w;
	    }
	    
	    public double calculateArea(){
	        return length*width;
	    }
	      
}

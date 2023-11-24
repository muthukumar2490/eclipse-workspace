package testAbstract;

public class ShapeRunner {
	public static void main(String[] args){
        Circle circle = new Circle("Circle",1);
        circle.displayInfo();
        Rectangle rectangle = new Rectangle("Rectangle",5,5);
        rectangle.displayInfo();
    }

}

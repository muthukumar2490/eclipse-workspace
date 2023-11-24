package testInterface;

public class flyableRunner {

	public static void main(String[] args) {

		flyable[] flyableobj = {new Bird(),new Aeroplane()};
		
		for(flyable f: flyableobj) {
			f.fly();
		}

	}

}

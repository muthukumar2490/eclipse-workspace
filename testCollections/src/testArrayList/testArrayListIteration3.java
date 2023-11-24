package testArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class testArrayListIteration3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> students = new ArrayList<String>();
		// add elements
		students.add("Muthukumar");
		students.add("Aarvi Krishnan");
		students.add("Ashvik Ram");
		students.add("Rasmi Teja");

		// iterate through for loop
		for (int i = 0; i < students.size(); i++) {
			System.out.println("// iterate through for loop"+students.get(i));
		}
		System.out.println("++++++++++++++++++++");
		
		
		// iterate through for each loop
		for (String student : students) {
			System.out.println("// iterate through for each loop"+student);
		}
		System.out.println("++++++++++++++++++++");
		
		
		
		// iterate through Iterator
		Iterator<String> it = students.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("// iterate through Iterator++++++++++++++++++++");

		//iterate through streams with lambdas
		students.stream().forEach(element -> System.out.println("//iterate through streams with lambdas"+element));
	}

}

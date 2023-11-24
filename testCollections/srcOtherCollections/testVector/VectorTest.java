package testVector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. create new vector
		Vector<Integer> myVector = new Vector<Integer>();
		myVector.add(10);
		myVector.add(20);
		myVector.add(30);
		myVector.add(40);
		myVector.add(50);

		System.out.println(myVector);

		// 2. fetch element on index
		System.out.println(myVector.get(2));

		// 3. Remove element from vector

		myVector.remove(3);
		System.out.println(myVector);

		// 4.create vector from vector
		Vector<Integer> myVector1 = new Vector<Integer>();
		myVector1.add(10);
		myVector1.add(20);
		myVector1.add(30);
		myVector1.add(40);
		myVector1.add(50);

		Vector<Integer> myVector2 = new Vector<>(myVector1);
		myVector2.addAll(myVector1);
		System.out.println(myVector1);
		System.out.println(myVector2);

		// 5. iterate through for each
		for (Integer e : myVector2) {
			System.out.println(e);
		}
		
		//6. iterate through for loop 
		
		for (int i=0;i<myVector2.size();i++) {
			System.out.print(myVector2.get(i));
		}
		
		//7. iterate through iterator
		
		Iterator<Integer> VectorItr = myVector2.iterator();
		while(VectorItr.hasNext()) {
			System.out.println("Iterator"+VectorItr.next());
		}
		//8.Sorting Vector
		Collections.sort(myVector2);
		System.out.println(
				"Sorted Vector"+myVector2);
		
	}

}

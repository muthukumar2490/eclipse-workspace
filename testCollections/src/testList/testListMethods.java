package testList;

import java.util.List;

public class testListMethods {

	public static void main(String[] args) {

		//it is an immutable list. we cannot add new element
		List<String> fruits = List.of("Apple","Orange","Mango") ;
//		fruits.add("Pineapple");//java.lang.UnsupportedOperationException
		
		System.out.println("fruits.contains(\"Orange\");"+fruits.contains("Orange"));
		System.out.println("fruits.get(0)"+fruits.get(0));
				
		//to create mutable List we got for Linked List, Array List, vector
	}

}

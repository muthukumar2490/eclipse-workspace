package testList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class testArrayListvsLinkedListvsVector {

	public static void main(String[] args) {

		List<String> fruits = List.of("Apple","Orange","Mango") ;
		
		List<String> arrayList = new ArrayList<>(fruits);
		List<String> linkedList = new LinkedList<>(fruits);
		List<String> vector = new Vector<>(fruits);
		arrayList.add("arrayList");
		linkedList.add("linkedList");
		vector.add("vector");
		
		System.out.println(arrayList);
		System.out.println(linkedList);
		System.out.println(vector);
		
		//1. accessing a element is faster in arraylist
		//2. Insertion and deletion is slower arraylist
		//3. accessing an element is slower in Linkedlist
		//4. Insertion and deletion is faster in Linked list
		
		//5. Underlying data structure in Arraylist is an array
		//6. where as in Linkedlist, it is doubly linked list.
		
		//7. vector is synchronized where as Arraylist is not synchronized
		
		
	}

}

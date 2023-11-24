package testLinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LinkedList is dafault class in java
		// can be used as List, Stack, Queue
		// allows null entry
		// dynamic collection- insertion ,deletion easily implemented
		// it can contain duplicate elements
		// it is not synchronized, not thread safe
		// In LinkedList, manipulation is fast because no shifting is required

		// 1.create linked

		LinkedList<String> names = new LinkedList<>();
		System.out.println(names.size());

		// 2.add element to Linkedlist

		names.add("Aarvi");
		names.add("Ashvik");
		names.add("AarviRam");
		names.add("AshvikKrishnan");
		System.out.println(names.size());

		// 3.access element at index

		System.out.println(names.get(0));

		// 4.iterate over LinkedList

		Iterator it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 5.add element at particular index

		names.add(0, "udaiyar");
		System.out.println(names);

		// 6.append LinkedList
		LinkedList<String> users = new LinkedList<>();
		users.add("javauser");
		users.add("Python user");
		users.addAll(names);
		System.out.println(users);

		// 7.add element to first index

		users.addFirst("im First");

		// 8.add element to last index
		users.addLast("Im Last");

		System.out.println(users);

		// 9. remove elements from list
		System.out.println(users);
		// 10. remove head element
		users.remove();
		System.out.println(users);
		// 11.remove element at index
		users.remove(0);
		System.out.println(users);
		// 12.remove first element
		users.removeFirst();
		System.out.println(users);
		// 13.remove last element
		users.removeLast();
		System.out.println(users);

		// 14.remove all elements
		// users.removeAll(users);
		users.clear();

		System.out.println(users);

		// 15.reverse linkedlist

		users.addAll(Arrays.asList("im First", "javauser", "Python user", "udaiyar", "Aarvi", "Ashvik", "AarviKrishnan",
				"AshvikRam", "Im Last"));

		System.out.println(users);
		Iterator<String> itr = users.descendingIterator();
		// print linked list in reverse order
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//16. traverse through for each
		
		for(String s: users) {
			System.out.println(s);
		}
		
		
		//17. sorting Linkedlist
		
		Collections.sort(users);
		System.out.println(users);
	}

}

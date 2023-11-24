package testArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class testSynchronizedArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.Collections.synchronizedList method
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());

		nameList.add("Java");
		nameList.add("Python");
		nameList.add("Ruby");

		// add remove doesnot need explicit synchronization

		// fetch or traverse need explicit synchronization

		synchronized (nameList) {
			Iterator<String> it = nameList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

		// 2.copyOnWriteArrayList - it is a class
		
		CopyOnWriteArrayList<String> empName = new CopyOnWriteArrayList<String>();
		empName.add("Tom");
		empName.add("Jerry");
		empName.add("Swat cats");
		
		//no explicit synchronization for add remove and traverse
		Iterator<String> it = empName.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

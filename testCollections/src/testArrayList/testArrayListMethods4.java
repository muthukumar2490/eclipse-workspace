package testArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class testArrayListMethods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> student = new ArrayList<String>();
		student.add("Muthukumar");
		student.add("Aarvi Krishnan");
		student.add("Ashvik Ram");
		System.out.println(student);

		ArrayList<String> subject = new ArrayList<String>();
		subject.add("English");
		subject.add("Maths");
		subject.add("Science");

		System.out.println(subject);

		// append ArrayList
		student.addAll(subject);		
		System.out.println(student);

		// append ArrayList from index
		student.addAll(2, subject);
		System.out.println(student);
		
		//clear ArrayList
		student.clear();
		System.out.println(student);
		
		
		//clone ArrayList
		ArrayList<String> cloneList = (ArrayList<String>)subject.clone();
		System.out.println(cloneList);
		
		//verify an element is present
		System.out.println(subject.contains("Maths"));
		System.out.println(subject.contains("Political"));
		
		// to find an elements index
		System.out.println(subject.indexOf("Maths"));
		
		//lastindexof method
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("C","C++","Java","C","Python","C#"));
		System.out.println(names.lastIndexOf("Python"));
		System.out.println(names);
		
		//remove elements from ArrayList
		names.remove(1);
		System.out.println(names);
		names.remove("C");
		System.out.println(names);
		
		//remove element from Integer arrylist
		ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(101,102,103,104,105));
		System.out.println("number arrraylist"+numbersList);
		numbersList.remove(4);
		System.out.println("removed element at index 4"+numbersList);
		numbersList.remove(Integer.valueOf(103));
		System.out.println("removed element 103"+numbersList);
		
		
		
		//given a List remove all even numbers
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(ar);
		ar.removeIf(num->num%2==0);
		System.out.println(ar);
		
		//given a List remove all odd numbers
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(numbers);
		numbers.removeIf(num->num%2!=0);
		System.out.println(numbers);
		
		
		//create a subList
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(number);
		ArrayList<Integer> sublist = new ArrayList<Integer>(number.subList(3, 8));
		System.out.println(sublist);
		
		//convert collection to an array
		ArrayList<String> name = new ArrayList<String>(Arrays.asList("C","C++","Java","C","Python","C#"));
		System.out.println(name);
		Object arr[] = name.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o: arr)
		{
			System.out.println(o);
		}
		
	}

}

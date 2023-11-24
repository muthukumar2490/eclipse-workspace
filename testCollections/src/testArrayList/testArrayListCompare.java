package testArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class testArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.ArrayList sort and compare
		
		ArrayList<String> Al = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> Al2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> Al3 = new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		Collections.sort(Al);
		System.out.println(Al.equals(Al2));
		System.out.println(Al.equals(Al3));
		Collections.sort(Al3);
		System.out.println(Al.equals(Al2));
		System.out.println(Al.equals(Al3));
		
		//2. compare 2 Lists and findout additional element
		ArrayList<String> Al4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> Al5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		Al4.removeAll(Al5);
		System.out.println(Al4);
		
		//3. find out missing element
		ArrayList<String> Al6 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> Al7 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Al7.removeAll(Al6);
		System.out.println(Al7);
		
		//4.find out common elements
		ArrayList<String> Al8 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> Al9 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		Al8.retainAll(Al9);
		System.out.println(Al8);

		
	}

}

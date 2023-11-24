package testLinkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class testLinkedhasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		//set - unique
		//hashset - unique and no order
		//linkedhashset - unique and maintains insertions order
		//treeset - unique and sorted order
		
		
		//1. maintains insertion order
		//2. can not have duplicates
		Set<Integer> set = Set.of(12,123,1234,12345); //creates immutable set
		Set<Integer> linkedhashset = new LinkedHashSet<>(set);
		
		System.out.println(set);
		linkedhashset.add(23 );
		linkedhashset.add( 234 );
		linkedhashset.add( 2345);
		System.out.println(linkedhashset);// maintains order of insertion
		System.out.println(linkedhashset.add(234));// no duplicates
		
		//1. treeset insert elements in sorted order
		//2. can not have duplicates
		Set<Integer> treeset = new TreeSet<>(Arrays.asList(123,133123,12312,12343,54));
		System.out.println(treeset);//sorted order
		System.out.println(treeset.add(123));// no duplicates
		
		//Exercise
		List<Character> character = List.of('A','E','Z','R','U','P','E');
				
		//1.unique chars in sorted order
		//2.order in which they are present
		//3. unique character and order in which they are present
		
		//1.unique chars in sorted order
		Set<Character> setChar = new TreeSet<>(character);
		System.out.println(setChar);
		//2.order in which they are present
		List<Character> list = new LinkedList<>(character);
		System.out.println(list);
		//3. unique character and order in which they are present
		Set<Character> uset = new LinkedHashSet<>(character);
		System.out.println(uset);
		
		
	}

}

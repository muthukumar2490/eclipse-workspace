package testHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testHashSet {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		
		// duplicates not allowed
		// positional access can not be done
		// Unsynchronized
		// it does not maintain insertion order
		
		//1.add elements
		
		hs.add("A");
		hs.add("B");
		hs.add("C");
		
		//2. print hashset
		
		System.out.println(hs);
		//System.out.println(hs.s);
		
		//3.add duplicate
		
		hs.add("B");
		System.out.println(hs);// duplicates not allowed
		
		//4. remove element
		
		hs.remove("B");
		System.out.println(hs);
		
		
		
		//5.iterate hashset using for each
		
		for(String s: hs) {
			System.out.println(s);
		}
		
		//6.HashSet contains method
		
		System.out.println(hs.contains("A"));
		
		
		//7. Iterate using iterator
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//8.Union operation 
		
		//Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,6,7,9));
		//or
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(1,4,5,7,9));
		System.out.println(set1);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(1,2,3,6,8,9));
		System.out.println(set2);
		
		//set1.addAll(set2);
		//or
		Set<Integer> union = new  HashSet<Integer>(set1);
		union.addAll(set2);//removes duplicates
		System.out.println(union);
		
		//9.intersection
		
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
//		same
//		Set<Integer> intersection1 = new HashSet<Integer>(set2);
//		intersection1.retainAll(set1);
//		System.out.println(intersection1);
		
		
		//10.diff
		Set<Integer> diff = new HashSet<Integer>(set1);
		diff.removeAll(set2);
		System.out.println(diff);
//		different result
//		Set<Integer> diff1 = new HashSet<Integer>(set2);
//		diff1.removeAll(set1);
//		System.out.println(diff1);
		
		
		
		
		
		
		
		
	}
}

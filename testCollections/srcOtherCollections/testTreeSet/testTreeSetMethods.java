package testTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class testTreeSetMethods {

	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<>(Set.of(12,34,56,58,78,23));
		
		System.out.println(treeset.floor(60));
		System.out.println(treeset.ceiling(60));
		
		System.out.println(treeset.lower(60));
		System.out.println(treeset.higher(60));
		
		System.out.println(treeset.subSet(20,60));
		System.out.println(treeset.subSet(34,56));
		
		System.out.println(treeset.subSet(12,true,78,true));
		System.out.println(treeset.subSet(12,false,78,false));
		
		System.out.println(treeset.headSet(50));
		System.out.println(treeset.tailSet(50));

	}

}

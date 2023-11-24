package testHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class testHashMapCompare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3,"C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(2, "B");
		map2.put(1, "A");		
		map2.put(3,"C");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(2, "B");
		map3.put(1, "A");		
		map3.put(3,"C");
		map3.put(3,"D");
		//1. on the basis of key value: using equals method
		System.out.println("//1. on the basis of key value: using equals method");
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//2.compare HashMap for the same keys using keySet method
		System.out.println("//2.compare HashMap for the same keys using keySet method");
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		map3.put(4, "E");
		System.out.println(map1.keySet().equals(map3.keySet()));
		System.out.println(map1.keySet());
		
		
		//3.find out the extra key
		System.out.println("//3.find out the extra key");
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3,"C");
		map4.put(4,"D");
		//combine or union keys from both maps using HashSet and remove map1
		HashSet<Integer> combinedkeys = new HashSet<Integer>(map1.keySet());
		combinedkeys.addAll(map4.keySet());
		combinedkeys.removeAll(map1.keySet());
		System.out.println(combinedkeys);
		
		//4.compare map by values
		System.out.println("//4.compare map by values");
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3,"C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6,"C");
		
		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3,"C");
		map7.put(4,"C");
		
		//1. duplicates are allowed using ArrayList
		System.out.println("//1. duplicates are allowed using ArrayList");
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false
		
		//2. duplicates are not allowed using HashSets		
		System.out.println("//2. duplicates are not allowed using HashSet");
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));//true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true
		
		
		
		
			
		}

	}



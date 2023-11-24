package testList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class testListvsSetvsMap {

	public static void main(String[] args) {

	List<String> list = List.of("Apple","Orange","Banana","pineapple");
	Set<String> set = Set.of("Apple","Orange","Banana");
	Map<String, String> map = Map.of("Apple","Orange","Banana","Mango");

	System.out.println(list);
	System.out.println(set);
	System.out.println(map);
	
	

	}

}

package testHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapInitialization4 {

	public static Map<String, Integer> Marksmap = new HashMap<>();
	static {
		Marksmap.put("Muthu", 100);
		Marksmap.put("Kumar", 200);
		
		
	}
	
public static void main(String[] args) {
	//1.using hashmap class
	HashMap<String, String> map = new HashMap<>();
	Map<String, String> map2 = new HashMap<>();

	//2.static way
	System.out.println(HashMapInitialization4.Marksmap.get("Muthu"));
	
	
	//3.immutable map with only one entry
	Map<String, Integer> map3 = Collections.singletonMap("test", 110);
	System.out.println(map3.get("test"));
//	map3.put("test2", 123);//java.lang.UnsupportedOperationException
	System.out.println("ended");
	
	
	
	
}
	
}

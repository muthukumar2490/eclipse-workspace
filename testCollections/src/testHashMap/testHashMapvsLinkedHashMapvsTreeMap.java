package testHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class testHashMapvsLinkedHashMapvsTreeMap {

	public static void main(String[] args) {

		//HashMap unsorted, unordered, unsynchronized, allows null key value
		//HashTable unsorted, unordered, synchronized, does not allow null key value
		//LinkedHashMap insertion order is maintained
		//TreeMap sorted order is maintained. implements NavigableMap
		
		
		//1.create a map with Map.of which is immutable map
		Map<String, Integer> map = Map.of("Z",34,"A",13,"C",45);
		System.out.println(map);

		//map.put("B", 12); //UnsupportedOperationException
		
		
		System.out.println(map.get("A"));
		
		System.out.println(map.size());
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.containsKey("C"));
		System.out.println(map.containsValue(45));
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		//create a HashMap
		Map<String, Integer> hashmap = new HashMap<>(map);
		
		hashmap.put("F", 45);
		System.out.println("hashmap does not maintains insertion order "+hashmap);
		
		
		//create a LinkedHashMap
		
		LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put("Z", 100);
		linkedhashmap.put("Y", 140);
		linkedhashmap.put("R", 340);
		
		System.out.println("linkedhashmap maintains insertion order "+linkedhashmap);
		
		//TreeMap
		TreeMap<String,Integer> treemap = new TreeMap<>();
		treemap.put("Z", 100);
		treemap.put("Y", 140);
		treemap.put("R", 340);
		
		System.out.println("treemap maintains sorted order "+treemap);
		
		//TreeMap
		System.out.println("treemap.ceilingKey(\"G\");"+treemap.ceilingKey("G"));
		System.out.println("treemap.floorKey(\"G\");"+treemap.floorKey("G"));
		System.out.println("treemap.higherKey(\"F\");"+treemap.higherKey("F"));
		System.out.println("treemap.lowerKey(\"K\");"+treemap.lowerKey("K"));
		System.out.println("treemap.firstEntry()"+treemap.firstEntry());
		System.out.println("treemap.lastEntry()"+treemap.lastEntry());
		System.out.println("treemap.subMap(\"A\", \"Y\")"+treemap.subMap("A", "Y"));
		System.out.println("treemap.subMap(\"A\",true,\"Y\", true) "+treemap.subMap("A",true,"Y", true));
	}

}

package testHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class testHashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// no index. no order
		// stores values in key, value pair <k,v>
		// KEY can't be duplicate
		// can store N no of null values but only one null Key

		// 1. add elements to HashMap
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		System.out.println(capitalMap);

		// 2.add duplicate key value
		capitalMap.put("UK", "London1");// no error, but latest value is assigned

		System.out.println(capitalMap);

		// 3. fetch value for a given key
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get("UK"));

		// 4. Add a null key value
		capitalMap.put(null, "Pak");
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap);

		// 5. add multiple null key value
		capitalMap.put(null, "china");
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap);

		// 6.add multiple null value
		capitalMap.put("Russia", null);
		capitalMap.put("Netherland", null);

		System.out.println(capitalMap);

		// 7.HashMap is not thread safe. unsynchronized

		// 8.HashMap iteration over keys using keyset

		System.out.println("8.HashMap iteration over keys using keyset\r\n" + "");
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println(key + "  " + value);
		}

		// 9.Iterator over the set(pair) using entrySet()
		System.out.println("//9.Iterator over the set(pair) using entrySet()");
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		
		//10. remove a pair
		System.out.println("//10. remove a pair"+"\n"+capitalMap);
		capitalMap.remove(null);
		System.out.println(capitalMap);
		
		capitalMap.remove("UK");
		System.out.println(capitalMap);
		
		//11. iterate through HashMap using Lambda
		System.out.println("//11. iterate through HashMap using Lambda");
		capitalMap.forEach((k,v)-> System.out.println(k+"  "+v));
		
	}

}

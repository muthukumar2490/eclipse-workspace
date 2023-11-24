package testHashMap;

import java.util.HashMap;
import java.util.Map;

public class testHashMapConcept3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. how HashMap works internally
		
		
		//hashing : hashcode() method from object class
		//Map<String, Integer> marks = new HashMap<String, Integer>();
		//marks.put("Ashvik",100);
		//marks.put("Aarvi",100);
		
		//public void put(K key, V value){
		//int hash = hashCode(key);
		//int index = hash & (n-1);
		//n = 16(map size);
		//}
		
		//16 is map size
		//for each key hash code is calculated 
		//for each hash code , index will be calculated. 
		//at the index key is stored
		//key|hashcode|value|pointer to next node
		
		
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Ashvik",100);
		marks.put("Aarvi",100);
		marks.put("Muthu",90);
		marks.put("Rasmi",990);
		marks.put("Ashvik",200);
		marks.put("null",100);
		
		marks.get("Rasmi");
	}

}

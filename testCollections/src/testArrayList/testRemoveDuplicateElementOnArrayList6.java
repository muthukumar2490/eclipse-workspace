package testArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class testRemoveDuplicateElementOnArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9));
		
		System.out.println(numList);
		HashSet<Integer> hs = new HashSet<Integer>(numList);
		
		ArrayList<Integer> numListNoDups = new ArrayList<Integer>(hs);
		System.out.println(numListNoDups);
		
		
	}

}

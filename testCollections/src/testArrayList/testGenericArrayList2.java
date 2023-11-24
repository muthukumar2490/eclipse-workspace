package testArrayList;

import java.util.ArrayList;

public class testGenericArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		//ar.add(2.22);
		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(100.23);
		
		ArrayList<String> StudentNames = new ArrayList<String>();
		StudentNames.add("Muthukumar");
		StudentNames.add("Aarvi Krishnan");
		StudentNames.add("Ashvik Ram");
		System.out.println(ar );
		System.out.println(arD);
		System.out.println(StudentNames);
		
	}

}

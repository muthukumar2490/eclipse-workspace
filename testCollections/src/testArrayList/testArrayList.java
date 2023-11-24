package testArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //virtual capacity default 10. To change to 20
		  //ArrayList<Object> ar  = new ArrayList<Object>(20);
		  ArrayList<Object> ar  = new ArrayList<Object>();
		  System.out.println(ar.size());
		  ar.add(100);
		  ar.add("hi");
		  ar.add(12.3);
		  ar.add(true);
		  System.out.println(ar.size());
		  System.out.println(ar);
		  
		  
		  ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(12,14,15,15,15,16));
		  System.out.println(number);
		  System.out.println(number.size());
		  ArrayList<String> language = new ArrayList<String>(Arrays.asList("c","C++","Java","Python"));
		  System.out.println(language);
		  System.out.println(language.size());

		  number.add(17);
		  System.out.println(number);
		  
		  ArrayList<Integer> number1 = new ArrayList<Integer>(List.of(1,2,2,4,5,6));
		  System.out.println(number1);
		  
		  
		  
	}

}

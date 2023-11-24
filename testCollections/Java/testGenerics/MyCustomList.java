package testGenerics;

import java.util.ArrayList;

public class MyCustomList<T> {
	
// 	initial code without generics	
//	ArrayList<String> al = new ArrayList<>();
//
//	public void add(String element) {
//		al.add(element);
//	}
//
//	public void remove(String element) {
//		al.remove(element);
//	}

	ArrayList<T> al = new ArrayList<>();

	public void add(T element) {
		al.add(element);
	}

	public void remove(T element) {
		al.remove(element);
	}
	
	public T get(int index) {
		return al.get(index);
	}
	
	public String toString() {
		return al.toString();
	}

}

package testInheritance;

import java.util.ArrayList;
import java.util.Collections;

public class ChildClass extends SuperClass{

	
	String name;
	ArrayList<Integer> marks = new ArrayList<>();
	
	public ChildClass(String fn, String ln, String name, ArrayList<Integer> marks) {
		super(fn,ln);
		this.name = name;
		this.marks = marks;
		
	}

	public void getMinMarks() {
		
		System.out.println(Collections.min(marks));
	}
	public void getMaxMarks() {
		System.out.println(Collections.max(marks));
	}
	public void getStudentDetails() {
		System.out.println(this.name);
		for(Integer m:this.marks) {
		System.out.println(m);}
	}
	
	public String toString() {
		return name + marks;
		
	}

	public void addMark(int i) {
		this.marks.add(i);
		
	}

	public void removeMark(int i) {
		this.marks.remove(i);
		
	}
	
	
	
	
}

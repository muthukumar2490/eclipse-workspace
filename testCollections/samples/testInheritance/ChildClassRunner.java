package testInheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class ChildClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass s = new ChildClass("Muthukumar","Kannan","muthu",new ArrayList<Integer>(Arrays.asList(1,2,5,9,6,4,6)));
		s.getMinMarks();
		s.getMaxMarks();
		s.getStudentDetails();
		System.out.println(s.toString());
		
		s.addMark(100);
		System.out.println(s.toString());
		s.removeMark(4);
		System.out.println(s.toString());
	}

}

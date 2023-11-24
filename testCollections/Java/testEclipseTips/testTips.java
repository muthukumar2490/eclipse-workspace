package testEclipseTips;

import java.math.BigDecimal;

//Ctrl+1


class test implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class testTips {

	public static void main(String[] args) throws InterruptedException {
		//ctrl +1
		BigDecimal bigdecimal = new BigDecimal(22);
		//ctrl +1
		Thread.sleep(1000);
		//ctrl +1
		DummyforTest dummyfortest = new DummyforTest();
		//ctrl +1
		dummyfortest.dosomething();
		
		//extract to a local variable
		int millis = extracted();
		Thread.sleep(millis);
		
		//extract to a method
		int millis1 = extracted();
		
		
		//navigate->open type in Hierarchy
		
	}

	private static int extracted() {
		return 100*34*34232;
	}

}

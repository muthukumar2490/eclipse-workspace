package testExceptions;

public class testExceptions4 {

	// checked exception vs unchecked exception
	public static void main(String[] args){
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		test1();//no compiler error for RuntimeException
		//test();//compiler error for InterruptedException
		//why?
		
		
		

	}
	public static void test() throws InterruptedException {
		Thread.sleep(1000);// checked exception
	}
	public static void test1() throws RuntimeException {
		 //unchecked exception
	}
}

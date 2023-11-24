package testExceptions;

public class testExceptions3 {
	
	//Exception Hierarchy
	//need for finally
	public static void main(String[] args) {
		// 2 keys
		// Friendly msg to end users
		// Enough info to Debug the program

		method1();
		System.out.println("Main method ended");

	}

	private static void method1() {
		method2();
		System.out.println("method1() ended");
	}

	private static void method2() {
		try {
//			String str = null;
//			str.length();
			int[] a = {1,2,3};
			int b = a[5];
			System.out.println("method2 ended");
		} 
		
		 catch (NullPointerException ex) {
			 System.out.println("Null Pointer Exception");
				//ex.printStackTrace();
			}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException exception");
			ex.printStackTrace();
		}
		catch (Exception ex) {
			System.out.println("Matched exception");
			ex.printStackTrace();
		}
		
		
	}

}

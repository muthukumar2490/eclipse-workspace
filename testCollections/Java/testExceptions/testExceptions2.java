package testExceptions;

public class testExceptions2 {

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
			String str = null;
			str.length();
			System.out.println("method2 ended");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

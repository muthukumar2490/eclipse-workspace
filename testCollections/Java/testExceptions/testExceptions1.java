package testExceptions;

public class testExceptions1 {

	public static void main(String[] args) {
		// 2 keys
		// Friendly msg to end users
		// Enough info to Debug the program
		
		extractedNullPointerException1();
		System.out.println("Main method ended");

	}
	
	private static void extractedNullPointerException1() {
		extractedNullPointerException();
		System.out.println("extractedNullPointerException1() ended");
	}

	private static void extractedNullPointerException() {
		String str = null;
		str.length();
		System.out.println("extractedNullPointerException ended");
	}

}

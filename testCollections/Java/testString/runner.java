package testString;

public class runner extends Object {

	public static void main(String[] args) {
		
		String splitTest = "WebElement:LocatorType:Locator";
		
		String[] stringarray = splitTest.split(":");
		for(String str:stringarray) {
			System.out.println(str);
		}
		
		
		
		StringMethodsTest s = new StringMethodsTest("Hi This is Rasmi Teja","Hi, This is Muthukumar");
		s.lengthTest();
		s.equalsTest();
		s.subStringTest();
		s.toLowercaseTest();
		s.toUppercaseTest();
		s.trimTest();
		s.indexOfTest();
		s.containsTest();
		s.replaceTest();
		s.isEmptyTest();
		s.endswithTest();
		s.startswithTest();
		s.StringBufferTest();
		
		
		
		
		
		

	}

}

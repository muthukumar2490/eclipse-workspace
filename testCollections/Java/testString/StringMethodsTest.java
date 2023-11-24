package testString;

import java.util.jar.Attributes.Name;

public class StringMethodsTest {
	
	String name;
	String name1;
	StringMethodsTest(String name, String name1){
		this.name = name;
		this.name1 = name1;
	}
	
	public void getChar(int index) {
		System.out.println("name.charAt(index)"+name.charAt(index));}

	public void lengthTest() {
		System.out.println(name.length());
		
	}

	public void equalsTest() {
		System.out.println(name.equals(name1));
		
	}

	public void subStringTest() {
		System.out.println(name.substring(2, 4));
		
	}

	public void toLowercaseTest() {
		System.out.println(name.toLowerCase());
		
	}

	public void toUppercaseTest() {
		System.out.println(name.toUpperCase());
		
	}

	public void trimTest() {
		System.out.println(name.trim());
		
	}

	public void indexOfTest() {
		System.out.println(name.indexOf("This"));
		
	}

	public void containsTest() {
		System.out.println(name.contains("is"));
				
	}

	public void replaceTest() {
		System.out.println(name.replace("s", "S"));
		
	}

	public void isEmptyTest() {
		System.out.println(name.isEmpty());
		
		
	}

	public void endswithTest() {
		System.out.println(name.endsWith("Kumar"));
		
	}

	public void startswithTest() {
		System.out.println(name.startsWith("Hi"));
		
	}

	public void StringBufferTest() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}

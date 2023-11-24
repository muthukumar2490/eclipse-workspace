/**
 * 
 */
package testVector;

import java.util.Vector;

/**
 * @author KANNA
 *
 */
public class Vector2Dtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Vector<String> langVector = new Vector<>();
		langVector.add("Java");
		langVector.add("Python");
		langVector.add("JavaScript");
		langVector.add("C#");
		
		Vector twod = new Vector();
		twod.add(langVector);//0 index
		
		for(int i=0;i<langVector.size();i++) {
			
			String s =(String)((Vector)twod.get(0)).get(i);
			System.out.println(s);
		}
		
	}

}

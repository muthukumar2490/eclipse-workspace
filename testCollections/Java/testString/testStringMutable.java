package testString;

public class testStringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s11="java";
		 System.out.println(s11);
	     System.out.println(s11.hashCode());
		 String s12="java";
		 System.out.println(s12);
	     System.out.println(s12.hashCode());
	     String s13="javA";
	     System.out.println(s13);
	     System.out.println(s13.hashCode());
	     String s2=new String("Java");
	     System.out.println(s2);
	     System.out.println(s2.hashCode());
	     String s3=new String("JAVA");
	     System.out.println(s3);
	     System.out.println(s3.hashCode());
	     
	     
		
		 String s="java";
	     s.concat(" programming");  // s can not be changed (immutablity)
	     System.out.println("value of s ==  "+s); 
	     System.out.println(" hashcode of s == "+s.hashCode()+"\n\n");


	     // it demonstrates mutable concept
	     StringBuffer s1= new StringBuffer("java");
	     s1.append(" programming");  // s can be changed (mutablity)
	     System.out.println("value of s1 ==  "+s1); 
	     System.out.println(" hashcode of s1 == "+s1.hashCode());
		
	     
	    

	}

}

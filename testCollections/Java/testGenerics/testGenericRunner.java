package testGenerics;

public class testGenericRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList();

		list.add("Muthu");
		list.add("Kumar");
		
		System.out.println("List with String generics "+list.toString());
		String element =list.get(0);
		System.out.println("list.get(0);"+element);
		
		
		// now the customelist class can have list of string elements
		// what if i want to add integer elements to the list like the below
		
//		MyCustomList list2= new MyCustomList();
//		list2.add(Integer.valueOf(100));
//		list2.add(Integer.valueOf(200));
		
		// compilation error as the custom list now cannot hold integers
		// there we go for generics
		
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.add(Integer.valueOf(100));
		list2.add(Integer.valueOf(200));
		
		System.out.println("List with Integer generics "+list2.toString());
		int number = list2.get(0);
		System.out.println("list2.get(0)"+number);
	}

}

package testFunctionalProgramming;

import java.util.List;

public class testOptional {
public static void main(String[] args) {
	
	
	//find even numbers in a list. and find max out of it.
	System.out.println(List.of(1,2,4,3,5).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1, n2)));
	
	System.out.println(List.of(1,3,5).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1, n2)));
	
	System.out.println(List.of(1,2,4,3,5).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1, n2)).orElse(0));
	
	System.out.println(List.of(1,3,5).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1, n2)).orElse(0));
	
	
	
}
}

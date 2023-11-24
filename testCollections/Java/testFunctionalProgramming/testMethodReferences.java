package testFunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class testMethodReferences {
	public static void print(String str) {
		System.out.println(str);
	}

	public static void print(Integer number) {
		System.out.println(number);
	}

	
	public static void main(String[] args) {
		
		

		List.of("Muthu","Kumar","Aarvi","Krishnan","Ashvik").stream()
		.map(s->s.length()).forEach(s->System.out.println(s));
		
		//one way of printing list 
		List.of("Muthu","Kumar","Aarvi","Krishnan","Ashvik").stream()
		.forEach(System.out::println);
		
		//another way of doing it
		List.of("Muthu","Kumar","Aarvi","Krishnan","Ashvik").stream()
		.forEach(System.out::println);
		//System.out part is Class 
		//::println part method inside a class
		
		
		//whats happening inside
		//lets create a method similar to this
		List.of("Muthu","Kumar","Aarvi","Krishnan","Ashvik").stream()
		.forEach(testMethodReferences::print);
		
		//lets modify below code as well
		//List.of("Muthu","Kumar","Aarvi","Krishnan","Ashvik").stream()
		//.map(s->s.length()).forEach(s->System.out.println(s));

		List.of("Muthu","Kumar","Aarvi","Krishnan","Ashvik").stream()
		.map(String::length).forEach(testMethodReferences::print);
		//not only static method, but also instance methods also. can be replaced with 
		//methodreferences. example: s->s.length() to String::length
		
		
		
		//FP way
		int max = List.of(12,23,45,67,89,34,56,34).stream()
				.filter(extractedEvenPredicate()).max((n1,n2)->Integer.compare(n1, n2)).orElse(0);
		System.out.println(max);
		
		//method reference way
		int maxMR = List.of(12,23,45,67,89,34,56,34).stream()
				.filter(testMethodReferences::isEven).max(Integer::compare).orElse(0);
		System.out.println(maxMR);
		
		
		//1.Storing functions in variables
		//2. passing functions to methods
		//3. Returning functions from methods
		
		//1.Storing functions in variables		
		//take this example
		int max2 = List.of(12,23,45,67,89,34,56,34).stream()
				.filter(n->n%2==0).max((n1,n2)->Integer.compare(n1, n2)).orElse(0);
		System.out.println(max2);
		
		//updated version
		Predicate<? super Integer> predicateEven = extractedEvenPredicate();
		
		int max3 = List.of(12,23,45,67,89,34,56,34).stream()
				.filter(predicateEven).max((n1,n2)->Integer.compare(n1, n2)).orElse(0);
		System.out.println(max3);
		
				//2. passing functions to methods
				//3. Returning functions from methods
		
		
		
	}

	private static Predicate<? super Integer> extractedEvenPredicate() {
		return n->n%2==0;
	}
	public static boolean isEven(int i) {
		return i%2==0;
	}

}

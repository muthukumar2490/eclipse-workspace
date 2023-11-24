package testFunctionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class testFPintermediateOperation {

	public static void main(String[] args) {

		List<String> list = List.of("Muthu","Kumar","Aarvi","Krishnan","Ashvik","Ram");
		
		// In Functional Programming, there may be intermediate operation(.map or .filter)
		//or terminal operation
		
		
		//1. iterate string using regular method
		// extracted(list);
		
		//2. iterate string using functional programming method
		//extractedFP(list);
		
		//3.print all string contains "sh"
		//extractedFPsubString(list);
		
		//4.print odd numbers in the list
		//extractedFPOddNumbers();
		
		//5.print even numbers in the list
		//extractedEvenNumbers();
		
		//6.print squares of first 10 numbers 			
		//extractedSquaresofNums();
		
		
		//7. List.of("muthu","kumar","ashvik","ram","aarvi");
		// map all these to upper cases and print
		//eextractedToUpperCase();
		
		//8. List.of("muthu","kumar","ashvik","ram","aarvi");
		//print length of these strings
		//extractedFindStringLength();
		
		
		
	}

	private static void extractedFindStringLength() {
		List.of("muthu","kumar","ashvik","ram","aarvi").stream().forEach(s->System.out.println("Length of "+s+" "+s.length()));
	}

	private static void eextractedToUpperCase() {
		List.of("muthu","kumar","ashvik","ram","aarvi").stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

	private static void extractedSquaresofNums() {
		IntStream.range(1, 15).map(n->n*n).forEach(n->System.out.println(n));
	}

	private static void extractedEvenNumbers() {
		List<Integer> num = List.of(1,2,3,4,5,6,7,8,9);
		num.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

	private static void extractedFPOddNumbers() {
		List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);		
		number.stream().filter(n->n%2==1).forEach(n->System.out.println(n));
		
	}

	private static void extractedFPsubString(List<String> list) {
		list.stream().filter(s->s.contains("sh")).forEach(s->System.out.println(s));
	}

	private static void extractedFP(List<String> list) {
		list.stream().forEach(s->System.out.println(s));
	}

	private static void extracted(List<String> list) {
		for(String s : list) {
			System.out.println(s);
		}
	}

}

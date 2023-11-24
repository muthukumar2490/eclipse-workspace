package testFunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class testFPterminalOperation {

	public static void main(String[] args) {
		
		//1. sum of numbers in a given range
		int sum = IntStream.range(1,110).reduce(0,(n1,n2)-> n1+n2);
		System.out.println(sum);	
		
		//2. find a max number in a list
		int max = List.of(12,23,45,67,89,34,56,34).stream().max((n1,n2)-> Integer.compare(n1,n2)).get();
		System.out.println(max);
		
		//3. find odd numbers
		List.of(1,2,3,4,5,6,7,8,9,10).stream().filter(n->n%2==1).forEach(s->System.out.println(s));
		
		//4. find odd numbers and convert in to list
//		List<Integer> number = new ArrayList<>();
//		List.of(1,2,3,4,5,6,7,8,9).stream().filter(n->n%2==1).forEach(n->number.add(n));
//		System.out.println(number);
		
		//FP way
		System.out.println(List.of(1,2,3,4,5,6,7,8,9).stream().filter(n->n%2==1).collect(Collectors.toList()));
		
		//5.find a square of first 10 numbers and collect it in a list
		System.out.println(IntStream.range(1, 11).map(n->n*n).boxed().collect(Collectors.toList()));
		
		
	}
	
	
}

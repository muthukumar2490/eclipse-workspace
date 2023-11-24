package testQueue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class testPriorityQueue {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		System.out.println(queue.poll());
		
		queue.offer("Apple");
		System.out.println(queue);
		queue.addAll(List.of("Orange","Mango","Pineapple"));
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}

}

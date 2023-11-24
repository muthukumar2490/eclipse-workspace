package testThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testThreadBasics5 {

	public static void main(String[] args) throws InterruptedException {
		//  Thread Utility method and synchronized key word
		
		Thread.sleep(10);
		System.out.println("Thread waited");
		
		Thread.yield();
		
		//Synchronized keyword
		
		//Need for controlling the execution of threads using Executorservice
		
		ExecutorService executorservice = Executors.newSingleThreadExecutor();
		executorservice.execute(new task1());
		executorservice.execute(new Thread(new task2()));
		
		
		//task3
				System.out.println("task3 kicked off");
				for(int i =200;i<300;i++)
				{
					System.out.print(i);
				}
				System.err.println("task3 done");
				
		executorservice.shutdown();//recommended
	}

}

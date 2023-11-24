package testThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testThreadBasics6 {

	public static void main(String[] args) {
	
		//Executor service - customizing number of threads
		
		ExecutorService executorservice = Executors.newFixedThreadPool(2);
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

package testThread;

public class testThreadBasics4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//communication between threads
		
		//task1 and 2 should complete before task3
		
		//task1
		task1 t1 = new task1();
		t1.setPriority(10);
		t1.start();//task1.run();
		
		//task2
		task2 t2 = new task2();
		Thread th2 = new Thread(t2);
		th2.setPriority(5);
		th2.run();
		
		//wait for task1 to complete
		try {
			t1.join();//
			th2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//task3
		System.out.println("task3 kicked off");
		for(int i =200;i<300;i++)
		{
			System.out.print(i);
		}
		System.err.println("task3 done");



	}

}

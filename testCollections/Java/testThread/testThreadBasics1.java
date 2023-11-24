package testThread;
class task1 extends Thread {
	public void run() {
		//task1
		System.out.println("task1 kicked off");
		for(int i =0;i<100;i++)
		{
			System.out.print(i);
		}
		System.err.println("task1 done");
	}
}
class task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("task2 kicked off");
		
		for(int i =100;i<200;i++)
			{
				System.out.print(i);
			}
	
		System.err.println("task2 done");
		
	}

}
class task3 extends Thread {
	public void run() {
		//task3
		for(int i =200;i<300;i++)
		{
			System.out.print(i);
		}
	}
}
public class testThreadBasics1 {

	public static void main(String[] args) {
		
		//task1
		task1 t1 = new task1();
		t1.start();//task1.run();
		
		//task2
		task2 t2 = new task2();
		Thread th2 = new Thread(t2);
		th2.run();
		
		//task3
		System.out.println("task3 kicked off");
		for(int i =200;i<300;i++)
		{
			System.out.print(i);
		}
		System.err.println("task3 done");

	}

}

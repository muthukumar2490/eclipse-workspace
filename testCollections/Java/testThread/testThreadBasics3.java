package testThread;

public class testThreadBasics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//placing priority requests for Threads
		//placing priority does not guarantee that the thread would get CPU
		
				//task1
				task1 t1 = new task1();
				t1.setPriority(10);
				t1.start();//task1.run();
				
				//task2
				task2 t2 = new task2();
				Thread th2 = new Thread(t2);
				th2.setPriority(5);
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

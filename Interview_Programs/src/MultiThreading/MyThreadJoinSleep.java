package MultiThreading;

public class MyThreadJoinSleep extends Thread {
	
	 static Thread mt;
	//yield
	//	To pause the current executing thread and to give chance for executing other threads having same priority.
	 
	 //join
	//Case 1: main thread wait to complete the child thread execution
	//Case 2: Child thread wait to complete the main thread execution
	//Case 3:Main thread calls join method on child thread object vice versa then dead clock happen
	//case 4:Main thread calls join method on Main thread object then dead clock happen
	 
	//sleep	 
	// Thread don't want to perform any operation for a particular amount of time
	 
	//interrupt and sleep
	// Yes- Thread can interrupt sleeping thread or Waiting Thread by using interrupt method of thread class
	@Override
	public void run()
	{
		try {
			//case 2 and case 3
			//mt.join();
			
			//Job of Thread
			//Executed  by Child Thread
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread");	
				
		   //Thread.yield();
				
				 //interrupt and sleep	
		Thread.sleep(2000);
		} 
		}catch (InterruptedException e) {
			
		}
		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		//case 2
		//MyThreadJoinSleep.mt=Thread.currentThread()	;
		//case 4
		//Thread.currentThread().join();
		//Thread instantiate
		MyThreadJoinSleep t=new MyThreadJoinSleep();		
		t.start();	
		//Case1:
		//t.join();
		//t.join(10000);
		//case 3:
		//t.join();
		
		
		 //interrupt and sleep
		t.interrupt();
		//Executed  by Main Thread
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}

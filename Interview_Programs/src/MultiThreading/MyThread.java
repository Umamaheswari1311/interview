package MultiThreading;

public class MyThread extends Thread {
	
	 /*What is multi tasking?
	  Executing several task simultaneously		
	Increased performance by Reduce response time of the system
	Mutli media Grphics,video Games,Animations,web server and application server(Tomcat-60 Thread)*/
	
	//If there is no dependence between task then multi threading is best practice
	/*What is process based multi tasking?
   Executing several task simultaneously where each task is separate independent program (process )  on OS level */
	
	/* What is Thread based multi tasking? 
	  Executing several task simultaneously where each task is separate independent part of the same program(Thread) on programmatic level */
	
	
	 /* What is Thread? 
	  Seperate flow of Execution and each thread has own job*/
	 
	
	
	/*  Define a thread? 
	  By Extending Thread class
	  By implementing Runnable interface
	 */
			
	
//	Thread Scheduler
/*
* Part of JVM and Responsible to schedule Threads execution 
* Order of execution is desired by algorathim (FIF,RoundRobbin..)of scheduler varied from JVM to JVM
* Exact o/p we can't desired but possible o/p can define
*/	
	
	
	@Override
	public void run()
	{
		//Job of Thread
		//Executed  by Child Thread
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		
		//Every Java program having one Thread defaultly in main method and inside that multiple Demon Threads are there	
	
		//Thread instantiate
		MyThread t=new MyThread();

	     
	     
	     
		//Stating of child Thread
		
		//Start()
		/*
		 * Register the Thread with Thread Scheduler 
		 * All mandatory activate to start the new Threading
		 * Invoke run() method to achieve multithreading environment
		 * Heart of Multi threading
		 */
        
        
		//Diff btw t.start() and t.run()
		
		
		/*
		 * Seperate new Thread is created for both jobs(jobs(Child and Main) 
		 * 2 Threads
		 * Execute simultanously 
		 * Possible o/p can define
		 */
		
		
		
		t.start();
		
	
		
		/*
		 * New thread won't be created and  Main thread alone take care both jobs(Child and Main)
		 * one Thread
		 * Normal sequential flow of execution
		 * Exact O/p can define
		 */
		
		//t.run();
		//Executed  by Main Thread
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}

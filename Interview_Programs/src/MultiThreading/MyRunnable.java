package MultiThreading;

public class MyRunnable implements Runnable{

	/*
	 * Define Thread by Runnable implementation? 
	 * Runnable interface is present
	 * java.lang package. Only run() method is available
	 */

	@Override
	public void run() {
		
		//Job of thread executed by child Thread
		for(int i=0;i<10;i++)
		{
			System.out.println("my runnable Thread");
		}
		
	}
	public static void main(String[] args) {
		MyRunnable myrun=new MyRunnable();
		
		Thread t1=new Thread();
		
		//New thread created and called run method of thread class  with empty implementation		
		t1.start();
		//No new thread will be create and called run method of thread class  with empty implementation(Normal method call)
		//t1.run();
		Thread t2=new Thread(myrun);//Target Runnable
		//New thread created and called run method of MyRunnable class with implementation
		///t2.start();
		//No new thread will be create and called run method of MyRunnable class  with implementation(Normal method call)
		//t2.run();
		//Compile time exception
		//myrun.start();
		//No new thread will be create and called run method of MyRunnable class  with implementation(Normal method call)		
		//myrun.run();
		
		/*
		 * for(int i=0;i<10;i++) { //Executed by main Thread
		 * System.out.println("Main Thread"); }
		 */
			
	}
}

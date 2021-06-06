package MultiThreading.Syncornized;

public class Display {
	int result =0;
	public synchronized void numberDisplay(int  increment) throws InterruptedException {
		
		while(increment<10)
		{
			result = increment;
			Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+ " "+result);
		
		increment++;
		}
		
		
	}
	
public  void waitDisplay(int  increment)  {
	synchronized (this) {
		while(increment<=100)
		{
			result += increment;
		
		
		increment++;
		}
		this.notify();
	}
	}
	public static synchronized void display(int  increment) {
		int result =0;
		while(increment<10)
		{
			result += increment;
		System.out.println(Thread.currentThread().getName()+ " "+result);
		increment++;
		}
		
		
		
	}
public void displaying(int  increment) throws InterruptedException {
		
	;;;;;;;;
	//synchronized (this) {
		while(increment<10)
		{
			result = increment;
			Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+ " "+result);
		
		increment++;
		}
		
//}
	;;;;;;;;;
}
public static void  displayingStatic(int  increment) {
	;;;;;;;;
synchronized (Display.class) {
	int result =0;
	while(increment<10)
	{
		result = increment;
		System.out.println(Thread.currentThread().getName()+ " "+result);
	increment++;
	}
	
	
	}
	;;;;;;
}
}
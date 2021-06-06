package MultiThreading;

public class StartMethodOverriding extends Thread{
	
	
	//Is it compulsory to override the start() method?
	/* Not Recommended because we need to make multi threading env
	 * if we override the start() method then it will behave as normal method and won't create new thread
	 */	@Override 
	  public void start() {
	  
	 super.start();
	  
	  System.out.println("start method");
	  
	  }
	@Override 
	  public void run() {
	  
	  
	  System.out.println("run methods");
	  
	  }
	public static void main(String[] args) {
		StartMethodOverriding start=new StartMethodOverriding();
		start.start();
		System.out.println("Main method");
		
		//illegalThreadstateException
		//start.start();
	}

}

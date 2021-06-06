package MultiThreading;

public class RunMethodOverloading extends Thread {
	//overloading of Run method is possible?-yes
			//start () invoke run method without argument
			//Overloaded run methods are invoke explicity
	       
	
	//is it compulsory to override ?
	   // if no means ,start () invoke Thread class run method which has empty implementation then no o/p
	    //Yes because  if we need to do multi threading 
	
		
	
	  @Override 
	  public void run() {
	  
	  
	  System.out.println("no arg methods");
	  
	  }
	 
	public void run(int i)
	{
		
		
			System.out.println(i);

	}
	
	public static void main(String[] args) {
		RunMethodOverloading th=new RunMethodOverloading();
		th.start();
		
	}
	}

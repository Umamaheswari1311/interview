package MultiThreading.Syncornized;

public class Mythread extends Thread {
	Display d;
	int number;
	
	public Mythread(Display d,int n)
	{
		this.d=d;
		this.number=n;
		
	}
	
 public void run() 
	{
		/*
		 * try {
		 * 
		 * //d.numberDisplay(number); // displaying(number); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		//Display. display(number);
	//Display.displayingStatic(number);
	 //wait
	 
	 d.waitDisplay(number);

	}
	public static void main(String[] args) throws InterruptedException {
		
		//case 1:same object with synchornized methods
		/*
		 * Display d=new Display(); Mythread t1=new Mythread(d,9); Mythread t2=new
		 * Mythread(d,8); Mythread t3=new Mythread(d,7); Mythread t4=new Mythread(d,6);
		 * t1.start(); t2.start(); t3.start(); t4.start();
		 */
		//Case 2:Different Object with same methods,No synchronation required
		
		/*
		 * Display d1=new Display(); Display d2=new Display(); Display d3=new Display();
		 * Display d4=new Display(); Mythread t1=new Mythread(d1,9); Mythread t2=new
		 * Mythread(d2,8); Mythread t3=new Mythread(d3,7); Mythread t4=new
		 * Mythread(d4,6); t1.start(); t2.start(); t3.start(); t4.start();
		 */
		//Case 3: static Synchornized acheive by class level lock
		
		/*
		 * Display d1=new Display(); Mythread t1=new Mythread(d1,9); Mythread t2=new
		 * Mythread(d1,8); t1.start(); t2.start();
		 */
          
          
          //Syncronized Block
		
		//Case 1: To get lock of current object		 
		//Case 3: To get lock of class level
		/*
		 * Display dblock=new Display(); Mythread tblock1=new Mythread(dblock,9);
		 * Mythread tblock2=new Mythread(dblock,8); Mythread tblock3=new
		 * Mythread(dblock,7); Mythread tblock4=new Mythread(dblock,6); tblock1.start();
		 * tblock2.start(); tblock3.start(); tblock4.start();
		 */
		  
		  //wait
		  Display d=new Display(); 
          Mythread t=new Mythread(d,1); 	
          t.start();
          //Thread.sleep(10000);
       //   t.join();
         //wait
          synchronized(t)
          {
        	 t.wait();
         System.out.println(d.result);
          }
          
	}

}

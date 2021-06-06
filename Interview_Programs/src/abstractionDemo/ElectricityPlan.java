package abstractionDemo;

public  abstract class ElectricityPlan {
	//Hiding the implementation details
	//Abstraction class means partial implementation and (o to 100)Abstract)
	//Class contains atleast  one abstract(unimplemented) method then it is abstract class
	protected double rate;
	 public abstract void getRate(int units);
	 
	 public void calculate (int units)
	    {
	            System.out.print("bill amount for "+ units + "units: ");
	            System.out.println(rate*units);
	     }
}

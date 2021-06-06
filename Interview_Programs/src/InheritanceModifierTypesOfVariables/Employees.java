package InheritanceModifierTypesOfVariables;

public class Employees {
	
	int id=101;
	private int sal;
	static String dep="Employee of Wipro";
	String name;
	
	public Employees(int num,String name)
	{
		this .id=num;
		this.name=name;
	}
	
	public void employeeDetails(int sal)
	
	{
	
		int bonus = 0;	
		
		System.out.println(id+" "+name+" "+" "+dep+" "+sal +" "+bonus);
		
	}
	
  protected void employeeDetails()
	
	{
	sal=100;
	
		int bonus = 0;	
		
		System.out.println(id+" "+name+" "+" "+dep+" "+sal +" "+bonus);
		
	}
  
  public int  setSal()
	
 	{
 	sal=100;
 	
 	return sal;	
 		
 		
 		
 	}
	}



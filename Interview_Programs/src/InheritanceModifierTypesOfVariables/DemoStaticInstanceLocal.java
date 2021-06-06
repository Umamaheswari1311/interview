package InheritanceModifierTypesOfVariables;

public class DemoStaticInstanceLocal {

	public static void main(String[] args) {

		Employees emp=new Employees(101,"Raghu");
		
	emp.setSal();
	emp.employeeDetails();
	emp.employeeDetails(2000);	
		
		
		  Tester tester=new Tester(102,"Ramu"); Tester.dep="SDET";
		  tester.employeeDetails(4000);
		  
		  
		  Employees emp1=new Tester(103,"Abi");
		  
		  emp1.employeeDetails(5000);
		 
		
		
	}

}

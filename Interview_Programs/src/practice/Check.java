package practice;

import java.util.Scanner;

import InheritanceModifierTypesOfVariables.Employees;

public class Check {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employees emp=new Employees(101,"Raghu");
	
	//emp.employeeDetails(2000);
		
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      if(((N%2==0) && (N>=2 && N<=5)) ||( (N%2==0) && (N>=21 && N<=100)))
      {
           System.out.println("Not Weird"); 
          
      }
      else if((N%2!=0) ||(N>=6 && N<=20))
      {
        System.out.println("Weird");
          
      }
        scanner.close();
	
	}

}

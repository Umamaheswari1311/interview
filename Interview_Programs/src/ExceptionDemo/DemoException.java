package ExceptionDemo;

import java.util.ArrayList;

public class DemoException {
	
//Object-Super most class
//Throwable -super class
//Exception and Error
//Exception
/*
* Exception is an unexpected event occur during execution of a program at runtime 
* Able to handle by program
*/
//Checked Exception-IO Exception or Complile time 
//Unchecked Exception-Null pointer Exception 0r Run time exception
//Error
/*Server problem
Computer runs out of scape
Not Able to handle by program
*/
	int id;
	static String name;
	
	public static void checkedException()
	{
		//System.out.println(id);
	}
	public static void unCheckedException()
	{
		System.out.println(name.length());
	}
	
	public static void artithmeticExecption()
	{
		try {
			int check=1/0;
			System.out.println(check);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void arrayOutOfBoundExecption()
	{
		try {
			int [] arr= {1,2,3,4};
			System.out.println(arr[4]);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void indexOutOfBoundExecption()
	{
		try {
			ArrayList<Integer> li=new ArrayList<>();
			li.add(1);
			li.add(2);
			System.out.println(li.get(2));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void classCastExecption()
	{
		try {
			Object o = new String();
	        Integer i = (Integer) o;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			int i=10;
			Double  d=(double) i;
			
			System.out.println(d);
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		//checkedException();
		
		//unCheckedException();
		artithmeticExecption();
		//arrayOutOfBoundExecption();
		//indexOutOfBoundExecption();
		//classCastExecption();
		//IllegalArgumentException
		Thread.currentThread().setPriority(17);
		System.out.println(Thread.currentThread().getPriority());
		
	}

}

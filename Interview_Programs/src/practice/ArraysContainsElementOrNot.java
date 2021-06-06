package practice;

import java.util.Scanner;

public class ArraysContainsElementOrNot {

	
	public static void main(String[] args) {
		boolean b=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int n=sc.nextInt();
		System.out.println("Find element ");
		int ele=sc.nextInt();
		System.out.println(" Array Elelments");
		for(int i=0;i<n;i++)
		{
			if(ele== sc.nextInt())
			{
				b=true;
				break;
			}
			else
			{
				b=false;
				
			}
		}
		
		if(b)
		{
			System.out.println("Element is present:"+ele);
			
		}
		else
		{
			System.out.println("Element is not present:"+ele);
		}
	}

}

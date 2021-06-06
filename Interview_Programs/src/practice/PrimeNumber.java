package practice;

import java.util.Scanner;


public class PrimeNumber {
public static boolean  logic(int num)
{
	if(num<2)
	{
		return false;
	}
	for(int i=2;i<num;i++)
	{
		if(num % i == 0)
		{
			return false;
		}
	}
	
	return true;
	
}
public static void  isPrimeNumber(int num)
{
	if (logic(num))
	{
		System.out.print("Number is Prime:"+num);
	}
	
	else
	{
		System.out.println("Number is not Prime:" + num);
	}
}
public static void  printPrimeNumbers(int num)
{
	for(int i=0;i<=num;i++)
	{
		if (logic(i))
		{
			System.out.println(i);
		}
		
		
	}
}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * System.out.println("Enter the Number"); int num=sc.nextInt();
		 * isPrimeNumber(num);
		 */
		System.out.println("Enter the Number");
		int n=sc.nextInt();
	     
	    printPrimeNumbers(n);
		
	}

}

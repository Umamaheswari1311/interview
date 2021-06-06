package practice;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void logic(int x)
	{
	int temp=x;
	int rem,store=0;
	while(x!=0)
	{
		rem=x%10;
		store=(store*10)+rem;
		x=x/10;
	}
	System.out.println(temp+"......"+store);
	if(temp==store)
	{
		System.out.println("Palindrome:"+temp); 
	}
	else
	{
		System.out.println("Not a Palindrome:"+temp); 
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		logic(num);
	}
	
}

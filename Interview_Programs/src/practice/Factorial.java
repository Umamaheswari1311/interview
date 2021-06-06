package practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int fact=1;
//		for(int i=1;i<=n;i++)
//		{
//			fact=fact*i;
//		}
//		
System.out.println(fact(n));
	}

	
public static int fact(int num)	
{
   if(num>=1)
   {
	return num *(fact(num-1));
   }
   else
   {
return 1;
   }
}
	
}
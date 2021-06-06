package practice;

import java.util.Scanner;

public class AmStrongNumber {
public static  void isAmstrongNumber(int num)
{

	int rem,temp=num,store=0;
	while(num>0)
	  {
		rem=num%10;
		store =(int) (store+ Math.pow(rem, 3));
		num=num/10;
	    }
		if(store==temp)
		{
		System.out.println("Amstrong Number: "+store);	
	    }
		else
		{
			System.out.println("Not an Amstrong Number: "+store);	
		}
}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		isAmstrongNumber(num);
	}

}

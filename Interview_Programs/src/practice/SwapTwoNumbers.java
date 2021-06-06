package practice;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void logicWithThird(int ... var)
	{
		int x=var[0];
		int y=var[1];
		int z=x;
		x=y;
		y=z;
		System.out.println(x+"......"+y); 
    }
	public static void logicWithoutThird(int ... var)
	{
		int x=var[0];
		int y=var[1];
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+"......"+y); 
    }
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in)	;
	System.out.println("Enter First number");
	int x=sc.nextInt();
	System.out.println("Enter Second number");
	int y=sc.nextInt();
	System.out.println(x+"......"+y); 
	logicWithThird(x,y);
	logicWithoutThird(x,y);
	}
     }

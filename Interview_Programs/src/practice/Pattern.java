package practice;

import java.util.Scanner;

public class Pattern {
	public static void RightTrianglePattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void LeftTopTrianglePattern(int n) {
		for (int i = 1; i <= n; i++) 
			{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(" ");
		}
			
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");	
		}
		System.out.println();
			}
			
	}	
	
	public static void LeftTrianglePattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			}
			
		
	}
	public static void RightTriangleNumberPattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}

	public static void RightTriangleRepeatedNumberPattern(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
	}
	
	public static void RightTriangleAlphaPattern(int n) {
int alpha=64;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	}

	public static void RightTriangleRepeatedAlphaPattern(int n) {
		int alpha=64;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
		}
	}

	public static void Triangle(int n) {
		int spaces=n-1;
	      for(int i=0;i<n;i++)
	      {
	    	  for(int j=0;j<spaces;j++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  spaces--;
	    	  for(int k=0;k<=2*i;k++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
		}
	public static void pryamid(int n) {
      for(int i=0;i<n;i++)
      {
    	  for(int j=0;j<n-1;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	 
    	  for(int k=0;k<=i;k++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
	}

	public static void Invertedpryamid(int n) {
	      for(int i=n-1;i >=0;i--)
	      {
	    	  for(int j=0;j<n-1;j++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  for(int k=0;k<=i;k++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int lines = sc.nextInt();
		 //TrianglePattern(lines);
		// TriangleNumberPattern(lines);
		// TriangleRepeatedNumberPattern(lines);
		//pryamid(lines);
		//Invertedpryamid(lines);
		Triangle(lines);
		//RightTrianglePattern(lines);
		//LeftTopTrianglePattern(lines);
		//LeftTrianglePattern(lines);
		//RightTriangleAlphaPattern(lines);
		//RightTriangleRepeatedAlphaPattern(lines);
		
	}

}

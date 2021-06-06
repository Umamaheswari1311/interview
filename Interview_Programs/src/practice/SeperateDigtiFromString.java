package practice;

import java.util.Scanner;

public class SeperateDigtiFromString {

	public static void main(String[] args) {
		int numberCount=0;
		int alpheticCount=0;
		int spaceCount=0;
		int specialCount=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input:");
		String s=sc.nextLine();
		char [] ch=s.toCharArray();
		for(char ele :ch)
		{
			if(Character.isDigit(ele))
			{
				numberCount++;
			}
			else if(Character.isAlphabetic(ele))
			{
				alpheticCount++;
			}
			else if(Character.isSpaceChar(ele))
			{
				spaceCount++;
			}
			else 
			{
				specialCount++;
			}
		}
		System.out.println("Number: "+numberCount);
		System.out.println("Alphabetic: "+alpheticCount);
		System.out.println("Space: "+spaceCount);
		System.out.println("Specail: "+specialCount);
	}

}

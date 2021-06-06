package practice;

import java.util.Scanner;

public class FindTheDuplicateCount {
//Solution 1	
public static void particularCharDuplicateCount(String s,char c)
{
	int count=0;
	;
	char[] ch=s.toLowerCase().toCharArray();
	for(char ele :ch)
	{
		if(ele==c) {
			count++;
		}
	}
	System.out.println("Duplicate Count for Character"+c+"is: "+count);
}
//Solution 2
public static void charDuplicateCount(String s,char c)
{
	int count;
	String str=s.toUpperCase();
	int beforeCount=str.length();
	String findChar=Character.toString(c).toUpperCase();
	str=str.replace(findChar, "");
	int afterCount=str.length();	
	count=beforeCount-afterCount;
	System.out.println("Duplicate Count for Character "+ c +"is: "+count);
}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Text");
		String text=sc.nextLine();
		System.out.println("Enter the character to find the duplicates");
		char ch=sc.next().charAt(0);	
		//particularCharDuplicateCount(text,ch);
		charDuplicateCount(text,ch);
	}

}

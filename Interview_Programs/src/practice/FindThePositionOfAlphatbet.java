package practice;

import java.util.Scanner;

public class FindThePositionOfAlphatbet {
public static void convertToLowerCaseThanFindPostion(char ch)
{
	//ASCII a=97
	int ascKey=(int)Character.toLowerCase(ch);
	System.out.println("ASCII for "+ch +":"+ascKey);
	int position=ascKey-96;
	System.out.println("Alphabet postion of "+ch +":"+position);
}
public static void convertToUpperCaseThanFindPostion(char ch)
{
	//ASCII A=65
	int ascKey=(int)Character.toUpperCase(ch);
	System.out.println("ASCII for "+ch +":"+ascKey);
	int position=ascKey-64;
	System.out.println("Alphabet postion of "+ch +":"+position);
}	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
      //A=65
     System.out.println("Enter the finding Character");
    char ch=sc.next().charAt(0);
    int asc=(char)ch;
    System.out.println(ch+":"+asc);
   // convertToLowerCaseThanFindPostion(ch);
   // convertToUpperCaseThanFindPostion(ch);
	}

}

package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthOfString {

	
	public static void main(String[] args) {
		int length = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the text: ");
String s=sc.nextLine();
//		char[] ch=s.toCharArray();
//		for (char c : ch) {
//			length ++; 
//		}
System.out.println("Length of "+ s +" is "+length);

Matcher m=Pattern.compile("$").matcher(s);
m.find();
length =m.end();
System.out.println("Length of "+ s +" is "+length);
	}

}

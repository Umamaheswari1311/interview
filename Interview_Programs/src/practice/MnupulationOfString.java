package practice;

import java.util.Scanner;

public class MnupulationOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 System.out.println("Enter the sentence");
 
 String s=sc.nextLine();
 //System.out.println(s.replaceAll("[AEIOUaeiou]", "*"));
 //System.out.println(s.replaceAll("[AEIOUaeiou]", "\\$"));
 
//trim
 //System.out.println(s.trim());
 
 //strip
 //System.out.println(s.stripLeading());
// System.out.println(s.stripTrailing());
// System.out.println(s.strip());

//Regular Expression
	//System.out.println(s.replaceAll("^[ \t]",""));
	//System.out.println(s.replaceAll("[ \t]+$",""));
	//System.out.println(s.replaceAll("^[ \t]"+"|[ \t]+$",""));
	
	//Remove Junk
	System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
	
}
}
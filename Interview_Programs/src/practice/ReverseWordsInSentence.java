package practice;

import java.util.Scanner;

public class ReverseWordsInSentence {

	public static void reverseWords(String str)
	{
		String [] word=str.split(" ");
		String reverseWord ="";
		for(int i=word.length-1;i>=0;i--)
		{
			reverseWord +=word[i]+" ";	
		}
		System.out.println(str+"......."+reverseWord);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner (System.in);    
     reverseWords(sc.nextLine());
	}

}

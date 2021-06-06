package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	
	//Solution 1
	public static void direct(String str)
	{
		StringBuffer temp=new StringBuffer();
		temp.append(str);
		
	     temp.reverse();
		if(temp.equals(str))
		{
			System.out.println("Palindrome: "+str);
		}
		else
		{
			System.out.println("Not a Palindrome: "+str);
		}
	}
	//Solution 2
	public static void logic(String str)
	{
		char [] ch=str.toCharArray();
		String temp = str;
		String reverseString="";
		for(int i=ch.length-1;i>=0;i--)
		{
			reverseString +=ch[i];
		}
	
		if(temp.equals(reverseString))
		{
			System.out.println("Palindrome: "+str);
		}
		else
		{
			System.out.println("Not a Palindrome: "+str);
		}
	}
	//Solution 3
	
		public static void logicCollection(String str)
		{
			char [] ch=str.toCharArray();
			List <Character> li=new ArrayList<Character>();
			for (char c : ch) {
				li.add(c);							
			}
          Collections.reverse(li);
          ListIterator<Character> iterator=li.listIterator();
          while(iterator.hasNext())
          {
        	  System.out.println(iterator.next());
          }
          if(li.equals(str))
          {
  			System.out.println("Palindrome: "+str);
  		}
  		else
  		{
  			System.out.println("Not a Palindrome: "+str);
  		}
		}
	public static void main(String[] args) {
		//direct("uma");
		//logic("uma");
		logicCollection("uma");

	}

}

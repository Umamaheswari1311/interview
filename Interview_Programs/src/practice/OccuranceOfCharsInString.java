package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class OccuranceOfCharsInString {

	
	public static void logic(String str)
	{
		char [] ch=str.replace(" ", "").toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c :ch)
		{
			
			Integer count=map.get(c);
			if(count==null) {
				map.put(c, 1);				
			}
			else
			{
				map.put(c, count+1);	
			}
		}
		for(Entry<Character, Integer> entry :map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
        String  str=sc.nextLine();
        logic(str);
	}

}

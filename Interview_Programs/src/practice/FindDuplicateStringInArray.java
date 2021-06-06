package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateStringInArray {
	
	//solution 1
public static void duplicatSting(String[] arr)
{
	int size=arr.length;
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;i<size;j++)
		{	
		if(arr[i].equals(arr[j]))
		{
			System.out.println(arr[j]);
			
		}
	
		}
	
	}
}
//solution 2
public static void duplicateStringUsingSet(String []arr)
{
	HashSet <String> set=new HashSet<String>();
	for(String s :arr)
	{
	if(set.add(s)==false)
	{
		System.out.println(s);
	}
	}
}
//solution 3
public static void duplicateStringUsingMap(String [] arr)
{
	Map <String,Integer> map=new HashMap<String,Integer>();
	for(String s :arr)
	{
	Integer count=map.get(s);
	
	if(count==null)
	{
		map.put(s,1);
		
	}
	else
	{
		map.put(s, count+1)	;
	}
	}
	System.out.println(map);
}
	public static void main(String[] args) {
		String [] arr= {"selenium","Cucumber","serenity","selenium","serenity"};
		
		
		//duplicatSting(arr);
		duplicateStringUsingSet(arr);
		//duplicateStringUsingMap(arr);
	}

}

package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SmallestLargetNumberFromArray {
//Solution 1
	public static void smallestNumber(Integer[] arr )
	{
	     Arrays.sort(arr);
	
		System.out.println("Smallest Number in an array: "+arr[0]);
	}
	public static void largestNumber(Integer[] arr )
	{
		Arrays.sort(arr);
		System.out.println("Largest Number in an array: "+arr[arr.length-1]);
	}
	//Solution 2
	public static void smallestNumberFromArray(Integer[] arr )
	{
	    int smallest=Integer.MAX_VALUE;
	    
	    for(int ele :arr)
	    {
	    	if(ele<smallest)
	    	{
	    		smallest=ele;
	    		
	    	}
	    }
	    System.out.println("Smallest Number in an array: "+smallest);
	}
	public static void largestNumberFromArray(Integer[] arr )
	{
       int largest=Integer.MIN_VALUE;
	    
	    for(int ele :arr)
	    {
	    	if(ele>largest)
	    	{
	    		largest=ele;
	    		
	    	}
	    }
	    System.out.println("Largest Number in an array: "+largest);
	}
	
	//solution 3
	public static void smallestNumberUsingCollection(Integer[] arr )
	{
	    List<Integer> li=Arrays.asList(arr);
	    Collections.sort(li);	
		System.out.println("Smallest Number in an array: "+li.get(0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr= {23,34,12,5};
		//smallestNumber(arr);
		//largestNumber(arr);
		//smallestNumberFromArray(arr);
		//largestNumberFromArray(arr);
		smallestNumberUsingCollection(arr);
	}

}

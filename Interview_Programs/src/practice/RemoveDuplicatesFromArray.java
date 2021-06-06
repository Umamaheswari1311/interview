package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class RemoveDuplicatesFromArray {
	public static void logicWithoutSet()
	{
		int [] arr= {1,2,3,2,4,5};
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[length-1];
					j--;length--;
				}
				
			}
				
		}
		
		int[] uiqueArr=Arrays.copyOf(arr, length);
		for(int ele : uiqueArr)
		{
			System.out.println(ele );
		}
		
		
	}
	public static void logicWithSet(Integer[] arr)
	{
		Set <Integer> set=new HashSet<Integer>(Arrays.asList(arr));
		Iterator<Integer> li=set.iterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

	
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,2,4,3,5,6};
	Object [] obj	=Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(obj));
		//logicWithSet(arr);
		//logicWithoutSet();

}
}
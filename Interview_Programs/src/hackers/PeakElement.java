package hackers;

public class PeakElement {

	public static void main(String[] args) {
		int arr []= {1,2,3,1};
		System.out.println("Peak index of Element:"+find(arr));

	}
public static Integer find(int [] arr)
{
	if(arr==null||arr.length==1)
		return null;
	int start=0;
	int end=arr.length-1;
	while(start<=end)
	{
		int mid=(start+end)/2;
		if(mid==0||arr[mid]>=arr[mid-1] && mid==arr.length-1||arr[mid+1]<=arr[mid])
		{
			System.out.println("Peak Element:"+arr[mid]);
			return mid;
		}
		
		else if(mid>0 && arr[mid]<arr[mid-1])
		{
			end=mid-1;
		}
		else 
		{
			start=mid+1;
		}
	}
	return null;
	
}
}

package DataStructureQuiz;

import java.util.Arrays;

public class Binaryseachoperation {
	
	public static int binarysearch(int arr[],int low,int high,int key)
	{
		//Approach 1
		if(low>high)
		{
		return -1;
		}
	int	mid=(low+high)/2;
		if ( key==arr[mid])
		{
			return mid;
		}
		else if(key<arr[mid])
		{
			return binarysearch(arr,low,mid-1,key);
		}
		else
		{
			return binarysearch(arr,high,mid+1,key);
		}
		
	}
//Approach 2(linear search)
//	public static void binarysearch2(int arr[],int low,int high,int key)
//	{
//		
//		int i=0;
//		while(low<=high)
//			
//		{	
//			int mid=low+high/2;
//		if (mid==key)
//		{
//			System.out.println("ele found");
//		}
//		else if(arr[mid]<key)
//		{
//			low=mid-1;
//		}
//		else(arr[mid]>key)
//		{
//			high=mid+1;
//		}
//	}
//	}
	
	public static void main(String[] args) 
	{
		int arr[]= {1,2,5,6,8,9,10};
		int key=5;
		int low=0;
		int high=arr.length-1;
		int result=binarysearch(arr,low,high,key);
		//binarysearch2(arr,low,high,key);
		if (result!=-1)
		{
			System.out.println("X element  found" +result );
			 //   System.out.println("X element not foundat any index" );
			    
		}
			    else {
			    	System.out.println("X element not found"  );
			    }
		//Approach 3(binarysearchmethod in Arrays class)
		int a=Arrays.binarySearch(arr, 10);

		System.out.println("10 element found in " +a+" position");

		}

	}



package Arrays_op;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertEleInArray 
{
	public static int[] insert(int arr[],int val,int pos)
	{
		int len=arr.length;
		int temp[]=new int[len+1];
		for(int i=0;i<len+1;i++)
		{
			if(i<pos)
			{
			temp[i]=arr[i];
			}
			else if(i==pos)
			{
				temp[i]=val;
			}
			else
			{
				temp[i]=arr[i-1];
				
			}
			
		}
		return temp;
		
	}
	
	//2. Approach using ArrayList
	
	public static Integer[] insertusingarray(Integer arr[],int val,int pos)
	{
		//Convert array in to arraylist
		//List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		List<Integer> arrlist=new ArrayList(Arrays.asList(arr));
		arrlist.add(2, 50);
		//convert ArrayList into array 
		
		arr=arrlist.toArray(arr);
		
		return arr;
		
	}

	public static void main(String[] args) {
		int arr[]= {5,6,3,7};
		int val=10;
		int pos=3;
		arr=insert(arr,val,pos);
		 System.out.println("\nArray with " + val
                 + " inserted at position "
                 + pos + ":\n"
                 + Arrays.toString(arr));
		 
		 // Printing the original array
		 Integer arr1[]= {5,6,3,7,10};
		 int val=50;
		 int pos=2;
		 arr1=insertusingarray(arr1,val,pos);
	        System.out.println("Array using ArrayList:\n"
	                        + Arrays.toString(arr1));
		
		// TODO Auto-generated method stub

	}

}

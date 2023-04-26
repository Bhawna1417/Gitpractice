package Sorting;

import java.util.Arrays;

public class Bubblesort {
	//method 1(iterative approach)
	public static void findbybubblesort(int arr[])
	{
		
		System.out.println("Element before sorting" +Arrays.toString(arr));
		//System.out.println("Element before sorting" +arr);
	int len=arr.length;
		for (int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					//swap
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("Element After sorting" +Arrays.toString(arr));
		
	}
	

	public static void main(String[] args) {
		
		int arr[]= {4,6,3,2,0,1};
		findbybubblesort(arr);
		// TODO Auto-generated method stub

	}

}

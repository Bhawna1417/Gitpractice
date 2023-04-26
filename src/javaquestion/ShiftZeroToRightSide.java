package javaquestion;

import java.util.Arrays;

public class ShiftZeroToRightSide {
	
	public static int[] shift(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		
		
		int count=0;
      int newarray[]= new int[arr.length];
		for(int no:arr)
		{
			if (no!=0)
			{
				newarray[count]=no;
				count++;
			}
		}
		return newarray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] b = new int[]  {1,0,2,0,3,0};
		System.out.println(Arrays.toString(shift(b)));
		
	b = new int[]  {1};
		System.out.println(Arrays.toString(shift(b)));
	}

}

package Arrays_op;

public class Find_Largest_Contiguous_Sum_Subarray 
{
	public static int maxSubArraySum(int arr[])
	{
		int current_max =arr[0];
		int max_so_far=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			current_max=Math.max(current_max+arr[i], arr[i]);
			max_so_far=Math.max(max_so_far, current_max);
		}
		return max_so_far;
	}
	
	//find indexes of largest contiguous sum of sub array
	
	public static void  maxSubarraysumwithIndexes(int arr[])
	{
		int current_max =arr[0];
		int max_so_far=arr[0];
		int s,start,end;
		s=start=end=0;
		for (int i=1;i<arr.length;i++)
		{
			if (arr[i]>current_max+arr[i])
			{
			current_max=arr[i];
			s=i;
			}
			else
			{
				current_max=current_max+arr[i];
			}
			
			if (current_max>max_so_far)
			{
				max_so_far=current_max;
				start=s;
				end=i;
			}
		}
		System.out.println("max " +max_so_far);
		System.out.println("Indexes " +start+ " to  " +end);
	}

	public static void main(String[] args) {
		int arr[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		int arr1[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		//System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr));
		
		maxSubarraysumwithIndexes(arr1);

	}

}

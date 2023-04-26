package Arrays_op;
//Find Equilibrium point where elements before & after it has equal sum
public class GetEquibaliriumpoint {
 
	public static int getequilbarium(int arr[])
	{
		int sum=0;
		int sum_so_far=0;
		if(arr.length==0)
		{
			return -1;
		}
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];
			if (sum==sum_so_far)
			{
				return i;
			}
			sum_so_far=sum_so_far+arr[i];
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,6,7,0,7};
		System.out.println(getequilbarium(arr));
		// TODO Auto-generated method stub

	}

}

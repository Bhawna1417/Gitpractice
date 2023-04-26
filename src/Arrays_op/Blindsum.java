package Arrays_op;

public class Blindsum {

	public static void blindsum(int arr[])
	{
		int count;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			
			count=arr[i]+arr[j];
				if (count%10 ==0)
				{
					System.out.println(count+"Blind check");
				}
				else 
				{
					System.out.println(count+"Count is not blind");
				}
			}
			
				
		}
	}

		
	
	public static void main(String[] args) 
	{
		int arr[]= {23, 34, 55, 32, 78, 44};
		
		
		blindsum(arr);

	}

}

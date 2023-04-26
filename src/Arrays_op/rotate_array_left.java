package Arrays_op;

public class rotate_array_left {
	
	/*	public static void rotate(int array[])   ///rotate element by 1
	{
		int temp=array[0];
		for (int i=1;i<array.length;i++)
		{
			array[i-1]=array[i];
		}
		array[array.length-1]=temp;
		
		for(int j:array)
		{
			System.out.println(j);
		}
	}*/
  public static void rotateleft(int arr[],int d)
  {
	  int n=arr.length;
	  
	  int temp[]=new int[d]; 
	  //shift d element in temp
	  
	  for(int i=0;i<d;i++)
	  {
		  temp[i]=arr[i];
	  }
	  
	  //move all remaining element left side in array
	  
	  for(int i=d;i<n;i++)
	  {
		  arr[i-d]=arr[i];
	  }
	  
	  //move temp elements in array
	  
	  for(int i=0;i<d;i++)
	  {
		  arr[i+n-d]=temp[i];
	  }
	  
	  //print all elements
	  
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("" +arr[i]);
	  }
  }


	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		int d=3;
		//rotate(arr);
		rotateleft(arr,d);
		
		

	}

}

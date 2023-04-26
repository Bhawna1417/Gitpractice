package Arrays_op;

public class MinStepstoProduct_one 

{
	public static void makeproductone(int arr[],int n)
	
	{
	
		//Expected Time Complexity: O(N)
		//Expected Auxiliary Space: O(1)
		int zero=0;
		int positive=0;
		int steps=0;
		int negetives=0;
		
		for(int i=0;i<n;i++)
		{
			if (arr[i]==0)
			{	
				zero=zero+1;
			}
		else if (arr[i]>0)
		{
				steps=steps+(arr[i]-1);
				positive=positive+1;
		}	
			else {
				negetives=negetives+1;
			    steps=steps+(-1-arr[i]);
			    steps=steps+zero;
			}
		
			if (negetives%2 !=0 && zero==0)
			{
				steps=steps+2;
			}
		}
				//System.out.println("out");
		
		System.out.println("negetive no. " +negetives);
		System.out.println("0s in array " +zero);
		System.out.println("Positive no. " +positive);
		System.out.println("Steps " +steps);
	}
	
	

	public static void main(String[] args) 
	{

    int arr[]= {2,5,5,1};  //Test cases when all no. are positive
    int arr1[]= {-5,-1,-4,-3}; //hen all no. are negetive and even in counting
    int arr2[]= {-2,-3,-4,-1,-5};// when all no. are negetive and odd in counting
    int arr3[]= {0,0,0}; //when all no. are 0's
   // makeproductone(arr,4);
    makeproductone(arr1,3);
  //  makeproductone(arr2,5);
  //  makeproductone(arr3,3);
    

	}

}

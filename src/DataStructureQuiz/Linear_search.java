package DataStructureQuiz;

public class Linear_search {

	public static int search(int arr[],int x)
	{
	
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
				
				//System.out.println("X element " +arr[i]);
			//return arr[i]; //// use for return value of searching element
			return i;// use for return index of searching element
		}
		 return -1;
		
		
		//System.out.println("X element not found");
		
		
	}
	
	
	public static void main(String[] args) {
		
	   int a[]= {4,6,8,5,1};
	   int val=5;
	   
    int aa=search(a,val);
    if(aa==-1)
    
    	System.out.println("X element not found"  );
 //   System.out.println("X element not foundat any index" );
    
	
    else
    	System.out.println("X element  found" +aa );
	


	}

}

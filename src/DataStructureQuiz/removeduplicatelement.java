package DataStructureQuiz;

import java.util.HashSet;
import java.util.Set;

public class removeduplicatelement {

	
	    public static int removeDuplicates(int[] nums) {
	          if (nums.length == 0) return 0;
	   // int i = 0;
	    int count=0;
	    for(int i=0;i<nums.length;i++)
	    {
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	     //      i++;
	            nums[i] = nums[j];
	            System.out.println("not equal" +nums[i]);
	            count++;
	           // return i+1;
	        }
	    }
	    System.out.print("not equal" +nums[i] +count);
	    return count;
	}
	    
	    
	  //useing hashset:java collection :it stores unique value :complexity o(n)
	    
	    public static void remove(int[] arr)
	    {
	    	 Set<Integer>  hset=new HashSet<Integer>();
			  for(int val:arr)
			  {
			  if (hset.add(val)==false)
			  {
				  // +hset);
				  hset.remove(val);
//				  System.out.println("remove Duplicate element " +hset);
			  }
			 
			  }
			  System.out.println("Duplicate element " +hset);
	    }
	
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,4,8,8};
	int a=	removeDuplicates(arr);
	System.out.println("duplicatesss "+a);
		remove(arr);
		// TODO Auto-generated method stub

	}

}

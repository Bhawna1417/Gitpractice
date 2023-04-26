package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class twonum {
	
	public static boolean sumusingbruteforce(int a[],int sum)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]+a[j]==sum)
				{
					return true;
				}
			}
			
			}
		return false;
	}


	//using map
	 public static int[] findTwoSumusingmap(int[] nums, int target) {
		 
		 
	        Map<Integer, Integer> numMap = new HashMap<>();
	        //Fill Array data in to Hashmap
	        for(int i=0;i<nums.length;i++)
	        {
	        	numMap.put(nums[i],i);
	        }
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (numMap.containsKey(complement)) 
	            {
	            	int index=numMap.get(complement);
	            	if(index==nums[i] )continue;
	            	 System.out.println("hii "+numMap.containsKey(complement));
	                return new int[] {i,index};
	            }
	        }
	     
	        return new int[] {0,0};
	    }
	//Using set
	 public static boolean sumexixst(int[] a,int sum)
	 {
		 if (a.length==0)
		 {
			 return false;
		 }
		 Set<Integer> set=new HashSet<>();
		 for(int i=0;i<a.length;i++)
		 {
			 if(set.contains(sum-a[i]))
			 {
				 return true;
				 
			 }
			 else {
				 set.add(a[i]);
			 }
		 }
		 return false;
	 }
	
public static boolean findsumonsortedarray(int a[],int sum)
{
	Arrays.sort(a);
	int start=0;
	int end=a.length-1;
	while(start <= end)
	{
	int s=a[start]+a[end];
	if(s==sum)
		{
		return true;
		
	    }
	else if(s>sum)
	{
		end--;
	}
	else 
	{
		start++;		
	}
	}
	return false;
}

	
	 public static void main (String[] args)
	    {
	        int[] A = { 8, 17, 2, 5, 3, 1 };
	        int sum = 25;
	 
	        System.out.println(findTwoSumusingmap(A, sum));
	        System.out.println(sumexixst(A, sum));
	        System.out.println(sumusingbruteforce(A, sum));
	        System.out.println(findsumonsortedarray(A, sum));
	        
	    }
	}
package DataStructureQuiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Find_duplecate_Element_in_array {

	//private static final boolean String = false;

	public static void main(String[] args) {
		//1. compare each element : here complexity  is O(n^2) (when we use 2 for loops inner and outer then complexity comes in nxn--Worst approach
		String names []= {"bhawna","Harshul","Nishnat","Santosh","c","bhawna"};
		
	
		
		
		  for(int i=0;i<=names.length;i++) 
		  { for(int j=i+1;j<=names.length;j++) {
		 if(names[i].equals(names[j])) 
		 {
			 System.out.println("Duplicate element "+names[i]); 
			 }
		 }
		  }
		 

		
		//useing hashset:java collection :it stores unique value :complexity o(n)
		
	  Set<String>  hset=new HashSet<String>();
		  for(String str:names)
		  {
		  if (hset.add(str)==false)
		  {
			  System.out.println("Duplicate element " +hset);
		  }
		  }

		  
		  
		  
		
		//3. Using hashmap  
		  
		  HashMap<String,Integer> dup=new HashMap<String,Integer>();
				  {
			  for(String str1 : names)
				  
			  {
				  Integer count =  dup.get(str1);
				  System.out.println("Dup element  "+dup.get(str1));
				  System.out.println(count);
				if(count == null)
				{
					dup.put(str1, 1);
					//System.out.println("Duplicate element " +dup(count));
				}
				else

				{
					dup.put(str1, ++count);
				}
				  }
			  
		Set<Entry<String,Integer>> hasele=dup.entrySet();	 
		
		System.out.println("hasele element " +dup.entrySet());
		for(Entry<String,Integer> hasele2 : hasele)
		{
			if(hasele2.getValue()>1)
			{
			  System.out.println("Dups ele  "+hasele2.getKey());	
			}
		}
	}
	
	}

}

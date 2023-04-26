package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CounteachcharinString {
	 static void countEachChar(String str) 
	   { 
     char ch[]=str.toCharArray();
      
     Map<Character,Integer> wcount=new HashMap<Character,Integer>();
     
     for(char ch1:ch)
     {
  	   if(wcount.containsKey(ch1))
  	   {
  		   wcount.put(ch1, wcount.get(ch1)+1);
  		   }
  	   else
  	   {
  		   wcount.put(ch1, 1);
  		   }
     }
     
     Set<Character> set=wcount.keySet();
     for(char w:set)
     {
  	   if(wcount.get(w)>0)
  	   {
  		   System.out.println(w+ ":" +wcount.get(w));
  	   }
     }
	   }

	public static void main(String[] args) 
	{

		countEachChar("Bhawna");
		countEachChar(" ");

	}

}

package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//o/p of "beginners book is my fav book"
//book:2
//beginners:1
//is:1
//fav:1
//my:1

public class countoccurancesOfeachword {
	
	 static void countEachChar(String str) 
	   { 
       String word[]=str.split(" ");
        
       Map<String,Integer> wcount=new HashMap<String,Integer>();
       
       for(String words:word)
       {
    	   if(wcount.containsKey(words))
    	   {
    		   wcount.put(words, wcount.get(words)+1);
    		   }
    	   else
    	   {
    		   wcount.put(words, 1);
    		   }
       }
       
       Set<String> set=wcount.keySet();
       for(String w:set)
       {
    	   if(wcount.get(w)>0)
    	   {
    		   System.out.println(w+ ":" +wcount.get(w));
    	   }
       }
	   }
  
	   public static void main(String[] args) 
	   {  
		String str = "beginners book is my fav book"; 
		countEachChar(str); 
	   } 
	}



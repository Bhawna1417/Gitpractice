package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LongestsubstruniqueChar {
	
	public static void uniqlongeststr(String str,int k )
	{
		int max_len=0;
		int start=0;
		int end =0;
		
		Map<Character,Integer> map=new HashMap<>();
		while(end<str.length())
		{
			char endchar=str.charAt(end);
		    map.put(endchar, map.getOrDefault(endchar, 0)+1);	
		
		while(map.size()>k)
		{
			char startchar=str.charAt(start);
			map.put(startchar, map.get(startchar)-1);
			
		
		if(map.get(startchar)==0)
		{
			map.remove(startchar);
		}
		start++;
		}
		max_len=Math.max(end-start+1, max_len);
		end++;
		
	}
		Set keys=map.keySet();
		for(Object key: keys)
		{
		    System.out.println(key + ": " + map.get(key));
		}
		
		System.out.print(max_len);
	}
	public static void main(String[] args) 
	{
      String st="bccbababd";
      int k=2;
		uniqlongeststr(st,k);

	}

}

package String;

import java.util.HashMap;
import java.util.Map;

public class Smallest_substring_pattern_char 
{
	public static String smallest_pattern(String str,String pattern)
	{
		Map<Character,Integer> map=new HashMap<>();
		int matchedElement=0;
		int start=0;
	    int minSubStringLen=Integer.MAX_VALUE;
	    int minsubstringstart=0;
		for(int i=0;i<pattern.length();i++)
		{
			map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0)+1);
			}
		
		for(int end=0;end<str.length();end++)
		{
			char currentchar=str.charAt(end);
			if(map.containsKey(currentchar))
			{
				map.put(currentchar,map.get(currentchar)-1);
				
				if(map.get(currentchar)>=0)
				{
					matchedElement++;
				}
				}
					
			while(matchedElement==pattern.length())
			{
				if(end-start+1<minSubStringLen)
				{
					minSubStringLen=end-start+1;
					minsubstringstart=start;
				}
				char charstart=str.charAt(start++);
				if(map.containsKey(charstart))
				{
					if(map.get(charstart)==0)
					{
						matchedElement--;
					}
				map.put(charstart, map.get(charstart)+1);
					
				}
			}
		}
		if(minSubStringLen>str.length())
		{
			return "";
		}
		return str.substring(minsubstringstart,minsubstringstart+minSubStringLen);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package String;

import java.util.HashMap;
import java.util.Map;

public class Longest_substring_with_unique_char {
	
	public static int uniquelongestsubstring(String str)
	{
		int maxlen=0;
		int start=0;
		int end=0;
		Map<Character,Integer> map=new HashMap<>();
		while(end<str.length())
		{
			char endchar=str.charAt(end);
			
			 if(map.containsKey(endchar))
			 {
				 start=Math.max(start,map.get(endchar)+1);
			 }
			map.put(endchar, end);
			maxlen= Math.max(end-start+1,maxlen);
			end++;
			
		}
		return maxlen;
		//System.out.println(maxlen);
	}

	public static void main(String[] args) {
		System.out.println(uniquelongestsubstring("bcdcbababd"));
		uniquelongestsubstring("aaaaaaaaaaaa");
		uniquelongestsubstring("bccccdcdcccd");
		uniquelongestsubstring("010101234");


	}

}

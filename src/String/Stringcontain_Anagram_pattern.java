package String;

import java.util.HashMap;
import java.util.Map;

public class Stringcontain_Anagram_pattern {
	
	public static boolean anagramPattern(String str,String pattern)
	{
		Map <Character,Integer> map=new HashMap<>();
		for(int i=0;i<pattern.length();i++)
		{
		char patt=pattern.charAt(i);
		map.put(patt,map.getOrDefault(patt, 0)+1);
		}
		
		int matched_ele=0;
		int start=0;
		
		for(int i=0;i<str.length();i++)
		{
			char current_char=str.charAt(i);
			if(map.containsKey(current_char))
			{
				map.put(current_char,map.get(current_char)-1);
				if(map.get(current_char)==0)
				{
					matched_ele++;
				}
			}
			
			if(matched_ele==map.size())
			{
				return true;
			}
			if(i>=pattern.length()-1)
			{
				char startchar=str.charAt(start++);
				if (map.containsKey(startchar))
				{
					if (map.get(startchar)==0)	
					{
						matched_ele--;
					}
					map.put(startchar,map.get(startchar)+1);
				}			
			}
		}
		return false;
	}

	public static void main(String[] args) 
	{
		String str="bcdcbababd";
		String pattern="abc";
		//Stringcontain_Anagram_pattern pat=new Stringcontain_Anagram_pattern();
		System.out.println(anagramPattern("bcdcbababd", "abc"));
		System.out.println(anagramPattern("bcdcbabacbd", "aabc"));
		System.out.println(anagramPattern("bcdcbababd", "aa"));
		//System.out.println(bol);
	}

}

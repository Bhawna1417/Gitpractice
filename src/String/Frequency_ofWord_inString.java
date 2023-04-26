package String;

import java.util.HashMap;
import java.util.Map;

public class Frequency_ofWord_inString {
	
	public static Map<String,Integer> frequency(String str)
	{
	str=str.replaceAll("[^a-zA-Z0-9]"," ");	
	String str1[]=str.split(" +");
	Map<String,Integer> map=new HashMap<>();
	
	for(String s:str1)
	{
		s=s.toLowerCase();
		map.put(s,map.getOrDefault(s, 0)+1);
	}
	
	return map;
	}

	public static void main(String[] args) 
	{
		String str="adobe company want want to to be part of adobe.adobe is cool";
		System.out.println(frequency(str));

	}

}

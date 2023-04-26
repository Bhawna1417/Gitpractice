package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findduplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findduplicate("Bhawna");
		findduplicateset("Guptaaa");
	}
	
	public static void findduplicate(String str)
	{
		if (str==null)
		{
			System.out.println("String is null");
			
		}
		
		if (str.isEmpty())
		{
			System.out.println("String is emplty");
			
		}
		if (str.length()==1)
		{
			System.out.println("String is single");
			
		}
		
			///Using hashmap (it doesnot contain duplicate)
	char arr[]=str.toCharArray();
	
	
	Map<Character,Integer> charmap=new HashMap<Character,Integer>();
    for (Character ch : arr)
    {
    	if (charmap.containsKey(ch))
    	{
    		charmap.put(ch,1);
    	}
    	else 
    	{
    		charmap.put(ch, 1);
    		
    	}
    }
    //Print the map
    Set<Map.Entry<Character,Integer>>entrySet =charmap.entrySet();
    for (Map.Entry<Character, Integer> entry : entrySet) 
    {
    	if (entry.getValue()>1)
    	{
    		System.out.println(entry.getKey()+":"+entry.getValue());
    	}
    	}
    	
    }
	
	public static void findduplicateset(String str)
	{
		///Using hashmap (it doesnot contain duplicate)
	char arr[]=str.toCharArray();
	Set<Character> set=new HashSet<Character>();
	
	
	//Map<Character,Integer> charmap=new HashMap<Character,Integer>();
    for (Character ch : arr)
    {
    	
    }
	}
}

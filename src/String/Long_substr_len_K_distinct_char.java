package String;

import java.util.HashMap;
import java.util.Map;

public class Long_substr_len_K_distinct_char {
	
	public static int logeststr(String str,int k)
	{
		int start=0;
		int end=0;
		int max_length=0;
		
		Map<Character,Integer> map=new HashMap<>();
		while(end <str.length())
		{
			char currentchar=str.charAt(end);
			map.put(currentchar,map.getOrDefault(currentchar, 0)+1);
		int a =	map.getOrDefault(currentchar, 0)+1;
		int b =	map.getOrDefault(currentchar, 0);
			//System.out.println("default a" +a );
			System.out.println("default b " +currentchar+ " endchar " +b);
		while(map.size()>k)
		{
			char charfromfront=str.charAt(start);
			map.put(charfromfront,map.get(charfromfront)-1);
			System.out.println("get " +map.get(charfromfront));
			if(map.get(charfromfront)==0)
			{
				map.remove(charfromfront);
			}
				start++;
		}
		
		max_length=Math.max(end-start+1, max_length);
		end++;
		}
		return max_length;
}

	public static void main(String[] args) 
	{
	 String str="bccbabadef";
	 int k=2;
	System.out.println(Long_substr_len_K_distinct_char.logeststr(str, k));
		// TODO Auto-generated method stub

	}

}

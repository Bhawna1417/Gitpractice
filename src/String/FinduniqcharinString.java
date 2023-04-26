package String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FinduniqcharinString {
	
	public static void uniquechar(String str)
	{
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			//char ch=str.charAt(i);
			set.add(str.charAt(i));
			
		}
		
		//print set
		Iterator<Character> ch=set.iterator();
		while(ch.hasNext())
		{
			System.out.print(ch.next()+" ");
		}
		System.out.print(" these " +set.size()+ " are Unique char");
	}

	public static void main(String[] args) {
		uniquechar("abbbbcbad");
		
		// TODO Auto-generated method stub

	}

}

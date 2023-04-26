package DataStructureQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Angramproblem {
	
	
			
			public static boolean angram(String str1, String str2)
			{
				  // Check if both length matches
          if (str1.length()!=str2.length())
        	  return false;
          else 
          {
       // Convert both Strings into lower case and into Character Array
          char c1[]=str1.toLowerCase().toCharArray();
          char c2[]=str2.toLowerCase().toCharArray();
          // Sort both Character Array
          Arrays.sort(c1);
          Arrays.sort(c2);


          // Check if both arrays are equal
                    
	return (Arrays.equals(c1, c2));
			}
			}
			
			///anagram using arrylist
			public static boolean checkAnagram(String s1, String s2)
		    {
		        s1 = s1.replaceAll("\\s", "").toLowerCase();
		        s2 = s2.replaceAll("\\s", "").toLowerCase();

		        if (s1.length() != s2.length())
		            return false;

		        List<Character> list1 = new ArrayList<Character>();
		        List<Character> list2 = new ArrayList<Character>();

		        for (int i = 0; i < s1.length(); i++)
		        {
		            list1.add(s1.charAt(i));
		        }
		        for (int i = 0; i < s2.length(); i++)
		        {
		            list2.add(s2.charAt(i));
		        }

		        Collections.sort(list1);
		        Collections.sort(list2);

		        if (list1.equals(list2))
		            return true;
		        else
		            return false;
		    }
		
	public static void main(String[] args) {
		
	//	Array_Angramproblem.angram("meet", "teem");
		Array_Angramproblem.checkAnagram("meet", "teem");
		// TODO Auto-generated method stub

	}

}

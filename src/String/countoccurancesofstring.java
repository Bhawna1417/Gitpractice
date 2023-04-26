package String;

public class countoccurancesofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Bhawna Guptaaa";
char c='a';
		long count=s.chars().filter(w->(char)w=='a').count();
		System.out.println(count);  ///Char occurance in the String
		
		//charoccur(s,c);
		
		charoccur("Bhawnagupta",'a');
	//	s.chars().filter(predicate);

	}
	
	public static void charoccur(String s,char c)
	{
		
		int count = 0;
		for (int i=0;i<s.length();i++)
	    
		{
			if (s.charAt(i)==c)
			{
				count++;
			}
			
		}
		
		System.out.println("occurance of  " +c+" coming  " +count+ "times in " +s);
	}

}

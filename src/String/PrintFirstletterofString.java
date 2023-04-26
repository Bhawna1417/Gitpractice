package String;

public class PrintFirstletterofString {

	public static void main(String[] args) {
		
	//o/p 	" My name is bhawna";
//		M
//		n
//		i
//		b
			
			String str=" My name is bhawna";
			char s[]=str.toCharArray();
			//Char ch[]=s.
					int count=str.length();
			for(int i=0;i<count;i++)
			{
				//if(s[i]!=' ')
				{
				if (i==0)
				{
					System.out.print(str.charAt(i));
				}
				else if (str.charAt(i-1)==' ')
				{
					System.out.println(str.charAt(i));
				}
			
			}
			}
			
			//or can write above code in one line
			for(int j=0;j<count;j++)
			{
			if(s[j]!=0 && j==0 || s[j-1]==' ')
			{
				System.out.println(s[j]);
			}
			
			}
			}
	}
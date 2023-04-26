package String;

public class Replacefirstchar {
	// Replace first char with given word o/p "Bhawna"
	//Hyrshul
	static void replace(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='A')
			{
				ch[i]='y';
				
			}
		}
		System.out.println(ch);
		}

	public static void main(String[] args) {
		String str="A bhawna is a brand";
		replace(str);
		replace("Harshul");
		// TODO Auto-generated method stub

	}

}

package javaquestion;

public class wrapperclassconcept {

	public static void main(String[] args) {
		// Wrapper class is used to convert data type like int to string ,sting to int
		
		String s="100";
		System.out.println(s+20); //O/p ==10020
		
		//converting string to int 
		int n=Integer.parseInt(s);  //converting string to int 
		System.out.println(n+20); //o/p 120
		//converting string to double
		String d="12.55";
		double dou=Double.parseDouble(d);
		System.out.println(dou+20);
		
		//String to boolean
		String bo="true";
		boolean bool=Boolean.parseBoolean(bo);
		System.out.println(bool);
		

		//Int to String convertion
		int i=100;
		String s2i=String.valueOf(i);
		System.out.println(s2i);
		
		///Sting to int convertion but put number and char both in string then you will get exception here
		String s1="100A";
		int s3i=Integer.parseInt(s1);
		System.out.println(s3i);  //Here you will get NumberFormatException: For input string: "100A"
		
	}

}

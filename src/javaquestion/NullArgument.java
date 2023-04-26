package javaquestion;

public class NullArgument {
/// Pass null argument with method overloading of String and Object types
	//Need to read string buffer and string https://www.javatpoint.com/java-string
	public static void main(String a[]) 
	{
		test(null);
	}
	
	
//	public static void test(String s)
//	{
//		System.out.println("string O");
//	}
	public static void test(Object o)
	{
		System.out.println("Object O");
		
	}
	public static void test(StringBuffer s)
	{
		System.out.println("string O");
	}
}


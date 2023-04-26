package String;

public class String_Strbuffer_StringbuilderConcept {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//Strings in Java are immutable (cannot be changed). 
		
			  String s1 = "This is a String"; // Declared using String literal(when using a literal object, if the object already exists in the heap, a new object will not be created,)
			  String s2 = new String("This is another String"); // Declared using new operator,when using the new operator, a new String object will be created each time in the heap memory.
	     System.out.println(s1.charAt(2)); //position of char
	     
	     System.out.println(s1.substring(5));
	     System.out.println(s1.toUpperCase());
	     System.out.println(s1.concat(s2));
	     
	     
	     //StringBuilder and StringBuffer classes provide important methods that String class does not provide, such as insert(), delete() and reverse() methods.
	     //For string manipulation,should use StringBuilder or StringBuffer because it is much faster and consumes less memory than String.
	     //StringBuilder class does not provide synchronization, 
	     
	     StringBuilder sbd = new StringBuilder("Hello World");
	        String s = sbd.replace(5,11,"").append(" r2d2").toString();
	        System.out.println(sbd); // Hello r2d2
	        System.out.println(s.toUpperCase()); // HELLO R2D2
	        
	        
	        //StringBuilder class, StringBuffer also creates a mutable String.
	        //all method same as string builder, difference it is threadsafe
	     //   System.out.println(s1.substring(4, 5));
	                
	        //System.out.println(fun());
	}
	        
	      
	     }

		





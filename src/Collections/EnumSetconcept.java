package Collections;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetconcept {
	//it is not syncronized
	//it is highly faster than hashset
	//All the methods are implementing using bitwise Arithemetic operator
	

	enum lang
	{
		JAVA,
		Csharp,
		Python,
		CPP,
		ruby
	
	}

	public static void main(String[] args) {
  
		//to create new enumset using enum
		 EnumSet<lang> allele=EnumSet.allOf(lang.class);
    System.out.println(allele);
       
    //empty enum set
    EnumSet<lang> empt= EnumSet.noneOf(lang.class);
    System.out.println(empt);
    
    //To get enymset from a prticular range
     EnumSet<lang> range =EnumSet.range(lang.Csharp, lang.CPP);
     System.out.println(range);
     
     
     //of method for access multiple element
     EnumSet<lang> multiple=EnumSet.of(lang.JAVA, lang.Python);
     System.out.println(multiple);
     
     //Access elemnet using iterator:EnumSet :Iterartor
     EnumSet<lang> iterate=EnumSet.allOf(lang.class);
     Iterator<lang> iterat=iterate.iterator();
     while(iterat.hasNext())
     {
    	 System.out.println(iterat.next());
     }
     


	}

}

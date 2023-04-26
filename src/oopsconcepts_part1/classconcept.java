package oopsconcepts_part1;

public class classconcept {

	int mod;   //global variable or class variable (its scope is throught the program
	String name;

	//new classconcept(); --This is the object of classconcept class
	//new keyword is used to create the object
	//a,b,c- are the object reffrening variable of the class
	public static void main(String arg[])
	{
		classconcept a=new classconcept();
		classconcept b=new classconcept();
		classconcept c=new classconcept();

 a.mod=2015;
 a.name="i20";

 System.out.println(a.mod);
 System.out.println(a.name);

 
 b.mod=2016;
 b.name="maruti";
 System.out.println(b.mod);
 System.out.println(b.name);	 

	}


}

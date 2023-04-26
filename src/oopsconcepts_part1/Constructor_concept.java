package oopsconcepts_part1;

public class Constructor_concept {
	//Contructor never return value and same name as class name
			//Can we overload construtor -yes we can
	String name;
	int age;
	
	public Constructor_concept() 
	{
		System.out.println("Default constructor");
	}
	
	public Constructor_concept(int i) //1 param (constructor overloading
	{
		System.out.println("one param");
	}
	
	public Constructor_concept(int i,int j) //2 param (constructor overloading)
	{
		System.out.println("two param");
	}
	public Constructor_concept(String name,int age) //2 param (constructor overloading)
	{
		this.name=name; //this.classvar=loclvar
		this.age=age;
	//	name=name1;  can call without this keyword if we are using diff name  in local and global
	//	age=age1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_concept def=new Constructor_concept(); //calling default construtor
		
		Constructor_concept oneparam=new Constructor_concept(10);//calling one param construtor
		Constructor_concept twoparam=new Constructor_concept(10,20);//calling one param construtor
		Constructor_concept thisvar=new Constructor_concept("Tom",20);
		
	

	}

}

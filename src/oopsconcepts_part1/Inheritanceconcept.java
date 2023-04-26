package oopsconcepts_part1;

public class Inheritanceconcept {

	public void  car()
	{
		System.out.println("Parentclass");
	}
	public void  car2()
	{
		System.out.println("Parentclass");
	}
	public void  common()
	{
		System.out.println("parent common");
	}
}
class child extends Inheritanceconcept  //its called has a relationship 
{
	public void  child1()
	{
		System.out.println("child class");
	}

	public void  child2()
	{
		System.out.println("child class2");
	}
	public void  common()
	{
		System.out.println("child common"); //overridden method coz same method in parent class
	}
}
class inheritance
{
	public static void main(String[] args) {

		child p=new child(); //Compile time /static polymorphism 
        p.car();  //inherite parent method here
		p.common(); ////if parent and child both have same method then preference to be given to child method (child method will be executing)--its called method overriding or runtimeplomorphism
        p.child2();//calling method of child own method here
//top cast
        
        Inheritanceconcept parents=new Inheritanceconcept();  //we can access only common method which ae common in both parent and child.
        parents.common(); //we can access only common method which ae common in both parent and child.
        parents.car2(); //we can access parent class method which are not common.
//Note   parents.child1()// we cannot access child class method by parent object
        
        Inheritanceconcept pc=new child(); //child class object can be reffered by parent class reference variable.dynamic/runtime polymorphism,called top casting (so that parent class object can be called

		pc.car();   //only and only parent method or common method can be called by dynamic ploymorphim

      //down cast
		
		child c2=(child) new Inheritanceconcept();  //it will give classcast exception here so down cast not possible
		//parent1.childc();
		// TODO Auto-generated method stub

	}
}





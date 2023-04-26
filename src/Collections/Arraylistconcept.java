package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylistconcept {

	//int a[]=new int [3];//---static array so we cannot insert more than 3 int value so to overcome this we used array list
	//Arraylist is the dynamic array
	//Arraylist is class of List interface
	//1.can store duplicate element
	//2.not sychronized
	//3.maintain in insertion order(like 0,1,2,3,4 etc)
	//4.allow random access to fetch values bcoz it store values in index order
public static void main(String[] args)
{


	ArrayList ar=new ArrayList();  //Non generic  (when array can store any data type)
	ar.add(10);//0 postion
	ar.add(20);//1 position
	ar.add(30);//2 position
	ar.add(12.33);
	ar.add("test");
	ar.add(true);
	System.out.println("arraylist  "  +ar.size());
	System.out.println("arraylist postion second value "  +ar.get(2));
	
//Access value using loop 
	
	for (int i=0;i<ar.size();i++)
	{
		System.out.println("for loop  "  +ar.get(i));
	}
	
	//Generic vs non generic
	ArrayList<Integer> ar1=new ArrayList<Integer>();  //Generic (when array is store only (specified))int data type),before java 1.5 generic were l=not allowed
	ar1.add(200);
	
	ArrayList<String> ar2=new ArrayList<String>();  //Generic (when array is store only String data type)
	ar2.add("Bhawna");
	ar2.add("Gupta");
	
	//Fetch Element from arraylist
	//1. using for each in lamda expression in java8
	System.out.println(" for each in lamda expression in java8  ");
	
	
	ar2.forEach(shows->
	{
		System.out.println(shows);
	});
	
	//2.using iterator
	System.out.println(" using iterator ");
	Iterator<String> str=ar2.iterator();
	while(str.hasNext())
	{
		String str1=str.next();
		System.out.println(str1);
	}
	
	//3 using iterator and java 8 forEachremaining
	System.out.println(" using iterator nd java 8 forEachremaining");
	//str=ar2.iterator();
	str.forEachRemaining(show-> {System.out.println(show);});
	
	//4. using advance for loop
	System.out.println(" using adwance for loop");
	for(String show : ar2)
	{
		System.out.println(show);
	}
	
	//6. using a list iterator in both the direction
	System.out.println(" using ListIterator");
	        ListIterator<String> lstr=ar2.listIterator(ar2.size());
	        while(lstr.hasPrevious())
	        {
	        	String pre=lstr.previous();
	        	System.out.println(pre);
	        }
	
	
	
}

}

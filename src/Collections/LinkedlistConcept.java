package Collections;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistConcept {
	
	
	
	public static void main(String[] args)
	
	{
		// LinkedList is a default class in Java
		  // it can be used as List, Stack, Queue
		  // it allows the null entry
		  // dynamic collection
		  // hence insertion and deletion can be easily implemented
		  // it can contain duplicate elements
		  // it is not synchronized(not thread safe)
		  // in LL, manipulation is fast because we dont need any shifting.
		// LinkedList constructors:

		  // LinkedList();
		  // LinkedList(Collection c);
		LinkedList<String> ls=new LinkedList<String>();
		//Add an elemnet
		ls.add("First");
		ls.add("Second");
		ls.add("Bhawna");
		ls.add("Harshul");
		ls.add("Last");
		System.out.println(ls);
		System.out.println("Size " +ls.size());
		//Add first element
		ls.addFirst("Nishant");
		//Add last element
		ls.addLast("We are all");
		System.out.println("Name " +ls);
		//Get the element
		ls.get(2);
		System.out.println("Get  " +ls.get(2));
		//Set
		ls.set(0,"New");
		System.out.println("Set element "+ls.get(0));
		System.out.println("Name " +ls);
		//remove from first and last
		ls.removeFirst();
		
		ls.removeLast();
		
		//Access element by 
		//for loop
		for (int i=0;i<ls.size();i++)
		{
			System.out.println("For loop "+ls.get(i));
		}
		
		//Using iterator
		//Iterator<String> it=ls.iterator();
		
		//using while loop
		
		int n=0;
		while(ls.size()>n)
		{
			System.out.println("While " +ls.get(n));
			n++;
		}
		
		//using advance for loop
		
		for(String str : ls)
		{
			System.out.println("Advance for loop " +str);
		}
		
		//using lambda and iterator
		System.out.println("using iterator ");
		Iterator<String> istr=ls.iterator();
		while(istr.hasNext())
		{
			String listele=istr.next();
			System.out.println(listele);
		}
		//using listiterator 
		System.out.println("using listiterator ");
		ListIterator<String> listite=ls.listIterator(ls.size());
		while(listite.hasPrevious())
		{
			String liststr=listite.previous();
			System.out.println(liststr);
			
		}
		
		
		//Sorting
		Collections.sort(ls); //sorting on the basis of alphbet
	//	Collections.so(ls);
		System.out.println(ls); 
		
		
		LinkedList<Integer> ls1=new LinkedList<Integer>();
		ls1.add(1);
		ls1.add(300);
		ls1.add(10);
		ls1.add(2);
		ls1.add(-6);
		
		for (int i=0;i<ls1.size();i++)
		{
			System.out.print(+ls1.get(i));
		}
		Collections.sort(ls1); //sorting on the basis of alphbet
		//	Collections.so(ls);
			System.out.println(ls1);
		
	}
	

	
	 

}

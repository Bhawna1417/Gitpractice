package Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Vector_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It's implement List interface
		//it is dynamic in nature
		//Store only object
		//It is synchronized (thread safe)
		//slower
		//present since jdk 1.0
		//support generics
		//its a legacy class of java
		
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(10);
		v1.add(2);
		v1.add(13);
		v1.add(4);
		
		System.out.println(v1);
		
		System.out.println("**************************");	
		Vector<Integer> v2=new Vector<Integer>();
		v2.add(10);
		v2.add(11);
		
		v2.addAll(v1);
		System.out.println(v2);
		
		System.out.println("**************************");	
		//access using loop
		
		for(Integer i:v2)
		{
			System.out.println(i);	
		}
		System.out.println("**************************");	
		//using iterator
		Iterator<Integer> ite =v1.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		//using for loop
		
		System.out.println("**************************");	
		
		for(int i=0;i<=v1.size();i++)
		{
			System.out.println(i);	
		}
		
		//Sorting 
		Collections.sort(v2);
		System.out.println(v2);	
		
		
		}

}

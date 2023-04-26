package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Hashtableconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//not accept duplicate value
		//it is similar to hashmap but Hashtable is synchronized (one thread can access element only)
		//stores a value in key and value 
		//Key--object--hashcode(unique no assigned by JVM)--->value(if 2 objects are same then hashcode would be same for both)
		//hashcode is 32 bit int no.
		Hashtable ht=new Hashtable();
		ht.put(1,"a");
		ht.put(2, "b");
		System.out.println(ht.get(1));
		//create clone copy /shallow copy of hashtable(ht)
        Hashtable ht2=new Hashtable();
		 ht2= (Hashtable)ht.clone();
		 System.out.println(ht);
		 System.out.println(ht2);
		 ht.clear();//if remove a hashtable
		 System.out.println(ht);
		 System.out.println(ht2);
		 
		 //contain method
		 
		 Hashtable ht3=new Hashtable();
			ht3.put("a","Bhawna");
			ht3.put("b", "Harshu");
			ht3.put("b", "Harshu");//contain unique value
			//No null key and null values
			
			ht3.put(null, "Harshu"); //null pointer exception will give
			ht3.put("1", null); //null pointer exception will give
	         System.out.println("Test Duplicate value" +ht3);
	 
			
			if (ht3.contains("a"))
			{
			System.out.println("value found");
			}
			//Print all the value from hashtable by enumartion - element()
			 Enumeration e=ht3.elements();
			 while(e.hasMoreElements())
			 {
			 System.out.println("value all of ht3 "+e.nextElement());
			 }
			 
			//Print all the value from hashtable by entryset
			 
			 Set es=ht3.entrySet();
			 System.out.println("entryset "+es);
			 
			// Check both the hashtable are equal or not
			 if (ht.equals(ht2))
			 
				 System.out.println("both are equal");
			 
			 //get the hashcode of obk=ject
	
	  System.out.println("hashcode value)" +ht3.hashCode() );
	 
	  //generic also can define like
	  Hashtable<Integer,Integer> hashint=new Hashtable<Integer,Integer>();
			 
	  
			 
	}

}

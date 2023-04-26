package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_concept {
	
	//In hashset we cannot add duplicate value if add it will not display in o/p(will be ignored
	//accept null v=key as well

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> hs=new HashSet<String>(); //topcasting and Set is an interface so we cannot create object of Set.
    hs.add("Maths");
    hs.add("english");
    hs.add("Hindi");
    hs.add("Science");
    hs.add("computer");
    System.out.println(hs);
    System.out.println(hs.contains("Hindi"));
    
   System.out.println(hs.remove("english"));
	
   //access element using for loop
   
   for(String str:hs)
   {
	   System.out.println(str);
   }
   
   //access using iteratior
Iterator<String> istr=   hs.iterator();
 while(istr.hasNext())
 {
	 System.out.println(istr.next());
 }
 
 //Union using set
 Set<Integer> hs1=new HashSet<Integer>(); 
 hs1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,}));
 
 Set<Integer>hs2 =new HashSet<Integer>();
 hs2.addAll(Arrays.asList(new Integer[]{3,5,8,9}));
 
 Set<Integer>hs3 =new HashSet<Integer>(hs1);
 hs3.addAll(hs2);
 System.out.println(hs3);
 
 //Intersection using set
 
 Set<Integer>hs4 =new HashSet<Integer>(hs1);
 hs4.retainAll(hs2);
 System.out.println(hs4);
 
 //Difference using set

 
 Set<Integer>hs5 =new HashSet<Integer>(hs1);
 hs5.removeAll(hs2);//(common value will be removed)
 System.out.println(hs5);
	}

}

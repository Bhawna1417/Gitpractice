package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

import Collections.ListConcept.employees;

public class HashmapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashmap is the class implement Map interface
		//Extent AbstratMap
		//it contains only unique element
		//it store value in key - value pair
		//It may have one null key and multiple null values
		//it maintain no order
		//Hashmap is non synchronised (means not (thread safe) multiple thread can access same time hashmap so performance incresed (fast access)
		//drawback -it fail fast(concurrent modification exception)-simultentously thread modifying value by update/delete element
       
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Nishant");
	  hm.put(2, "bhawna");
	  hm.put(3, "Harshul");
	  hm.put(4, "Frient");
	  hm.put(5, "enemy");
	  hm.put( null,null);
	  hm.put( null,null);
	  
	  System.out.println("Hash map " +hm.get(1));
	  
	  System.out.println("Hash map  default " +hm.getOrDefault(1, "aa"));
 for(Entry str:hm.entrySet())  //As it doesnot maintain order so to access all element need to use "entry" here to traverse in hashmap 
 {
	  System.out.println("Using for loop "+str.getKey() +""+ str.getValue());
	  
 }
 hm.remove(4);
 System.out.println(hm);//does not maintain any order 
 
 
 //Calling java object form listconcept question
  HashMap<Integer,employees> emp=new HashMap<Integer,employees>();
  /*employees.e1=new employees("a",10,"Art");
  employees.e2=new employees("b",12,"science");
  
  emp.put(1,e1);
  emp.put(2,e2);*/
  //traverse the hashmap
  for(Entry <Integer,employees> m:emp.entrySet())
  {
  
  int key=m.getKey();
  employees e=m.getValue();
  
  }
  
  

}}

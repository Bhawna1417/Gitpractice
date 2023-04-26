package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> trmap=new TreeMap<Integer,String>();
		trmap.put(10000, "Map");
		trmap.put(2000, "MapA");
		trmap.put(30000, "Mapb");
		trmap.put(40000, "Mapc");
		trmap.put(50000, "Mapd");
		trmap.put(60000, "Mape");
		
		
		System.out.println(trmap);
		System.out.println(trmap.headMap(223232));
		Set<Integer> lessthan30k=trmap.headMap(30000).keySet();
		System.out.println(lessthan30k); //to display keys which are leass than 30000
		Set<Integer> greatethan30k=trmap.tailMap(30000).keySet();  ////to display keys which are greater than 30000
		System.out.println(greatethan30k); 
		
		
		
		TreeMap<String,Integer> trmap1=new TreeMap<String,Integer>();
		trmap1.put("Neha", 100);
		trmap1.put("Santosh", 500);
		trmap1.put("Rekha", 320);
		trmap1.put("Bhawna", 120);
		trmap1.put("Nishant", 400);
		trmap1.put("harshul", 230);
		
		System.out.println(trmap1); 
		
		//Want to s=dispaly in reverse order
		
		TreeMap<String,Integer> trmap2=new TreeMap<>(Comparator.reverseOrder());
		trmap2.put("Neha", 100);
		trmap2.put("Santosh", 500);
		trmap2.put("Rekha", 320);
		trmap2.put("Bhawna", 120);
		System.out.println(trmap2); 
		
		
	}

}

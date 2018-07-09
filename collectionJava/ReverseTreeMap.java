package collectionJava;

import java.util.*;
import java.util.Map.*;


public class ReverseTreeMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> tm = new TreeMap<>(Collections.reverseOrder());
		
	    tm.put(1, "One");
	    tm.put(2, "Two");
	    tm.put(3, "Three");
	    
	    System.out.println("Demonstration of the Map/TreeMap:");
	    
	    Set<Entry<Integer, String>> set = tm.entrySet();
	    
	    for(Map.Entry<Integer, String> o : set)
	        System.out.println(o.getKey() + ": " + o.getValue());
	    System.out.println(tm);
		
	}
}
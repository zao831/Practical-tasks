package collectionJava;

import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 242
 * Creating a set from the list and its methods
 */

public class DemoTreeSet {
	
	public static void main(String[] args) {
		
		ArrayList<String> c = new ArrayList<>();
		
		@SuppressWarnings("unused")
		boolean b;
		
		for (int i = 0; i < 6; i++)
			c.add((int) (Math.random() * 71) + "Y ");
		System.out.println(c + " list");
		
		TreeSet<String> set = new TreeSet<>(c);
		
		System.out.println(set + " set");
		
		b = set.add("5 Element"); // adding (b = true)
		b = set.add("5 Element"); // adding (b = false)
		
		// After added
		System.out.println(set + " add");
		System.out.println(set.comparator()); // null!
		
		// Extraction of the largest and smallest elements
		System.out.println(set.last() + " " + set.first());
	}
}
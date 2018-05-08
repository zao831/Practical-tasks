package collectionJava;

import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 236
 * Replace, delete, and search for items
 */

public class DemoListMethods {

	public static void main(String[] args) {

		ArrayList<Character> a = new ArrayList<>(5);

		System.out.println("Collection is empty: " + a.isEmpty());

		for (char c = 'a'; c < 'h'; c++) {
			a.add(c);
		}
		System.out.print("Initial collection: ");
		System.out.println(a);

		System.out.print("Changed collection: ");
		char ch = 'a';
		a.add(6, ch);
		System.out.println(a);

		ListIterator<Character> it; // parameterization is mandatory
		
		it = a.listIterator(2); // extracting list iterator to position
		
		System.out.println("Adding element in the position " + it.nextIndex());

		it.add('X'); // adding an element without replacement to the iterator position
		System.out.println(a);

		// Compare methods
		int index = a.lastIndexOf(ch); // a.indexOf(ch);
//		System.out.println("Last index number: " + index);
		
		a.set(index, 'W'); // replacing an element without an iterator
		System.out.println(a + " after replace element");
		
		if (a.contains(ch)) {
			a.remove(a.indexOf(ch));
		}
		System.out.println(a + " remove element " + ch);

	}
}
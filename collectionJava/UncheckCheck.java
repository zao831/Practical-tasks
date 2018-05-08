package collectionJava;

import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 235
 * Invalid collection
 * When creating a collection, you must specify its type, 
 * otherwise you can add any type of element. This can lead to an error.
 */

public class UncheckCheck {

	public static void main(String[] args) {

		// Create collection
		ArrayList<Object> list = new ArrayList<>();

		// Adding items
		list.add(71);
		list.add(new Boolean("TruE"));
		list.add("Java 1.6.0");

		// Need to conversion of types
		int i = (Integer) list.get(0);
		boolean b = (Boolean) list.get(1);
		String str = (String) list.get(2);

		System.out.println("list [" + i + ", " + b + ", " + str + "]\n");

		for (Object ob : list) {
			System.out.println("List " + ob);
		}
		System.out.println();

		// Creating a parameterized collection
		ArrayList<Integer> s = new ArrayList<>();

		s.add(71);
		s.add(92);
		// s.add("101"); // Error! Only Integer type!

		for (Integer ob : s) {
			System.out.println("int " + ob);
		}
	}
}
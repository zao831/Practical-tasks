package collectionJava;

import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 234
 * Creating a parameterized collection
 */

public class DemoGeneric {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Java");
		list.add("Fortress");

		String res = list.get(0);
		System.out.println(res);
		
		for (String string : list) {
			System.out.print(string + " ");
		}

		System.out.println("\n" + list);

	}
}
package collectionJava;

import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 238
 * Adding and delete items
 */

public class DemoLinkedList {

	public static void main(String[] args) {

		LinkedList<Number> a = new LinkedList<>();

		for (int i = 10; i <= 15; i++)
			a.add(i);

		for (int i = 16; i <= 20; i++)
			a.add(new Float(i));

		ListIterator<Number> list = a.listIterator(10);

		System.out.println(list.nextIndex() + "-st index");

		list.next(); // Important!

		System.out.println(list.nextIndex() + "-st index");

		list.remove(); // Deleting element with current index

		while (list.hasPrevious())
			System.out.print(list.previous() + " "); // displaying elements in the reverse order

		// Demonstration the job of methods
		a.removeFirst();
		a.offer(71); // adding element in the end of the list
		a.poll(); // removing a null element from the list
		a.remove(); // removing a null element from the list
		a.remove(1); // removing a first element from the list
		System.out.println("\n" + a);

		Queue<Number> q = a; // list to queue

		for (Number i : q)
			System.out.print(i + " ");
		System.out.println("; size = " + q.size());

		// Deleting five elements
		for (int i = 0; i < 5; i++) {
			q.poll();
		}
		for (Number i : q) {
			System.out.print(i + " ");
		}
		System.out.println("; size = " + q.size());

	}
}
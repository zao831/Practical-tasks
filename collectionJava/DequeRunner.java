package collectionJava;

import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 241
 * Demonstration of Deque
 */

public class DequeRunner {

	public static void printDeque(Deque<?> d) {
		for (Object de : d)
			System.out.println(de + "; ");
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<>();

		deque.add(new String("5"));		
		deque.addFirst("A");

		System.out.println(deque.peek());
		System.out.println("Before:");
		printDeque(deque);
		deque.pollFirst();
		System.out.println(deque.remove(5));
		System.out.println("After:");
		printDeque(deque);

	}
}
package collectionJava;

import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 236
 * Fill the list with pseudo-random numbers, 
 * count the number of positive by using the iterator, 
 * and delete non-positive values from the list
 */

public class DemoIterator {

	public static void main(String[] args) {

		// Creating ArrayList collection
		ArrayList<Double> c = new ArrayList<>(7);

		// Create pseudo-random numbers
		for (int i = 0; i < 10; i++) {
			double z = new Random().nextGaussian();

			// Add the received numbers to the collection
			c.add(z);
		}

		// Show collection
		for (Double d : c) {
			System.out.printf("%.2f ", d);
		}
		
		int positiveNum = 0;
		int size = c.size(); // determine the size of the collection

		// Extracting an iterator
		Iterator<Double> it = c.iterator();

		// Checking the existence of the next element
		while (it.hasNext()) {

			// Extracting the current item and go to the next one
			if (it.next() > 0)
				positiveNum++;
			else
				it.remove(); // Delete non-positive values from the list
		}

		System.out.printf("%nNumber of positive: %d ", positiveNum);
		System.out.printf("\nNumber of non-positive: %d ", size - positiveNum);
		System.out.print("\nPositive collection ");
		for (Double d : c) {
			System.out.printf("%.2f ", d);
		}
	}
}
package collectionJava;

import java.io.*;
import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 242
 * Use the set to output all unique words from a file
 */

public class DemoHashSet {

	public static void main(String[] args) {

		HashSet<String> words = new HashSet<>(100);

		// Use collection LinkedHashSet or TreeSet
		long callTime = System.nanoTime();

		// Create a file pushkin.txt
		
		try {
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(new FileReader("C:\\pushkin.txt"));
			
			String line = "";
			while ((line = in.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, " (){}[]<>#*!?.,:;-\'\"/");
				while (tokenizer.hasMoreTokens()) {
					String word = tokenizer.nextToken();
					words.add(word.toLowerCase());
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		Iterator<String> it = words.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		long totalTime = System.nanoTime() - callTime;
		System.out.println("\ndifferent words: " + words.size() + ", " + totalTime + " nanosec");
	}
}
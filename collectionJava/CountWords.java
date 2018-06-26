package collectionJava;

import java.util.*;

/**
 * The task: Create an array with a set of words (10-20 words, should be
 * repeated). Find and display a list of unique words that make up an array (do
 * not count duplicates). Count how many times each word occurs.
 * 
 * @author Anton Baker
 * @date Tuesday, 2017-09-05
 */

public class CountWords {

	public static void main(String[] args) {

		Map<String, Integer> hm = new TreeMap<>();

		String text = "if you really want to learn, and you want to learn more quickly and deeply, pay attention to how you pay attention. Think about how you think. Learn how you learn.";

		String[] words = text.toLowerCase().split("[ {,|.}?]+");

		for (String word : words) {
			hm.put(word, ((hm.get(word) == null) ? 1 : hm.get(word) + 1));
		}

		System.out.println("Counting words:\n" + hm);
		System.out.println("\nThe phrase has " + words.length + " words and " + hm.size() + " unique words.");
	}
}
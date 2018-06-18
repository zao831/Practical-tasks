package collectionJava;

import java.util.*;

public class DemoHashMapCountries {
	
	public static void main(String[] args) {
		
		Map<String, String> countries = new HashMap<>();
		
		countries.put("Moskow", "Russia");
		countries.put("Smolensk", "Russia");
		countries.put("Rostov", "Russia");
		countries.put("Paris", "France");
		countries.put("Berlin", "Germany");
		countries.put("Oslo", "Norway");
		
		Set<Map.Entry<String, String>> set = countries.entrySet();
		
		System.out.println(countries);
		
		System.out.println("\nThe cities of Russia: ");
		for (Map.Entry<String, String> entry : set) {
			if(entry.getValue().equals("Russia"))
				System.out.print(entry.getKey() + ", ");
		}
	}
}

package collectionJava;

import java.util.*;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 240
 * Author sort list
 */

public class UniqSortMark {

	public static void main(String[] args) {

		ArrayList<Student> p = new ArrayList<>();

		p.add(new Student(3.9f, 52201));
		p.add(new Student(3.65f, 52214));
		p.add(new Student(3.71f, 52251));
		p.add(new Student(3.02f, 52277));
		p.add(new Student(3.81f, 52292));
		p.add(new Student(9.55f, 52271));

		// Sort object list
		try {
			Collections.sort(p, Student.class.newInstance());
		} catch (InstantiationException e1) {
			// Can not create class object
			e1.printStackTrace();
		} catch (IllegalAccessException e2) {
			e2.printStackTrace();
		}

		for (Student ob : p) {
			System.out.printf("%.2f ", ob.getMark());
			/*
			 * The textbook indicates the output: 9,55 3,90 3,81 3,71 3,65 3,02 
			 * In this example, the output: 9,55 3,90 3,65 3,71 3,02 3,81 
			 * Where error?
			 */
		}
	}
}
package collectionJava;

import java.util.Comparator;

/*
 * I.N. Blinov V.S. Romanchik
 * Java. Industrial programming
 * Page 239
 * Author sort list
 * Executable UniqSortMark.java
 */

public class Student implements Comparator<Student> {

	private int idStudent;
	private float meanMark;

	public Student(float m, int id) {
		meanMark = m;
		idStudent = id;
	}

	public Student() {
	}

	public float getMark() {
		return meanMark;
	}

	public int getIdStudent() {
		return idStudent;
	}

	// Rule of sort
	@Override
	public int compare(Student one, Student two) {
		return (int) (Math.ceil(two.getMark() - one.getMark()));
	}
}
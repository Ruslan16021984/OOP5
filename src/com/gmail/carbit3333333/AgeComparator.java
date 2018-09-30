package com.gmail.carbit3333333;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		if (a.getAge() > b.getAge())
			return 1;
		else if (a.getAge() < b.getAge())
			return -1;
		else
			return 0;
	}

}

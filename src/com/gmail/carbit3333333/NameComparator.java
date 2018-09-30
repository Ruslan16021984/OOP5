package com.gmail.carbit3333333;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int value =0;
		value= o1.getName().compareTo(o2.getName());
		return value;
	}

}

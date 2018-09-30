package com.gmail.carbit3333333;

import java.util.Comparator;

public class HighScoolComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getHightScool().compareTo(o2.getHightScool());
	}
	
}

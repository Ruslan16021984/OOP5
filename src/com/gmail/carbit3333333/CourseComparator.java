package com.gmail.carbit3333333;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCours().compareTo(o2.getCours());
	}

}

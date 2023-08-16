package com.sortinglogic;

import java.util.Comparator;

import com.jspiders.Student;

public class SortStudentByName implements Comparator <Student> {
	
	public int compare(Student x,Student y) {
		return x.getName().compareTo(y.getName());
	}

}

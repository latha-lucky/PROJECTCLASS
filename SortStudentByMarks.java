package com.sortinglogic;

import java.util.Comparator;

import com.jspiders.Student;

public class SortStudentByMarks implements Comparator <Student> {
	
	public int compare(Student x,Student y) {
		return x.getMarks() - y.getMarks();
	}

}

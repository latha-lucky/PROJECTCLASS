package com.sortinglogic;

import java.util.Comparator;

import com.jspiders.Employee;

public class SortEmployeeById implements Comparator <Employee> {
	
	public int compare(Employee x,Employee y) {
		return x.getId().compareTo(y.getId());
	}

}

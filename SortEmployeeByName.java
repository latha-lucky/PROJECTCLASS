package com.sortinglogic;

import java.util.Comparator;

import com.jspiders.Employee;

public class SortEmployeeByName implements Comparator <Employee> {
	
	public int compare(Employee x,Employee y) {
		return x.getName().compareTo(y.getName());
	}

}

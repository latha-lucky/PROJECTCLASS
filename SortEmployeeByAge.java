package com.sortinglogic;

import java.util.Comparator;

import com.jspiders.Employee;

public class SortEmployeeByAge implements Comparator<Employee> {
	
	public int compare(Employee x,Employee y) {
		return x.getAge()-y.getAge();
	}

}

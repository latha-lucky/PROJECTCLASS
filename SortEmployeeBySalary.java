package com.sortinglogic;

import java.util.Comparator;

import com.jspiders.Employee;

public class SortEmployeeBySalary implements Comparator <Employee>{
	
	public int compare(Employee x,Employee y) {
		return x.getSalary()-y.getSalary();
	}

}

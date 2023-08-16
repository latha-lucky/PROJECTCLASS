package com.example;

public class Employee {
	String id;//0-> 102
	String name;// null->alex
	static int count=101;//103
	
	Employee(String name){
		 this.id="JSP"+count;
		 this.name=name;
		 count++;
	 }
	 public static void main(String[] args) {
		 Employee e1=new Employee("Alex");
		 System.out.println("Emp Id of"+e1.name+"is"+e1.id);
		 
		 
		 Employee e2=new Employee("John");
		 System.out.println("Emp Id of"+e2.name+"is"+e2.id);
		 
		 Employee e3=new Employee("Jack");
		 System.out.println("Emp Id of"+e3.name+"is"+e3.id);
	}
	 

}

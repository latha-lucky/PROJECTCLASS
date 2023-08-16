package com.jspiders;

public class Student {
	
	private String id;
	private String name;
	private int age;
	private int marks;
	
	static int count =101;
	public Student(String name,int age,int marks) {
		this.id="JSP"+count;
		this.name=name;
		this.age=age;
		this. marks=marks;
		count++;
	}
	// getters methods
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	//setters methods
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMarks(int marks) {
		this.marks=marks;
		
	}
	
	//toString()
	
	public String toString() {
		return "Id:"+id+" Age:"+age+" Marks:"+marks+" Name:"+name;
	}
	

}

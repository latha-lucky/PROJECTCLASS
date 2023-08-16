package com.jspiders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.customexpection.StudentNotFoundException;
import com.sortinglogic.SortStudentByAge;
import com.sortinglogic.SortStudentById;
import com.sortinglogic.SortStudentByMarks;
import com.sortinglogic.SortStudentByName;

public class StudentManagementSystemImpl implements StudentManagementSystem {


	Map<String,Student>db=new LinkedHashMap<String,Student>();
	Scanner scan=new Scanner(System.in);
	@Override
	public void addStudent() {
		//Accept name,age&marks,create a Student instance
		System.out.println("enter the name");
		String name=scan.next();
		System.out.println("enter the age");
		int age=scan.nextInt();
		System.out.println("enter the marks");
		int marks=scan.nextInt();

		Student s=new Student(name,age,marks);

		db.put(s.getId(), s);
		System.out.println("Student Record Inserted Successfully");
		System.out.println("Your Student Id is"+s.getId());



	}

	@Override
	public void displayStudent() {
		//Accept Id->String
		//toUpperCase()
		//containsKey()
		//get the Student Object->get(id)->get(key)
		//getter methods
		//else->invoke an Exception->SNFE->Handle
		
		System.out.println("enter Student Id:");
		String id=scan.next();//lowercase or uppercase
		id=id.toUpperCase();
		
		if(db.containsKey(id)) {//JSP101==jsp101
			Student std=db.get(id);//db.get(key);->key->id
			System.out.println("Id: "+std.getId());
			System.out.println("Name: "+std.getName());
			System.out.println("Age: "+std.getAge());
			System.out.println("Marks:"+std.getMarks());
		}
		else {
			try {
				throw new StudentNotFoundException("Student Record Not Found!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		

	}




@Override
public void displayAllStudents() {
	Set<String>keys=db.keySet();// JSP101 JSP102 JSP103
	System.out.println("Students records as as Follows ");
	System.out.println("---------------");
	if(db.size()!=0) {

	for(String key:keys) {//key-> id
		System.out.println(key+" "+db.get(key));//printing refrenace var->value
	}
	}
	else {
		try {
		throw new StudentNotFoundException("No Student Records Found!");//invoke an exception
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	}

	@Override
	public void removeStudent() {
		//Accept Id
		// convert to upper case
		//contianskey
		// remove id->remove(key)//else->SNFE
		
		System.out.println("enter Student id");
		String id=scan.next();
		id=id.toLowerCase();
		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("Student Record Deleted Successufully");
			
		}
		else {
			try {
				throw new StudentNotFoundException("No Student Records Found!");//invoke an exception
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}

			
		}


	

	@Override
	public void removeAllStudents() {
		System.out.println("Total Number of students records: "+db.size());
		db.clear();
		System.out.println("All student Records deleted Successfully");


	}

	@Override
	public void updateStudent() {
		//Accept Id,Uppercase,check id is present ,get the student Object
		//Invoke SNFE if id not present
		//switch case->1.update name,2.update age,3.update marks
		//Invalid Chioce->Invoke an Exception
		
		System.out.println("enter Student  id");
		String id=scan.next();
		id=id.toUpperCase();
		if(db.containsKey(id)) {
			 Student std=db.get(id);
			 
			 System.out.println("1:Update Name\n2:Update Age\n3:Update marks");
			 System.out.println("enter chioce");
			 int chioce=scan.nextInt();
			 switch(chioce) {
			 case 1:
				 System.out.println("enter name");
				 String name=scan.next();
				 std.setName(name);//std.setName(scan.next());
				 System.out.println("Student name updated Successfully");
				break;
			 case 2:
				 System.out.println("enter age");
				 int age=scan.nextInt();
				 std.setAge(age);
				 System.out.println("Student age upadated Successfully");
				 break;
			 case 3:
				 System.out.println("enter marks");
				 int marks=scan.nextInt();
				 std.setMarks(marks);
				 System.out.println("Student marks updated Successfully");
				 break;
				 default:
					 try {
							throw new InvalidChoiceException("Invalid Chioce,enter valid chioce");
						}
						catch(Exception e) {
							System.out.println(e.getMessage());
						}

					}
			
		}
		else {
			try {
				throw new StudentNotFoundException("No Student Records Found!");//invoke an exception
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}

			
		}

			
		
	

	@Override
	public void countStudents() {
		System.out.println("Total Number of Students:"+db.size());
		
		


	}

	@Override
	public void sortStudents() {
		Set<String> keys=db.keySet();
		List<Student>list=new ArrayList<Student>();
		for(String key:keys) {
			list.add(db.get(key));
	
		}
		System.out.println("1:Sort By Id\n2:Sort By Name\n3:Sort By Age\n4:Sort By Marks\n:Enter chioce");
		int ch=scan.nextInt();
		switch(ch) {
		case 1:
			Collections.sort(list,new SortStudentById());
			display(list);
			break;
		case 2:
			Collections.sort(list,new SortStudentByName());
			display(list);
			break;
		case 3:
			Collections.sort(list,new SortStudentByAge());
			display(list);
			break;
		case 4:
			Collections.sort(list,new SortStudentByMarks());
			display(list);
			break;
			default:
				try {
					throw new InvalidChoiceException("Invalid Chioce,enter valid chioce");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}
				
			
	}

	private static void display(List<Student>list) {
		for(Student s:list) {
			System.out.println(s);
		}
	}


	}




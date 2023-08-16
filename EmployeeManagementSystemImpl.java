package com.jspiders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.customexception.EmployeeNotFoundException;

import com.sortinglogic.SortEmployeeByAge;
import com.sortinglogic.SortEmployeeById;
import com.sortinglogic.SortEmployeeByName;
import com.sortinglogic.SortEmployeeBySalary;




public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
	
	Map<String,Employee>db=new LinkedHashMap<String,Employee>();
    Scanner scan=new Scanner(System.in);
	@Override
	public void addEmployee() {
		System.out.println("enter name");
		String name=scan.next();
		System.out.println("enter age");
		int age=scan.nextInt();
		System.out.println("enter salary");
		int salary=scan.nextInt();
		
		Employee e=new Employee(name,age,salary);

		db.put(e.getId(), e);
		System.out.println("Employee  Record Inserted Successfully");
		System.out.println("Your Employee Id is"+e.getId());

		
	}

	@Override
	public void displayEmployee() {
		System.out.println("enter Employee Id:");
		String id=scan.next();//lowercase or uppercase
		id=id.toUpperCase();
		
		if(db.containsKey(id)) {//JSP101==jsp101
			Employee  emp=db.get(id);//db.get(key);->key->id
			System.out.println("Id: "+emp.getId());
			System.out.println("Name: "+emp.getName());
			System.out.println("Age: "+emp.getAge());
			System.out.println("Marks:"+emp.getSalary());
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee  Record Not Found!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		

	}
		
	

	@Override
	public void displayAllEmployees() {
		// TODO Auto-generated method stub
		Set<String>keys=db.keySet();// JSP101 JSP102 JSP103
		System.out.println("Employee records as as Follows ");
		System.out.println("---------------");
		if(db.size()!=0) {

		for(String key:keys) {//key-> id
			System.out.println(key+" "+db.get(key));//printing refrenace var->value
		}
		}
		else {
			System.out.println("No Employee Records Found!");//invoke an exception
		}
	}

	@Override
	public void removeEmployee() {
		System.out.println("enter Employee  id");
		String id=scan.next();
		id=id.toLowerCase();
		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("Employee  Record Deleted Successufully");
			
		}
		else {
			try {
				throw new EmployeeNotFoundException("No Student Records Found!");//invoke an exception
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		
	}

	@Override
	public void removeAllEmployee() {
		
		System.out.println("Total Number of Employee records: "+db.size());
		db.clear();
		System.out.println("All Employee  Records deleted Susccessfully");
	
	
		
	}

	@Override
	public void updateEmployee() {
		//Accept Id,Uppercase,check id is present ,get the student Object
				//Invoke SNFE if id not present
				//switch case->1.update name,2.update age,3.update marks
				//Invalid Chioce->Invoke an Exception
				
				System.out.println("enter Employee  id");
				String id=scan.next();
				id=id.toUpperCase();
				if(db.containsKey(id)) {
					 Employee emp=db.get(id);
					 
					 System.out.println("1:Update Name\n2:Update Age\n3:Update salary");
					 System.out.println("enter chioce");
					 int chioce=scan.nextInt();
					 switch(chioce) {
					 case 1:
						 System.out.println("enter name");
						 String name=scan.next();
						 emp.setName(name);//emp.setName(scan.next());
						 System.out.println("employee name updated Successfully");
						break;
					 case 2:
						 System.out.println("enter age");
						 int age=scan.nextInt();
						 emp.setAge(age);
						 System.out.println("employee age upadated Successfully");
						 break;
					 case 3:
						 System.out.println("enter salary");
						 int salary=scan.nextInt();
						 emp.setSalary(salary);
						 System.out.println("Employee salary updated Successfully");
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
						throw new EmployeeNotFoundException("No Employee Records Found!");//invoke an exception
					}
						catch(Exception e) {
							System.out.println(e.getMessage());
						}
				}
	
	}

		


	@Override
	public void countEmployees() {
		// TODO Auto-generated method stub
		System.out.println("Total Number of Students:"+db.size());
		
		
	}

	@Override
	public void sortEmployees() {
		Set<String> keys=db.keySet();
		List<Employee>list=new ArrayList<Employee>();
		for(String key:keys) {
			list.add(db.get(key));
	
		}
		System.out.println("1:Sort By Id\n2:Sort By Name\n3:Sort By Age\n4:Sort By Salary\n:Enter chioce");
		int ch=scan.nextInt();
		switch(ch) {
		case 1:
			Collections.sort(list,new SortEmployeeById());
			display(list);
			break;
		case 2:
			Collections.sort(list,new SortEmployeeByName());
			display(list);
			break;
		case 3:
			Collections.sort(list,new SortEmployeeByAge());
			display(list);
			break;
		case 4:
			Collections.sort(list,new SortEmployeeBySalary());
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

	private static void display(List<Employee>list) {
		for(Employee e:list) {
			System.out.println(e);

		
	}
}
}


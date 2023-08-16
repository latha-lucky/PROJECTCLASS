package jspiders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		while(true) {
		Scanner scan=new Scanner(System.in);
		
		Employee e1=new Employee("tom",4000.0);
		Employee e2=new Employee("baby",6000.0);
		Employee e3=new Employee("latha",7000.0);
		
		Map<String,Employee> map=new LinkedHashMap<String,Employee>();
		
		map.put(e1.getName(), e1);
		map.put(e2.getName(), e2);
		map.put(e3.getName(), e3);
		//Converting Map into a Set of Keys
		Set<String>keys=map.keySet();// Tom,Baby,Latha
		
		 // Creating ana instance of Arraylist
		List<Employee>l=new ArrayList();
		//Adding all the values->Employee objects from Map(LHM) into List(AL)
		for(String key:keys) {
			l.add(map.get(key));
			
			
		}
		//Traversing all the employee objects from Arraylist 
		for(Employee emp:l) {
			System.out.println(emp);
		}
		
		
		//Manual way of adding all the value->Employee objects from Map(LHM) into List(AL)
		//l.add(map.get("tom"));//l.add(e1);
		//l.add(map.get("baby"));//l.add(e2)
		//l.add(map.get("latha"));//l.add(e3)
		
System.out.println("=========================");



System.out.println("1:Sort By Name\n2:SortById\n3:Exit");
System.out.println("enter your chioce");
 int ch=scan.nextInt();
 switch(ch) {
 case 1:
     Collections.sort(l,new SortEmployeeByName());
     for(Employee emp:l) {
    	 System.out.println(emp);
     }
     break;
 case 2:
	 Collections.sort(l,new SortEmployeeBySalary());
     for(Employee emp:l) {
    	 System.out.println(emp);
     }
     break;
 case 3:
	 System.out.println("thank you");
	 System.exit(0);
     default:
    	 try {
    		 throw new InvalidChioceException("Invalid Chioce");
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
 }
		
	}


}
}

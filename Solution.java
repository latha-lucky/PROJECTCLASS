package com.jspiders;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//Menu Driven Program
		//upcasting
		Scanner scan=new Scanner(System.in);
		StudentManagementSystem sm=new StudentManagementSystemImpl();
		System.out.println("WELCONE TO STUDENT DATABASE PROJECT");
		System.out.println("-----------------------------------");

		

		while(true) {
			System.out.println("1:addStudent\n2:displayStudent\n3:dispalyAllStudents");
			System.out.println("4:removeStudent\n5:removeAllStudent\n6:updateStudent");
			System.out.println("7:countStudent\n8:sortStudent\n9:Exit");

			System.out.println("enter the chioce");
			int chioce=scan.nextInt();
			switch(chioce) {
			case 1:
				sm.addStudent();
				break;
			case 2:
				sm.displayStudent();
				break;
			case 3:
				sm.displayAllStudents();
				break;
			case 4:
				sm.removeStudent();
				break;
			case 5:
				sm.removeAllStudents();
				break;
			case 6:
				sm.updateStudent();
				break;
			case 7:
				sm.countStudents();
				break;
			case 8:
				sm.sortStudents();
				break;
			case 9:
				System.out.println("Thank you");
				System.exit(0);

			default:
				try {
					throw new InvalidChoiceException("Invalid Chioce,enter valid chioce");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}
			System.out.println("--------------------------");


		}
	}



		}
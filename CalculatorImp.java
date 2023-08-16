package com;

public class CalculatorImp implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		//int sum=a+b;
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		//int sub=a-b;
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		//int mul=a*b;
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		//int div=a/b;
		if(b!=0) {
			return a/b;
			
		}
		else {
			return 0;
		}
	}

	@Override
	public String displayErrorMessage() {
		// TODO Auto-generated method stub
		return "Invalid Choice,Please Enter Valid Choice!";
	}
	
		 
		 
	 }



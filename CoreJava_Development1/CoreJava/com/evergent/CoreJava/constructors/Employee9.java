package com.evergent.CoreJava.constructors;

class Employee9
{
	int eno;
	String ename;
	double sal;
	
	Employee9() {
		System.out.println("Default Constructor");
	}
	
	
	Employee9(int eno, String ename, double sal) {
		this.ename = ename;
		this.sal = sal;
	}
	
	public void display() {
		System.out.println("Employee Name :" + ename);
		System.out.println("Employee Salary :" + sal);
	}
	
	public static void main(String[] args) {
		new Employee9();
		Employee9 emp6 = new Employee9(123, "Raj", 55000);
		emp6.display();
	}
}







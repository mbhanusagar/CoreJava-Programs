package com.evergent.CoreJava.constructors;

public class Employee5 {
	int eno;
	String ename;
	double sal;
	public Employee5(int eno) {
		this.eno=eno;}
	public Employee5(int eno,String ename,double sal) {
		this(eno);
		this .ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 e=new Employee5(123,"M Bhanu",6000000);
		e.display();
		

	}

}

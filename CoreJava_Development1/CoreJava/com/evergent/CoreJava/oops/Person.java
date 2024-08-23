package com.evergent.CoreJava.oops;

public class Person {
	int age=20;
	String name="M Bhanu";
	String address="Hyd";
	public void display() {
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
	public static void main(String args[]) {
		Person p=new Person();
		p.display();
	}

}

package com.evergent.CoreJava.constructors;

public class ParameterisedCons {

	public ParameterisedCons() {
		System.out.println("DefaultConstructor");
	}
	public ParameterisedCons(int a,int b) {
		System.out.println("addition "+(a+b));
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	new ParameterisedCons();
	new ParameterisedCons(5,4);

}

}

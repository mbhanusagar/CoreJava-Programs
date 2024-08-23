package com.evergent.CoreJava.oops;

public class MyClass extends Calculation{
	public void show() {
		System.out.println("show method child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc=new MyClass();
		mc.show();
		mc.add();

	}

}

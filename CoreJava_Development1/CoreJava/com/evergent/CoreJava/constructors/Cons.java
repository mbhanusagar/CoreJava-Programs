package com.evergent.CoreJava.constructors;

public class Cons {

	public Cons() {
		System.out.println("DefaultConstructor");
	}
	public Cons(int a,int b) {
		System.out.println("addition "+(a+b));
	}
	public void display(int a,int b) {
		System.out.println(a+b);
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	new Cons();
	new Cons(5,4);
	Cons c=new Cons();
	c.display(1, 3);

}

}

package com.evergent.CoreJava.Static;

// Static methods can not access non-static methods & non-Static variables
public class StaticDemo3 {
	static String cname="India";
	String name="Ravi";
	static public void mydata(){
		//Cannot make a static reference to the non-static method myshow() from the type StaticDemo3
		//myshow();
		System.out.println("MyData Name :"+cname);
	}
	public void myshow() {
		System.out.println("My Name:"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		mydata();		
	}
}

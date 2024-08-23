package com.evergent.CoreJava.Static;

//non-Static methods can access static methods & Static variables
public class StaticDemo4 {
	static String cname="India";
	String name="Ravi";
	static public void mydata(){
		System.out.println("MyData Static Method");
	}
	public void myshow() {
		mydata();
		System.out.println("Myshow is non-Static method :"+cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mydata();	
		StaticDemo4 s = new StaticDemo4();
		s.myshow();
		
	}
}

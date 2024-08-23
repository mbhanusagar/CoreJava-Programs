package com.evergent.CoreJava.Static;
//static methods can access static methods and static variables
public class StaticDemo2 {
	static String cname="India";
	static public void mydata(){
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		mydata();		
	}
}

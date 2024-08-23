package com.evergent.CoreJava.Static;

//Static block
public class StaticDemo5 {
	static String cname="India";
	static {
		System.out.println("Static block: open db/Network Condition");
	}
	static public void mydata(){
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo5.cname);
		StaticDemo5.mydata();
	}
}
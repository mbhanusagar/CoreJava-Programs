package com.evergent.CoreJava.Static;
//1.static is a Keyword.
//2.We can declare static as Methods & Variables.
//3.We can access directly  through Classname. Method name and Classname.Variablename.
public class StaticDemo1 {
	static String cname="India";
	static public void mydata(){
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo1.cname);
		StaticDemo1.mydata();
	}
}

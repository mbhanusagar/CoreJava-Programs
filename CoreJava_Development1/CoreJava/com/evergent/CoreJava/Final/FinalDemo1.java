package com.evergent.CoreJava.Final;

//final variable can not be modify
public class FinalDemo1 {
	final String cname="India";
	public void display() {
		//The final field FinalDemo1.cname cannot be assigned
		//cname="Welcome";
		System.out.println(cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo1 f=new FinalDemo1();
		f.display();
	}
}

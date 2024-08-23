package com.evergent.CoreJava.Final;
//final Methods can not be Override
class Myclass1{
	final public void myProducts(){
		System.out.println("All Products");
	}
}
public class FinalDemo2 extends Myclass1 {
	final String cname="India";
	//Cannot override the final method from Myclass
	final public void myProducts1(){
		System.out.println("All Products");
	}
	public void display() {
		//The final field FinalDemo1.cname cannot be assigned
		//cname="Welcome";
		System.out.println(cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 f=new FinalDemo2();
		f.display();
		f.myProducts();
	}
}














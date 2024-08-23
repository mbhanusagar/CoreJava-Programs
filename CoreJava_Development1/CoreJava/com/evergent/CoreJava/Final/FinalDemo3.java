package com.evergent.CoreJava.Final;

//final Methods can not be Override
public class FinalDemo3 extends Myclass1 {
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
		FinalDemo3 f=new FinalDemo3();
		f.display();
		f.myProducts();
	}
}

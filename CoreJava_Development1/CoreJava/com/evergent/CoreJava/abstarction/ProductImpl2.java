package com.evergent.CoreJava.abstarction;

public class ProductImpl2 extends Product{
	public void newProduct() {
		System.out.println("My new Product");
	}
	public void show() {
		System.out.println("Local Method");
	}
	public static void main(String args[]) {
		Product p1=new ProductImpl2();
		p1.newProduct();
		// p1.show();
		p1.allProducts();
	}

}

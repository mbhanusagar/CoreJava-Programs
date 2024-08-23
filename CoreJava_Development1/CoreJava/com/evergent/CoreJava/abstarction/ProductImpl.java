package com.evergent.CoreJava.abstarction;

public class ProductImpl extends Product{
	public void newProduct() {
		System.out.println("My new Product");
	}
	public void show() {
		System.out.println("Local Method");
	}
	public static void main(String args[]) {
		ProductImpl p1=new ProductImpl();
		p1.newProduct();
		p1.show();
		p1.allProducts();
	}

}

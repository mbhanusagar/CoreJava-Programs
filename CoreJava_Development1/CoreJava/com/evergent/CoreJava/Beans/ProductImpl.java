package com.evergent.CoreJava.Beans;

public class ProductImpl {
		public static void main(String[] args) {
			Product product =new Product();
			product.setPno(692);
			product.setpName("lenovo");
			product.setPrice(80000);
			
			System.out.println("product No :"+product.getPno());
			System.out.println(product.getpName());
			System.out.println(product.getPrice());
}}

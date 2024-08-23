package com.evergent.CoreJava.ExceptionHandling;

class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello : "+message);
	}
}
public class ProductImp {
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno>100)
			throw new ProductNotFoundException("There is no product");
		else {
			System.out.println("products are there");
		}
	}
		public static void main(String[] args) {
			try {
				ProductImp product1 = new ProductImp();
				product1.myData();
			}
			catch(ProductNotFoundException e){
				System.out.println(e);
			}
			// TODO Auto-generated method stub
		
	}
}



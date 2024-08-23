package com.evergent.CoreJava.ExceptionHandling;
//Finally is block if exception hierarchical
public class ExceptionDemo8throws2 {

	 String name=null;
	 int k=0;
		public void myData() throws NullPointerException {
				
				System.out.println("ONE");
				System.out.println(name.length());
				int k=10/0;
				System.out.println("END");
			}
		public void myChange() throws NullPointerException {
			try {
				myData();
				System.out.println("MY Change method");
			} 
			 catch (Exception e) {
			// TODO: handle exception
			System.out.print("I can handl: "+e);
		}}
			public static void main(String[] args) {
				
				ExceptionDemo8throws2 ex1=new ExceptionDemo8throws2();
				ex1.myChange();
			}
		}
		
	

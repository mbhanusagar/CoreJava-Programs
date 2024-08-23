package com.evergent.CoreJava.ExceptionHandling;
//Finally is block if exception hierarchical
class ExceptionDemo5 {

	 
		
		String name=null;
		public void myData() {
			
			try {
				
				System.out.println("ONE");
				//System.out.println(name.length());
				//int k=10/0;
				System.out.println("END");
			}
		
			finally {
				System.out.println("Finally block close connection");
			}
			}
			public static void main(String[] args) {
				ExceptionDemo5 ed= new ExceptionDemo5(); 
				ed.myData();
			}
		}
		
	

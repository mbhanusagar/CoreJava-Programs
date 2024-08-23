package com.evergent.CoreJava.ExceptionHandling;

//We should follow exceptions 
//Exception handle all exceptions
public class ExceptionDemo4 {

	 
		
		String name=null;
		public void myData() {
			
			try {
				
				System.out.println("ONE");
				System.out.println(name.length());
				int k=10/0;
				System.out.println("END");
			}
			catch(NullPointerException a) {
				System.out.println("I can Handle :"+a);
		}
			catch(ArithmeticException a) {
				System.out.println("I can Handle :"+a);
		}
			catch(Exception a) {
				System.out.println("I can Handle :"+a);
		}
			
			}
			public static void main(String[] args) {
				ExceptionDemo4 ed= new ExceptionDemo4(); 
				ed.myData();
			}
		}
		
	

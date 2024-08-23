package com.evergent.CoreJava.ExceptionHandling;
//Finally is block if exception hierarchical
public class ExceptionDemo7 {

	 String name=null;
		public void myData() throws NullPointerException {
				
				System.out.println("ONE");
				System.out.println(name.length());
				int k=10/0;
				System.out.println("END");
			}
			public static void main(String[] args) {
				try {
					ExceptionDemo7 ex1=new ExceptionDemo7();
					ex1.myData();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.print("I can handl: "+e);;
				}
				
			}
		}
		
	

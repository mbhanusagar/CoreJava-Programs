package com.evergent.CoreJava.oops;

public class MethodFlow {

	 
		// TODO Auto-generated method stub
		public void display() {
		System.out.println("display Method: Hello");}
		
		public void add(int a, int b) {
			System.out.println(a+b);
		}
		public int myData(int a, int b) {
			return a*b;}
		
		public int myChange() {
			return 100;}
		public static void main(String args[]) {
			MethodFlow mf=new MethodFlow();
			mf.display();
			mf.add(10,20);
			int t=mf.myData(5,5);
			System.out.println(t);
			int c=mf.myChange();
			System.out.println(c);
		}
		
		}
	



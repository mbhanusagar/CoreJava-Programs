package com.evergent.CoreJava.logical;

public class SwapWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=5;
		int temp=a;
		a=b;
		b=a;
		a=temp;
		System.out.println(a);
		System.out.println(b);

	}

}

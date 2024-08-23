package com.evregent.CoreJava.general;

public class BiggestOfFive {

	public static void main(String[] args) {
		int a=10,b=5,c=20,d=1,e=0;
		if(a>b && a>c && a>d &&a>e)
			System.out.print(a);
		else if(b>a && b>c && b>d && b>e)
			System.out.print(b);
		else if(c>a && c>b && c>d && c>e)
			System.out.print(c);
		else if(d>a && d>b && d>c && d>e)
			System.out.print(d);
		else 
			System.out.print(e);

	}

}

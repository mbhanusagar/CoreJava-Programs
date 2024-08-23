package com.evergent.CoreJava.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("Java");
		String str2=new String("Java");
		if(str1==str2)
			System.out.println(true);
		else
			System.out.println(false);
		if(str1.equals(str2))
			System.out.println(true);
		else
			System.out.println(false);

	}

}

package com.evergent.CoreJava.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		sb.append("world");
		System.out.println(sb);
		sb.insert(6,"Beautiful");
		System.out.println(sb);
		sb.replace(0, 5, "Hii");
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse();

	}

}

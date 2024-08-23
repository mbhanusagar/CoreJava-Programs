package com.evergent.CoreJava.strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
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

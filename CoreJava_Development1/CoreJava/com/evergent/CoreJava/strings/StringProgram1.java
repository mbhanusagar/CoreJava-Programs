package com.evergent.CoreJava.strings;

public class StringProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		System.out.println(s.hashCode());
		System.out.print(s);
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			s=s+ch;
			System.out.println(s.hashCode());
		}
		System.out.println(s);
		System.out.println(s.hashCode());

	}

}

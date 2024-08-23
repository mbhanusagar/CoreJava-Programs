package com.evergent.CoreJava.strings;

public class StringProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder();
		System.out.print(s);
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			s.append(ch);
			
		}
		System.out.println(s);
		

	}

}

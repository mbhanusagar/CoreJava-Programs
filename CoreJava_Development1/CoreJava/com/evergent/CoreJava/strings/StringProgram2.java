package com.evergent.CoreJava.strings;

import java.util.Arrays;

public class StringProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=" JavaTechnology ";
		System.out.println(name.toCharArray());
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('T'));
		System.out.println(name.strip());
	}

}

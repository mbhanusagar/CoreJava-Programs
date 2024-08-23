package com.evergent.CoreJava.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HasDemo3 {
	public static void main(String[] args) {
	HashSet mySet=new HashSet();
	mySet.add(100);
	mySet.add("hello");
	mySet.add(45.5);
	mySet.add(100);
	Iterator iterator=mySet.iterator()	;
	while(iterator.hasNext())
		System.out.println(iterator.next());}

}

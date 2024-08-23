package com.evergent.CoreJava.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		myList.add(100);
		myList.add("Hello");
		myList.add(45.5);
		myList.add(100);
		Iterator iterator=myList.iterator()	;
		while(iterator.hasNext())
			System.out.println(iterator.next());}

}

package com.evergent.CoreJava.ExceptionHandling;


public class StackOverFlowExample {
	
public static void main(String[] args) {
	try {
		recursiveMethod();
	} catch (StackOverflowError e) {
		// TODO: handle exception
		System.out.println("StackOverFlowError caught "+e.getMessage());
	}}
	public static void recursiveMethod() {
		recursiveMethod();
	}
	
}

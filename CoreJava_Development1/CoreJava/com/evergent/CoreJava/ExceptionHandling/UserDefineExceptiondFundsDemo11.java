package com.evergent.CoreJava.ExceptionHandling;

import javax.management.remote.SubjectDelegationPermission;

class InvalidFundsException extends Exception {
	 public InvalidFundsException(String message) {
		 super(message);
	 }
}
public class UserDefineExceptiondFundsDemo11{
	public static void withDraw(double amount) throws InvalidFundsException {
		double balance=500.00;
		if (amount>balance)
			throw new InvalidFundsException("Invalid funds for withdraw");
		else {
			System.out.println("withdraw successfull");
		}
	}
	public static void main(String [] args) {
		try {
			withDraw(600.00);
		} catch (InvalidFundsException e) {
			// TODO: handle exception
			System.out.println("Caught the Exception :"+e);
			System.out.println(e);
		}
		System.out.println("Program continuos after handling the exception");
	}
	
}

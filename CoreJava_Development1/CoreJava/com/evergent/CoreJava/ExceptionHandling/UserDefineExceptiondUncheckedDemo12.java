package com.evergent.CoreJava.ExceptionHandling;

class InvalidScoreException extends RuntimeException {
	 public InvalidScoreException(String message) {
		 super(message);
	 }
}
public class UserDefineExceptiondUncheckedDemo12{
	public static void validateScore(int score) throws InvalidScoreException{
		
		if (score<0 || score>100)
			throw new InvalidScoreException("Score must be between 0 and 100");
		else {
			System.out.println("withdraw successfull");
		}
	}
	public static void main(String [] args) {
		try {
			validateScore(110);
		} catch (InvalidScoreException e) {
			// TODO: handle exception
			System.out.println("Caught the Exception :"+e);
			System.out.println(e);
		}
		System.out.println("Program continuos after handling the exception");
	}
	
}

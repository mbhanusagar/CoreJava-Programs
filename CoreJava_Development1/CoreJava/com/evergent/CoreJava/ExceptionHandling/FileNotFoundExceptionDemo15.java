package com.evergent.CoreJava.ExceptionHandling;
import java.io.*;
import java.util.*;
public class FileNotFoundExceptionDemo15 {
	public static void main(String[] args) {
		try {
			File file =new File("C:/MyFiles/myData.txt");
			Scanner scanner=new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
				
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}

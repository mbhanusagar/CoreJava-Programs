package com.evergent.CoreJava.Inhertence;

public class BookImpl2 implements Book{
	public void bookTitle(){
		System.out.println("Java");
	}
	public void bookAuthor(){
		System.out.println("oracle");
	}
	public void bookPrice(){
		System.out.println("RS: 550");
	}
	public void show() {
		System.out.println("Show is a local method");
	}
	public static void main(String[] args) {
		Book b1 = new BookImpl2();
		b1.bookTitle();
		b1.bookAuthor();
		b1.bookPrice();
		//b1.show();
	}
}



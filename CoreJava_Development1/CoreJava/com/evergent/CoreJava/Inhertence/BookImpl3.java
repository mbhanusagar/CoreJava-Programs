package com.evergent.CoreJava.Inhertence;

public class BookImpl3 implements Book, NewBook {
	public void bookTitle() {
		System.out.println("JAVA");
	}
	public void bookAuthor() {
		System.out.println("James");
	}
	public void bookPrice() {
		System.out.println("Rs. 230");
	}
	public void addNewBook() {
		System.out.println("New Java Version");
	}
	public void myData() {
		System.out.println("My Data");
	}
	public void show() {
		System.out.println("Show is a local method");
	}
	public static void main(String[] args) {
		Book b1 = new BookImpl3();
		b1.bookTitle();
		b1.bookAuthor();
		b1.bookPrice();
		//b1.show();
	}
}
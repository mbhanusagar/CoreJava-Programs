package com.evergent.CoreJava.constructors;
class Animal{
	private String name;
	private int age;
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public  void displayInfo() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		
	}
	
}
class Dog extends Animal{
	private String breed;
	public Dog(String name,int age,String breed) {
		super(name,age);
		this.breed=breed;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("breed"+breed);
	}
}
public class  Program8InheritenOverriding{
public static void main(String[] args) {
	//System.out.println();
	Dog d=new Dog("buddy",5,"golden retriever");
	d.displayInfo();
}
}








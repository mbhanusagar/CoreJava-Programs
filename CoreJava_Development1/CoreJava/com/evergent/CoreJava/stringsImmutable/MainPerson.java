package com.evergent.CoreJava.stringsImmutable;

class Personimmutable {
	private final String name;
	private final int age;
	public Personimmutable(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}
}
public class MainPerson{
	public static void main(String args[]) {
		Personimmutable p=new Personimmutable("bhanu",25);
		System.out.println(p.myName());
		System.out.println(p.myAge());
	}
}

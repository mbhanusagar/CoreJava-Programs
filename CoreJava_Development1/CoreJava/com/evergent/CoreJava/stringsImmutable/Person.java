package com.evergent.CoreJava.stringsImmutable;

class Person{
	private final String name;
	private final int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}
	public void main(String args[]) {
		Person p=new Person("bhanu",25);
System.out.println(p);
System.out.println(p.hashCode());

}}
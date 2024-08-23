package com.evergent.CoreJava.constructors;
class Car{
	String color;
	int maxspeed;
	Car(){
		color="white";
		maxspeed=120;
	}
	Car(String color,int maxspeed){
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void diplay() {
		System.out.println("color :"+color);
		System.out.println("maxspeed :"+maxspeed);
		
	}
}
public class Program7MyCars7 {
public static void main(String[] args) {
	Car c1=new Car();
	Car c2=new Car("Red",150);
	c1.diplay();
	c2.diplay();
	
}
}











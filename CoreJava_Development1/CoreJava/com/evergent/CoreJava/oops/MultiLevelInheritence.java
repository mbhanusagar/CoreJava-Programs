package com.evergent.CoreJava.oops;

 class PersonData {
	public void personData() {
		System.out.println("PersonData class Method");
	}

}
 class PersonInfo extends PersonData{
	public void personInfo1() {
		System.out.println("Person Info class method");
	}
}
 class MultiLevelInheritence extends PersonInfo{
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String args[]) {
		MultiLevelInheritence ml= new MultiLevelInheritence();
		ml.personData();
		ml.personInfo1();
		ml.show();
	}
}

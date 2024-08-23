package com.evergent.CoreJava.stringsImmutable;
class ImmutableString {
private final String value;
public ImmutableString(String value) {
	this.value=value;
}
public String toString() {
	return value;
}
}

class MyData{
	public static void main(String args[]) {
		ImmutableString s=new ImmutableString("Hello bhanu");
		System.out.print(s.toString());
	}
}

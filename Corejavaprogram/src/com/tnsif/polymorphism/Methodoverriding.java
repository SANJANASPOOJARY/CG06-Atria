package com.tnsif.polymorphism;

class Father {
	int a=9;
	
	void drink() {
		System.out.println("tea");
	}
}
class son extends Father{
	@Override
	void drink() {
		System.out.println("This is the son class");
		System.out.println("coffee");
		System.out.println();
		System.out.println("This is the father class method: ");
		super.drink();
	}
}
public class Methodoverriding{
	public static void main(String[] args) {
		son s=new son();
		s.drink();
	}
}
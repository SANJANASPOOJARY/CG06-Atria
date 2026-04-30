package com.tnsif.polymorphism;


class Calculator{
	int add(int a) {
		return a;
	}
	
	double add(double a,double b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class Methodoverloading {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("The value of a is: "+c.add(3));
		System.out.println();
		System.out.println("The sum of the two numbers are: "+c.add(6.5,7.2));
		System.out.println();
		System.out.println("the sum of the three numbers are: "+c.add(1,2,3));
	}

}

package com.tnsif.constructordemo;

class Calculator {
	int Calculator(int a,int b)
	{
		return a+b;
	}
	int Calculator(int a,int b,int c)
	{
		return a+b+c;
	}
	String Calculator(String name)
	{
		return name;
	}

}
public class ConstructorOverloading{
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println();
	}
}
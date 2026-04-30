package com.tnsif.InheritanceDemo;


class child extends Father{
	String cycleColor="pink";
	private char[] money;
	
	void read() {
		System.out.println("Java");
	}
	public static void main(String[] args) {
		child c=new child();
		System.out.println("The money is: ");
		System.out.println(c.money);
		
		c.drink();
		
		System.out.println("The car: ");
		System.out.println(c.car);
		
		System.out.println("The color of the cycle: ");
		System.out.println(c.cycleColor);
	}
	private void drink() {
		// TODO Auto-generated method stub
		
	}
}

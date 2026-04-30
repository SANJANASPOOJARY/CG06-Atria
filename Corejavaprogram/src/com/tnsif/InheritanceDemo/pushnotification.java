package com.tnsif.InheritanceDemo;


class pushnotification extends notification{
	String message="Push notification...";
	
	void display() {
		System.out.println("Child: "+message);
		System.out.println("Parent: "+super.message);
		
		System.out.println();
		System.out.println("This is a parent class notification: ");
		super.display();
	}
	
	public static void main(String[] args) {
		pushnotification pn=new pushnotification();
		pn.display();
		
	}
}

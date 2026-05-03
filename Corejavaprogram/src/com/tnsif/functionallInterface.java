package com.tnsif.Interface;

interface fi{
	void display();
}

class fy implements  fi{

	@Override
	public void display() {
		System.out.println("I am a fy class implementing the fi interface");
		
	}
	
}

public class functionallInterface {
	public static void main(String[] args) {
		fy f=new fy();
		f.display();
	}

}
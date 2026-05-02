package com.tnsif.Multilevelinheritancedemo;

class grandson extends son{
	String gname="xyz";
	int gage=15;
	
	public void details() {
		System.out.println("The name of the father is: "+name+" and age: "+age);
		System.out.println("The name of the son is: "+sname+" and age: "+sage);
		System.out.println("The name of the grandson is: "+gname+" and age: "+gage);
	}
	public static void main(String[] args) {
		grandson gs=new grandson();
		System.out.println("The grandson details are: ");
		gs.details();
		
		Father f=new Father();
		System.out.println("The father details are: ");
		f.details();
		
		son s =new son();
		System.out.println("The son details are: ");
		s.details();
	}

}
package com.tnsif.Multilevelinheritancedemo;

class son extends Father{
	String sname="cba";
	int sage=21;
	
	public void details() {
		System.out.println("The name of the father is: "+name+" and age is: "+age+" the name of the son is: "+sname+" and the age of the son is: "+sage);
	}


}
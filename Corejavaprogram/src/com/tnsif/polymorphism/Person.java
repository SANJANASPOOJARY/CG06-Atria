package com.tnsif.polymorphism;
//Demo for this keyword

class abc {
private String name;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void display() {
	 System.out.println("Name: "+name+" and id: "+id);
}

}
public class Person{
	public static void main(String[] args) {
		abc a =new abc();
		a.setId(12);
		a.setName("Suma");
		
		//System.out.println("The Id of the person is: ");
		a.getId();
		//a.display();
		
		System.out.println("The name and the id of the person is : ");
		//System.out.println("the name of the person is: ");
		a.getName();
		a.display();
		
	}
}

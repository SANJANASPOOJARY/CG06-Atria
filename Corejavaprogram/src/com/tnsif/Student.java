package com.tnsif.constructordemo;

public class Student {
	private int age;
	private String name;
	private int marks;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "[name: "+name+" age: "+age+ " marks: "+marks+"]"; 
	}
}
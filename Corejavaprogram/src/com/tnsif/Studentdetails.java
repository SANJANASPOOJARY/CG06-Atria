package com.tnsif.constructordemo;


import java.util.Scanner;
public class Studentdetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter the name of the Student: ");
		String name=sc.next();
		System.out.println("Enter the age of the student: ");
		int age=sc.nextInt();
		System.out.println("Enter the marks of the student: ");
		int marks=sc.nextInt();
		
		s.setName(name);
		s.getName();
		
		s.setAge(age);
		s.getAge();
		
		s.setMarks(marks);
		s.getMarks();
		
		s.toString();

	}
}
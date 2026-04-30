package com.tnsif.polymorphism;

import java.lang.*;
class person{
	
}
class employee extends person{
	
}
class Manager extends employee{
	
}
public class instanceofcheck {
public static void main(String[] args) {
	person p=new person();
	employee e=new employee();
	Manager m=new Manager();
	System.out.println(p instanceof person);
	System.out.println(e instanceof employee);
	System.out.println(m instanceof Manager);	
	System.out.println(p instanceof employee);
	System.out.println(e instanceof Manager);
	System.out.println(m instanceof person);
}
}
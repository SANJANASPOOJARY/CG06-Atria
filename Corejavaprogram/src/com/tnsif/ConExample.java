package com.tnsif.constructordemo;

public class ConExample {
	ConExample(){
		System.out.println("default con");
	}
	ConExample(int a,String b){
		System.out.println("2 parameter con");
	}
	ConExample(int r){
		System.out.println("1 para");
	}
	ConExample(int s,int b,int d){
		System.out.println("3 para");
	}
	public static void main(String[] args) {
		ConExample c=new ConExample();
		ConExample c1=new ConExample(1,"abc");
		ConExample c2=new ConExample(24);
		ConExample c3=new ConExample(3,"abcd");
		
	}
}
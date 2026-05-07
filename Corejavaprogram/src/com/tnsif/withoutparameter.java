package com.tnsif.LambdaExpressionDemo;

interface Sayable{
	public String Say();
}

public class withoutparameter {
	public static void main(String[] args) {
		Sayable s=()->{return "I have nothing to say";};
		System.out.println(s.Say());
	}
}
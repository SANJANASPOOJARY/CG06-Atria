package com.tnsif.polymorphism;

class UPI{
	int balance;
	String bank;
	int amount;
	int spent;
	
	UPI(int balance){
		this.balance=balance;
		System.out.println("The balance: "+balance);
	}
	
	UPI(int amount,String bank){
		this.amount=amount;
		this.bank=bank;
		System.out.println("The total amount is : "+amount+" and the bank is: "+bank);
	}
	
	UPI(int amount,String bank,int balance){
		this.amount=amount;
		this.bank=bank;
		this.balance=balance;
		System.out.println("The total amount is: "+amount+" and the bank is: "+bank+" with the balance of: "+balance);
	}
	int balance(int amount,int spent) {
		int remainingBalance=amount-spent;
		System.out.println("The balance is: "+remainingBalance);
		return remainingBalance;
	}
}
public class constructoroverlaod {
	public static void main(String[] args) {
		UPI upi=new UPI(30000);
		UPI upi1=new UPI(50000,"HDFC");
		UPI upi2=new UPI(50000,"HDFC",30000);
		upi.balance(50000,20000);
	}
}

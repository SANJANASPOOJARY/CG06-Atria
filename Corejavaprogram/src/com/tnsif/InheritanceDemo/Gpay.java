package com.tnsif.InheritanceDemo;

class GPay extends Payment{
  void process() {
	  System.out.println("pricessing via GPay...");
  }
  
  void display() {
	  super.process();
	  System.out.println();
	  process();
  }
  public static void main(String[] args) {
	GPay g=new GPay();
	g.display();
}
}

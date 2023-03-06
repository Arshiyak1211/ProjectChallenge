package com.constructorchaining.in;

public class MainClass {
	public static void main(String[] args)
	{
		Mobile m=new Mobile("vivo",10000.00);
		System.out.println(m.brand+" "+m.cost);
		
		Laptop l=new Laptop("Apple",12);
		System.out.println(l.brand+" "+l.ramsize);
	}

}

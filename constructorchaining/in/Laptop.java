package com.constructorchaining.in;

public class Laptop extends Electronics{
	
	int ramsize;
	
Laptop(String brand,int ramsize)
{
	super(brand);
	this.ramsize=ramsize;
}
}

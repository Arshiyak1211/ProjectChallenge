package com.constructorchaining.in;

public class Demo {
	Demo(int age)
	{
		this("Tom");
		System.out.println("Age: "+age);
	}
	
	Demo(double height)
	{
		System.out.println("Height: "+height);
	}
	
	Demo(String name)
	{
		this(5.6);
		System.out.println("Name: "+name);
	}
	
	public static void main(String[]args)
	{
		Demo d=new Demo(25);
	}

}

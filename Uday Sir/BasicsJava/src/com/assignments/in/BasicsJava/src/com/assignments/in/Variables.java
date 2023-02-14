package com.assignments.in;

public class Variables {
	//instance variable
	int a=10;
	//static variable
	static int b=20;
	//instance method
	void add()
	{
		//local variable
		int c=30,d;
		d=a+b+c;
		System.out.println("The value of d is "+d);
	}
	//static method
	static void mul()
	{
	//local variable
		int e=40,f;
		f=b+e;
		System.out.println("The value of f is "+f);
	}
	public static void main(String[] args)
	{
		//accessing instance members
		Variables v1=new Variables();
		System.out.println("The value of a is "+v1.a);
		v1.add();
		
		v1.a=25;//re-initialization
		System.out.println("The value of a is "+v1.a);
		
		//accessing static members
		System.out.println("The value of b is "+Variables.b);
		Variables.mul();
		
	}

}

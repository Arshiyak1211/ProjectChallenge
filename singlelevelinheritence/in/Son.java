package com.singlelevelinheritence.in;

public class Son extends Father {
	String name="TOM";
	public static void main(String[] args)
	{
		Son s=new Son();
		System.out.println(s.age);
		System.out.println(s.name);
	}

}

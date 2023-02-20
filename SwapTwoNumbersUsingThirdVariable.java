package com.programs.in;

public class SwapTwoNumbersUsingThirdVariable {
public static void main(String[] args)
{
	int a=10,b=20;
	/* Using Third Variable
	int t;
	t=a;
	a=b;
	b=t;
	*/
	//Without Using Third Variable
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a is "+a);
	System.out.println("b is "+b);
}
}

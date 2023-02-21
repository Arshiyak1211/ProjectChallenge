package com.programs.in;
import java.util.Scanner;
public class FactorialOfANumber {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int no=s.nextInt();
		
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+" is "+fact);
	}

}

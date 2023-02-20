package com.programs.in;

import java.util.Scanner;

public class GettingUserInput {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		//Taking String type Input
		System.out.println("Enter Your Nme");
		String name=s.next();
		
		//Taking char type input
		System.out.println("Enter Your Gender");
		char gender=s.next().charAt(0);
		
		//Takig int type input
		System.out.println("Enter Your Age");
		int age=s.nextInt();
		
		//Taking long type input
		System.out.println("Enter Your Phone Number");
		long phno=s.nextLong();
		
		//Taking Double type input
		System.out.println("Enter Your Salary");
		double salary=s.nextDouble();
		
		//printing values
		System.out.println("----------------------------------------");
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phno);
		System.out.println("Salary: "+salary);
		
	}

}

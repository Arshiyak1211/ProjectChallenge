package com.methodoverloading.in;

public class Netflix {
	
	static void login(String emailId,String password)
	{
		System.out.println("Logged in using Email Id and Password ");
		
	}
	
	static void login(long contactNo,int oTP)
	{
		System.out.println("Logged in using contact Number and OTP");
		
	}
	public static void main(String[] args)
	{
		Netflix.login("arsh@123","Engin@123");
		Netflix.login(90058624871l, 4596);
		
	}
	
	

}

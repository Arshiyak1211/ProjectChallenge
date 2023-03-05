package com.methodoverriding.in;

public class User {
	public static void main(String[] args)
	{
		WhatsApp3 w3=new WhatsApp3();
		
		w3.sendMessage();
		
		System.out.println("--------------------------------");
		
		w3.story();
		
		System.out.println("--------------------------------");
		
		w3.payment();
		
		System.out.println("--------------------------------");
		
		
	}

}

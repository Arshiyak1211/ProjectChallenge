package com.abstraction.in;

public class AccountHolder {
	
	public static void main(String[] args)
	{
		Bank obj=new ATM();
		obj.checkBalance();
		
		System.out.println("-------------------------------");
		
		obj.deposit(3000.00);
		obj.checkBalance();
		
		System.out.println("------------------------------------");
		
		obj.withdraw(4000.00);
		obj.checkBalance();
	}

}

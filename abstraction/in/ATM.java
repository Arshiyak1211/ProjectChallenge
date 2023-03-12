package com.abstraction.in;

public class ATM implements Bank{
	
	double balance=6000.00;
	
	@Override
	public void deposit(double amount)
	{
		System.out.println("Depositing Rs: "+amount);
		
		balance=balance+amount;
		
		System.out.println("Amount Deposited Successfully");
		
	}
	
	@Override
	
	public void withdraw(double amount) 
	{
		System.out.println("Withdrawing Rs: "+amount);
		
		balance=balance-amount;
		
		System.out.println("Amount Withdraw Successfully");
		
	}
	
	@Override
	
	public void checkBalance()
	{
		System.out.println("Available Balance: "+balance);
	}

}

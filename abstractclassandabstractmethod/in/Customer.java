package com.abstractclassandabstractmethod.in;

public class Customer extends HDFC{
	
	@Override
	
	void deposit()
	{
		System.out.println("Depositing Amount");
	}

	@Override
	
	void withdraw()
	{
		System.out.println("Withdrawing Aount");
	}
	
	public static void main(String[] args)
	{
		Customer c=new Customer();
		c.deposit();
		c.withdraw();
	}
}


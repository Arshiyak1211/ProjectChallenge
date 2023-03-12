package com.interfaceexample.in;

public class Customer implements Paytm{
	
	@Override
	
	public void purchase()
	{
		System.out.println("Purchasing Mobile");
	}
	
	@Override
	
	public void payment()
	{
		System.out.println("Paying using Paytm");
	}
	
	public static void main(String[] args)
	{
		Customer c=new Customer();
		c.purchase();
		c.payment();
	}

}

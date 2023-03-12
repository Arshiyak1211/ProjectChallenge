package com.polymorphism.in;

public class Customer {
	
	public static void main(String[] args)
	{
		
	
		FoodDeliveryApp f1=new Swiggy();
		f1.order();
		
		FoodDeliveryApp f2=new Zomato();
		f2.order();
	}

}

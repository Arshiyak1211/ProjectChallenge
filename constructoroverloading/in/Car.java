package com.constructoroverloading.in;

public class Car {
	
	Car(double cost)
	{
		System.out.println("Cost: "+cost);
	}
	
	Car(String brand,double cost)
	{
		System.out.println("Brand: "+ brand + " Cost: "+cost);
	}
	
	Car(String color)
	{
		System.out.println("Color: "+color);
	}
	
	public static void main(String[] args)
	{
		Car c1=new Car(58485.00);
		Car c2=new Car("TOYOTO",58485.00);
		Car c3=new Car("Gray");
	}

}

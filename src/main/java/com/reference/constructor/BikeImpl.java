package com.reference.constructor;

import java.util.function.Consumer;

public class BikeImpl 
{
	public static void main(String[] args) {
		BikeInterf b0=(String name, int cc, double price)->new Bike(name,cc,price);
		BikeInterf b1=(name,cc, price)->new Bike(name,cc,price);
		BikeInterf b2=Bike::new;
		
		Bike bike1=b0.getBike("Honda Hornet", 160, 120000.00);
		Bike bike2=b1.getBike("TVS Apache", 180, 135000.00);
		Bike bike3=b2.getBike("Yahmaha R15", 150,180000.00);
		Consumer<Bike>c=(b)->
		{
			System.out.println("------------Details------------------");
			System.out.println("Bike Name:"+b.getName());
			System.out.println("Bike Engine Capacity (CC): "+b.getCc());
			System.out.println("Bike Price: "+b.getPrice());
			System.out.println("---------------End-------------------\n");
		};
		c.accept(bike1);
		c.accept(bike2);
		c.accept(bike3);
		
		
	}
}

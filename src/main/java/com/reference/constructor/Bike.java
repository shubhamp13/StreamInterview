package com.reference.constructor;

public class Bike 
{
	private String name;
	private int cc;
	private double price;
	public Bike(String name, int cc, double price) {
		super();
		this.name = name;
		this.cc = cc;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", cc=" + cc + ", price=" + price + "]";
	}
	
}

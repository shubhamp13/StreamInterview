package com.optional.example;

import java.util.Optional;

public class Laptop  
{
	private String name;
	private String modelName;
	private Double price;
	private int id;

	public Laptop(String name, String modelName, Double price) {
		super();
		this.name = name;
		this.modelName = modelName;
		this.price = price;
	}
	public Laptop(String name, String modelName, Double price,int id) {
		super();
		this.name = name;
		this.modelName = modelName;
		this.price = price;
		this.id=id;
	}


	public Optional<String>getName()
	{
		return Optional.ofNullable(name);
	}
	public Optional<String>modelName()
	{
		return Optional.ofNullable(modelName);
	}
	public Optional<Double>getPrice()
	{
		return Optional.ofNullable(price);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}

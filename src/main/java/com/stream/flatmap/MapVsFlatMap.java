package com.stream.flatmap;

import java.util.List;

public class MapVsFlatMap 
{
	public static void main(String[] args) 
	{
		//map() will do data transforming
		//flatMap() will do data transformation and flattering
		
		//customer->customer.getEmail()------->one to one mapping
		List<Customer>customers=CustomerDb.getCustomers();
		List<String>emails=customers.stream().map(s->s.getEmailId()).toList();
		emails.forEach(System.out::println);
		
		//customer->customer.getPhoneNumbers()------>one to one mapping
		List<List<String>>phoneNumbers=customers.stream().map(s->s.getPhoneNumbers()).toList();
		phoneNumbers.forEach(System.out::println);
		
		//customer->customer.getPhoneNumbers()----->one to many mapping
		List<String>phoneNumbers2=customers.stream().flatMap(s->s.getPhoneNumbers().stream()).toList();
		phoneNumbers2.forEach(System.out::println);
	}
}

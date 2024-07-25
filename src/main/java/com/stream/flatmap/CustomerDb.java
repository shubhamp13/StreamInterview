package com.stream.flatmap;

import java.util.ArrayList;
import java.util.List;

public class CustomerDb {
	public static List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(
				new Customer(1001, "Shubham Puri", "shubhampuri8297@gmail.com", List.of("8793569631", "9422466999")));
		customers
				.add(new Customer(1002, "Sia Kapoor", "siakapoor123@example.com", List.of("8745632100", "9876543210")));
		customers.add(
				new Customer(1003, "Rohit Sharma", "rohitsharma@example.com", List.of("8569321470", "9123456789")));
		customers.add(
				new Customer(1004, "Anjali Mehta", "anjalimehta@example.com", List.of("8523697410", "9192939495")));
		customers.add(
				new Customer(1005, "Vikram Singh", "vikramsingh@example.com", List.of("8541237896", "9001122334")));
		customers.add(new Customer(1006, "Nina Gupta", "ninagupta@example.com", List.of("8123456789", "9198765432")));
		customers.add(new Customer(1007, "Amitabh Bachchan", "amitabhbachchan@example.com",
				List.of("8234567890", "9182736450")));
		customers.add(
				new Customer(1008, "Priya Sharma", "priyasharma@example.com", List.of("8541239632", "9078563412")));
		customers.add(new Customer(1009, "Rahul Verma", "rahulverma@example.com", List.of("8956231470", "9145678901")));
		customers.add(
				new Customer(1010, "Meena Kumari", "meenakumari@example.com", List.of("8912345678", "9134567890")));
		return customers;
	}
}

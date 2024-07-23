package com.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Harry Potter", 1001, 520));
		books.add(new Book("The Lord of the Rings", 1002, 1178));
		books.add(new Book("The Catcher in the Rye", 1003, 277));
		books.add(new Book("To Kill a Mockingbird", 1004, 336));
		books.add(new Book("1984", 1005, 328));
		books.add(new Book("The Great Gatsby", 1006, 180));
		books.add(new Book("Moby Dick", 1007, 585));
		books.add(new Book("Pride and Prejudice", 1008, 279));
		books.add(new Book("War and Peace", 1009, 1225));
		books.add(new Book("Crime and Punishment", 1010, 671));
		return books;
	}
}

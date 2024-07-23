package com.lambda.example;

import java.util.Collections;
import java.util.List;

public class BookService 
{
	public List<Book>getBokksInSort()
	{
		List<Book>books=new BookDao().getBooks();
		Collections.sort(books,(e1,e2)->e1.getName().compareTo(e2.getName()));
		return books;
	}
	public static void main(String[] args) 
	{
			System.out.println(new BookService().getBokksInSort());
		
	}
}
 

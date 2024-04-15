package com.work2win;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Book {
	
	private String title;
	private String author;
	private int price;
	
	
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	public static void main(String args[]) {
		
		
		List<Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(new Book("Effective Java", "Joshua Bloch", 2));
		listOfBooks.add(new Book("Java Puzzlers", "Joshua Bloch", 22));
		listOfBooks.add(new Book("Java Concurrency in Practice", 
		"Brian Goetz", 42));
		listOfBooks.add(new Book("Java SE 8 for Really Impatient",
		 "Cay S. Horstmann", 34));
		listOfBooks.add(new Book("Core Java", "Cay S. Horstmann",32));
		
		//listOfBooks.sort(Comparator.comparing((Book b) -> b.getAuthor()));
		listOfBooks.sort(Comparator.comparing(Book::getPrice));
		//Sorting based on age[Book [title=Effective Java, author=Joshua Bloch, price=2], Book [title=Java Puzzlers, author=Joshua Bloch, price=22], Book [title=Core Java, author=Cay S. Horstmann, price=32], Book [title=Java SE 8 for Really Impatient, author=Cay S. Horstmann, price=34], Book [title=Java Concurrency in Practice, author=Brian Goetz, price=42]]
		System.out.println("Sorting based on age"+listOfBooks);
	}
	
	
	

}

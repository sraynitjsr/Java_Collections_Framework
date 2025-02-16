package com.sraynitjsr.designpatterns;

class Book {
	private String title;
	private String author;
	private double price;
	private String genre = "Not Provided";

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getBookDetails() {
		return "Title: " + title + ", Author: " + author + ", Price: " + price + (genre != null ? ", Genre: " + genre : "");
	}
}

class BookBuilder {
	private Book book;

	public BookBuilder() {
		book = new Book();
	}

	public BookBuilder addTitle(String title) {
		book.setTitle(title);
		return this;
	}

	public BookBuilder addAuthor(String author) {
		book.setAuthor(author);
		return this;
	}

	public BookBuilder addPrice(double price) {
		book.setPrice(price);
		return this;
	}

	public BookBuilder addGenre(String genre) {
		book.setGenre(genre);
		return this;
	}

	public Book build() {
		return book;
	}
}

public class MyBuilder {
	public static void start() {
		Book book1 = new BookBuilder()
				.addTitle("GoLang")
				.addAuthor("Subhradeep Ray")
				.addPrice(999.999)
				.build();
		System.out.println(book1.getBookDetails());

		Book book2 = new BookBuilder()
				.addTitle("Core and Advanced Java")
				.addAuthor("I Am Sray")
				.addPrice(111.111)
				.addGenre("Technical")
				.build();
		System.out.println(book2.getBookDetails());
	}
}


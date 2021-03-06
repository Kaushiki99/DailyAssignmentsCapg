package com.capgemini.bsp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.bsp.model.Book;
import com.capgemini.bsp.exceptions.ArrayListIsNullException;
import com.capgemini.bsp.exceptions.BookAlreadyFoundException;
import com.capgemini.bsp.exceptions.BookNotFoundException;

public class BookManager {
	static ArrayList<Book> book = new ArrayList<>();
	static Book b;
	static Scanner sc = new Scanner(System.in);
	public BookManager() {
		
	}
	
//	Methods
	public void addBook() throws Throwable {
		System.out.println("Enter the Book ID: ");
		int bookid = sc.nextInt();
		System.out.println("Enter book name: ");
		sc.next();
		String bname = sc.nextLine();
		System.out.println("Enter book price: ");
		double price = sc.nextDouble();
		b = new Book(bookid, bname, price);
		b.checker(b);
		checkIfBookAlreadyExists(b);
		book.add(b);
	}
	
	public void displayBook() throws ArrayListIsNullException {
		for (Book i: book) {
			if (i != null)
				System.out.println("ID: " +  i.getBid() + ", Name: " + i.getBname() + ", Price: " + i.getPrice());
			else
				throw new ArrayListIsNullException("Array List is empty");
		}
	}
	
	public void updateBook() throws BookNotFoundException, BookAlreadyFoundException {
		boolean ct = false;
		System.out.println("Enter book id: ");
		int id = sc.nextInt();
		for (Book i: book) {
			if (i.getBid() == id) {
				System.out.println("Enter Book Name: ");
				sc.nextLine();
				String newBName = sc.nextLine();
				System.out.println("Enter price: ");
				double newPrice = sc.nextDouble();
				Book b1 = new Book(id, newBName, newPrice);
				checkIfBookAlreadyExists(b1);
				i.setBname(newBName);
				i.setPrice(newPrice);
				ct = true;
			}
		}
		if (ct == false)
			throw new BookNotFoundException("Such book does not exist");
	}
	
	public void deleteBook() throws BookNotFoundException {
		boolean bd = false;
		System.out.println("Enter book id: ");
		int id = sc.nextInt();
		for (Book i: book) {
			if (i.getBid() == id) {
				i = null;
				bd = true;
			}
		}
		if (bd == false)
			throw new BookNotFoundException("Such book does not exist");
	}
	
	//To check if book is already present or not
	public void checkIfBookAlreadyExists(Book b) throws BookAlreadyFoundException {
		for (Book i: book) 
			if (b.getBname().equalsIgnoreCase(i.getBname()) && b.getBid() == i.getBid())
				throw new BookAlreadyFoundException("Book already exists");
	}
	
}

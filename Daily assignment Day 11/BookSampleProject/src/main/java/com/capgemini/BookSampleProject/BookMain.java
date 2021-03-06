package com.capgemini.BookSampleProject;

import java.util.Scanner;

import com.capgemini.bsp.service.BookManager;

public class BookMain {
	 
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		BookManager bm = new BookManager();
		char choice = 'y';
		while (choice == 'y') {
			System.out.println("Press:");
			System.out.println("1. Create a book");
			System.out.println("2. Show the collection of books");
			System.out.println("3. Update Book Price");
			System.out.println("4. Delete Book");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				bm.addBook();
				break;
			case 2:
				bm.displayBook();
				break;
			case 3:
				bm.updateBook();
				break;
			case 4:
				bm.deleteBook();
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue? (y/n)");
			choice = sc.next().trim().charAt(0);
		}
		sc.close();
	}
}
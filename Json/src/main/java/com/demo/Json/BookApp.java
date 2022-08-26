package com.demo.Json;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class BookApp {
	public static void main(String[] args) throws IOException {

		// create ObjectMapper instance
		ObjectMapper mapper = new ObjectMapper();
		ObjectMapper mapperUser = new ObjectMapper();

		List<Book> listBooks = mapper.readValue(new File("D:\\Demo\\Json\\book.json"), new TypeReference<List<Book>>() {
		});

		List<User> listUser = mapperUser.readValue(new File("D:\\Demo\\Json\\user.json"),
				new TypeReference<List<User>>() {
				});

		System.out.println("Book Object" + listBooks);
		System.out.println("User Object" + listUser);
		availableBooks(listBooks);
		issuedBooks(listBooks);

		int usrID = 0;
		
		Scanner usrSC = new Scanner(System.in); // System.in is a standard input stream

		System.out.println("\n Enter User ID");
		usrID = usrSC.nextInt();
		
		searchBooks(listBooks, usrID);
		
		
		int bookID = 0;
		usrID = 0;
		
	
		System.out.println("\n Enter User ID");
		usrID = usrSC.nextInt();

		System.out.println("\n Enter Book ID");
		bookID = usrSC.nextInt();

		allotBooks(listBooks, usrID,bookID);
	
		System.out.println("\n End of program");

		
	}	// Closing of main function

	/*
	 * Function for Displaying Available books
	 * */		
	private static void availableBooks(List<Book> listBooks)
	{
			int i = 0;
			System.out.println("\n Available Books");

			for (i = 0; i < listBooks.size(); i++) {
				if (listBooks.get(i).getUser() == 0) {
					System.out.println(listBooks.get(i).getName());
				}
			}
	}

	
	/*
	 * Function for Displaying Issued books
	 * */		

	private static void issuedBooks(List<Book> listBooks) 	
	{
		int i=0;
			System.out.println("\n Issued Books");
			for (i = 0; i < listBooks.size(); i++) {
				if (listBooks.get(i).getUser() != 0) {
					System.out.println(listBooks.get(i).getName());
				}
			}
	}
	


/*
 * Function for Search for books enquired by user , using User ID
 * */		

private static void searchBooks(List<Book> listBooks, int usrID) 	
{
	int i=0, noUser = 0;

		for (i = 0; i < listBooks.size(); i++) {
			if (listBooks.get(i).getUser() == usrID) {
				System.out.println(listBooks.get(i).getId());
				System.out.println(listBooks.get(i).getName());
				noUser = 0;
				break;
			} else {
				noUser = 1;
			}
		}

		if (noUser == 1) {
			System.out.println("\n The book requested is not available");
		}
}
	
/* Function for Get user ID and Book ID from user and check for allotment */

private static void allotBooks(List<Book> listBooks, int usrID,int bookID) 	
{
		int i,allotFlag = 0;
		for (i = 0; i < listBooks.size(); i++) {
			if (listBooks.get(i).getId() == bookID) {
				// for(i=0;i<listBooks.size();i++)

				if (listBooks.get(i).getUser() == 0) {
					listBooks.get(i).setUser(usrID);
					System.out.println("\n Congratulations Book alloted to you is ");
					System.out.println(listBooks.get(i).getName());
					allotFlag = 0;
					break;
				}

			} else {
				allotFlag = 1;

			}
		}

		if (allotFlag == 1) {
			System.out.println("Book already alloted ");
		}

	}

}// Closing of Class








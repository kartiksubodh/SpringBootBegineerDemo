package com.example.The.Simple.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class HelpingHand {

	//Temporary DataSet 
	List <Books> libraryBooks = new ArrayList <>(Arrays.asList(
										new Books("The Alchemist","Paulo Cohelo","Must read book to understand the nuances of life."),
										new Books("The God of Small Things","Arundhati Roy","HeartBreakingly Beautiful."),
										new Books("The Red Oleanders","Ravindranath Tagore","A literary Gem"),
										new Books("David Copperfield","Charles Dickens","A classic tale.")));
	
																								
	
	//Display
	public List<Books> getAllBooks() {
		
		return libraryBooks;
	}



	//Retrieve Operation
	public Books findMeBook(String bookName) {
			
		return libraryBooks.stream().filter(b -> b.getBookName().equalsIgnoreCase(bookName)).findFirst().get();
	}



	//Insert Operation
	public void addBook(Books newBook) {
		// TODO Auto-generated method stub
		
		libraryBooks.add(newBook);
		
	}



	//Update Operation
	public void updateInfo(String bookName, String info) {
		// TODO Auto-generated method stub
		for(int i = 0; i<libraryBooks.size(); i++) {
			
			Books book = libraryBooks.get(i);
			if(book.getBookName().equalsIgnoreCase(bookName)) {
					book.setBookDescription(info);
			}
				
		}
	}



	//Delete Operation
	public void removeBook(String bookName) {
		// TODO Auto-generated method stub
		
		libraryBooks.remove(libraryBooks.stream().filter(b -> b.getBookName().equalsIgnoreCase(bookName)).findFirst().get());
		
	}



}

package com.example.The.Simple.Library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Librarian {
	
	@Autowired
	private HelpingHand theHelper;
	
    
	@RequestMapping("/books")
	public List<Books> showAllBooks(){
		
		return theHelper.getAllBooks();
		
	}
	
	
	
	@RequestMapping("/books/{bookName}")
	public Books findBook(@PathVariable String bookName) {
		
		return theHelper.findMeBook(bookName); 
	}
	
	@RequestMapping(method = RequestMethod.POST ,value = "/books")
	public void donateBook(@RequestBody Books newBook) {
		
		theHelper.addBook(newBook);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT ,value = "/books/{bookName}")
	public void updateDescription(@PathVariable String bookName, @RequestBody String info) {
		
		theHelper.updateInfo(bookName, info);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE ,value = "/books/{bookName}")
	public void deleteBook(@PathVariable String bookName) {
		
		theHelper.removeBook(bookName);
	}

	
	

}

package com.example.The.Simple.Library;

public class Books {
	
	private String bookName;
	private String authorName;
	private String bookDescription;
	
	
	
	
	public Books(String bookName, String authorName, String bookDescription) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookDescription = bookDescription;
	}


	// The Getters and Setters List
	
	public String getBookName() {
		return bookName;
	}

    public void setBookName(String bookName) {
		this.bookName = bookName;
	}




	public String getAuthorName() {
		return authorName;
	}

    public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}




	
	
	public String getBookDescription() {
		return bookDescription;
	}

    public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	
	
	
	
	
	
	

}

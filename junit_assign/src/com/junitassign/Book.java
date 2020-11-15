package com.junitassign;
public class Book {

	 private int id;
	    private String nameOfTheBook;
	    private String author;
	    private int NoOfpages;
		
	    	    
	    public Book(int id, String nameOfTheBook, String author, int noOfpages) {
			super();
			this.id = id;
			this.nameOfTheBook = nameOfTheBook;
			this.author = author;
			NoOfpages = noOfpages;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNameOfTheBook() {
			return nameOfTheBook;
		}
		public void setNameOfTheBook(String nameOfTheBook) {
			this.nameOfTheBook = nameOfTheBook;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getNoOfpages() {
			return NoOfpages;
		}
		public void setNoOfpages(int noOfpages) {
			NoOfpages = noOfpages;
		}
		public void JunitAssignmentBook(int id, String nameOfTheBook, String author, int noOfpages) {
			this.id = id;
			this.nameOfTheBook = nameOfTheBook;
			this.author = author;
			NoOfpages = noOfpages;
		}
		public void JunitAssignmentBook() {
		}
		@Override
		public String toString() {
			return "JunitAssignmentBook [id=" + id + ", nameOfTheBook=" + nameOfTheBook + ", author=" + author
					+ ", NoOfpages=" + NoOfpages + "]";
		}
	   
	
		
}
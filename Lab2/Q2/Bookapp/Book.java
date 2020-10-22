//Q2. Create a book store application which will help a book store to keep the record of its books. For each
//book, the application will have the Book Title, Book Author, Book ISBN along with the number of copies for
//each book. The system will allow you to display all books, order new/existing books and sell books. With
//sell or order of existing books, number of copies will decrease/increase. With order of new book, a new book
//entry will be added to the system. The system will display a menu on the screen for the user to choose from.
//Here is the menu.
//Enter “1”, to display the Books: Title – Author – ISBN - Quantity.
//Enter “2”, to order new books.
//Enter “3”, to sell books.
//Enter “0”, to exit the system.
//Here is what you need to do.
//1) Create the following Book class.
//Book
//String bookTitle
//String author
//String ISBN
//int numOfCopies
//Book(String, String, String,
//int) void display()
//display() method will display the book info in “Title – Author – ISBN – Quantity” format.
//2) Create another class “BookStore” which should contain all the book objects. For now use an array
//of Book type and assume you can have maximum 10 different books but each could have multiple
//copies.
//BookStore
//Book[] books
//void sell(String bookTitle, int noOfCopies)
//void order(String isbn, int nofOfCopies)
//void display()
//a. sell(String, int) method will search for the book in “books” array using the bookTitle value.
//If the book is found in the list, number of copies will decrease. If the book is not found a
//message should display.
//b. order(String, int) method will order book for the book store. You have to handle both new
//book and existing book scenario.
//i. First search for the book in “books” array using the isbn value.
//ii. If the book is found in the list (which means the book already exists in the system),
//number of copies will increase.
//iii. If the book is not found (which means the book does not exists in the system and
//you need to order new book), a new book entry will be added to the “books” array.
//c. display() method will display info of all books in “books” array “Title – Author – ISBN –
//Quantity” format. Use Book class’s display() method to display each book’s info.
package com.lab2.session;

public class Book {
   private String bookTitle;
   private String author;
   private String ISBN;
   private int numOfCopies;
public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
	super();
	this.bookTitle = bookTitle;
	this.author = author;
	this.ISBN = iSBN;
	this.numOfCopies = numOfCopies;
}
public void display(){
	System.out.println(bookTitle+"-"+author+"-"+ISBN+"-"+numOfCopies);
}
   
}

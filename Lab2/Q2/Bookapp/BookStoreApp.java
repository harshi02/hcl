//Enter “1”, to display the Books: Title – Author – ISBN - Quantity.
//Enter “2”, to order new books.
//Enter “3”, to sell books.
//Enter “0”, to exit the system.

package com.lab2.session;
import java.util.Scanner;
public class BookStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BookStore bookstore= new BookStore();
        Scanner sc=new Scanner(System.in);
        System.out.println("0=exit\n1=Display\n2=Order\n3=sell\nEnter");
        int n= sc.nextInt();
        switch(n) {
        case 0:System.out.println("exit");
        case 1:System.out.println("display");
        case 2:System.out.println("order");
        case 3:System.out.println("sell");
        }
	}

}

package com.lab4.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DemoSerAndDeSer {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//ser
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("dataser.ser"));
		  
		BankAccount bankAcc=new BankAccount("Sai","1234",5000);
	  	  System.out.println(bankAcc);
	  	  bankAcc.display();
	  	  
		//deser
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("datadeser.ser"));
		  
	  	   BankAccount bankAccDeSer=(BankAccount) ois.readObject();
	  	  System.out.println(bankAccDeSer);
	  	  bankAccDeSer.display();

	}

}

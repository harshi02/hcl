/*Modify the code to throw an Exception if the number is greater than 100, set the exception
message to “Number can’t be greater than 100”. Catch the Exception and display the exception
message.*/

package com.lab4.exception.create;

import java.util.Scanner;


public class ExceptionThrow {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int maxValue=100;

		if(number>maxValue) {
		     throw new Exception("number is geater that 100");
		}
		sc.close();
	}
	
}

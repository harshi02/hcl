//Write a program that will prompt user to input a number or enter -1 to quit the program. You will then
//read the value using the nextInt() method of Scanner object and display if the number is even or
//odd. If user enters anything other than integer number. nextInt() method will throw
//InputMismatchException. You have to catch the exception and display a message saying “You
//must enter an integer”.
//Sample output:
//“Please enter a number or enter ‘-1’ if you want to quit”
//3
//“You have entered an odd number”
//“Please enter a number or enter ‘-1’ if you want to quit”
//4
//“You have entered an even number”
//“Please enter a number or enter ‘-1’ if you want to quit”
//a
//“You must enter an integer.”
//“Please enter a number or enter ‘-1’ if you want to quit”
//4.5
//“You must enter an integer.”
//.
//.
//“Please enter a number or enter ‘-1’ if you want to quit”
//-1
//[Your program will end here]
//

package com.lab4.exception;

import java.util.*;

public class ExcepScanner {

	public static void main(String[] args) {
		try {
			int num;
			Scanner scanner=new Scanner(System.in);
			do {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
		     num=scanner.nextInt();
		     oddEven(num);
			}while(num == -1);
			scanner.close();
				
		}catch(InputMismatchException e) {
			System.out.println("You must enter an integer.");
		}
        
	}
	private static void oddEven(int num) {
		if (num==-1) System.out.println("[Your program will end here]");
		else if (num%2==0) System.out.println("You have entered an even number");
		else System.out.println("You hve entered an odd number");
	}

}

/*Now create your own exception named “InputException” which will take an integer (let’s say n) as
parameter and set the exception message to “Number can’t be greater than [n]”. Modify the
program in #1 to throw InputException when the number is greater than 100. So, the exception
message will be “Number can’t be greater than 100”. Catch the exception and display the
exception message.
*/

package com.lab4.pro6;

import java.util.Scanner;

class InputException extends Exception{
	public InputException(String s) {
		super(s);
	}
}

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num>100) {
				throw new InputException("Number can’t be greater than 100");
			}
			sc.close();
			}catch(InputException ex) {
				System.out.println(ex.getMessage());
			}
			
	}

}

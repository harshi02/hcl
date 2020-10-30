/*Create a class and a method named throwException which will throw 2 exceptions 1)
InputException and 2) IOExcception. Now from the main method call this throwException
method; notice what the IDE suggest to fix the error. Choose the try/catch solution. How many
catch blocks have been added and why?*/
package com.lab4.pro7;
import java.io.*;
class InputException extends Exception{
	public InputException(String s) {
		super(s);
	}
}

class ThrowException{
	void throwException(int num)throws InputException, IOException{
		if(num==1) {
			throw new IOException("IOException Occurred");
		}
		else 
			throw new InputException("Invalid value");
	}
}
public class Tester {

	public static void main(String[] args) {
		try {
			ThrowException obj=new ThrowException();
			obj.throwException(1);
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}

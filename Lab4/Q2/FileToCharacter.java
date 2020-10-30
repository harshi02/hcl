//Write a program to Read from command prompt using character buffer and Write to a file using character buffer. 
package com.lab4.exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileToCharacter {
		public static void main(String[] args) {
			try {
			FileReader reader = new FileReader("data.txt");
			FileWriter writer = new FileWriter("dataWriteFile.txt");
			int character;
			 while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();
           // write to file
			writer.write("Hi Hello");
            writer.write("\r\n");   // write new line
            writer.write("Nice to meet you");
            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
}
}

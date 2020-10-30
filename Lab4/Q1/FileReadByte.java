//Write a program to Read from file in byte format and Write to command prompt in both byte format and using
//formatted output(System.out.print or println)

package com.lab4.exception;

import java.io.*;

public class FileReadByte {

	public static void main(String[] args) {
		  
		String fileName="data.txt";
		InputStream inSt= null;
		try{
			inSt = new FileInputStream(fileName);
			byte cont[] = new byte[2*1024];
			int countRead = 0;
			while((countRead = inSt.read(cont))>0) {
				System.out.println(new String(cont, 0, countRead-1));
				}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
				    e.printStackTrace();
		} finally {
			try{
				if(inSt != null) inSt.close();
				} catch(Exception ex){}
			}
	}
}
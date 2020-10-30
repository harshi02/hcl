/*Create a multithreaded program by using Runnable interface and then create,
initialize and start three Thread objects from your class. The threads will
execute concurrently and display from 0 to 100 in the format [thread name :
number].
*/

package com.lab4.thread;

class Multi implements Runnable{
	
	
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Current thread name: " + Thread.currentThread().getName() + " " + i);
		}
	}
}
public class MultiThread  {
	public static void main(String[] args) {
     Multi multiThread=new Multi();
     Thread thread1=new Thread(multiThread, "Thread1");
     Thread thread2=new Thread(multiThread, "Thread2");
     Thread thread3=new Thread(multiThread, "Thread3");
     Thread thread4=new Thread(multiThread, "Thread4");
     Thread thread5=new Thread(multiThread, "Thread5");
     
     thread1.start();
     thread2.start();
     thread3.start();
     thread4.start();
     thread5.start();
     
}
}
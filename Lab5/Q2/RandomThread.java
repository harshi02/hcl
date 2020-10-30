/*Write a program that runs 5 threads, each thread randomizes a number
between 1 and 10. The main thread waits for all the others to finish, calculates
the sum of the numbers which were randomized and prints that sum. You will
need to implement a Runnable class that randomizes a number and store it in a
member field. When all the threads have done, your main program can go over
all the objects and check the stored values in each object.
*/
package com.lab4.thread;

import java.util.Random;

class RandomSum implements Runnable {
	
	private int sum;
	
	public RandomSum(int sum) {
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}

	public void run() {
		getSum(sum);
	}
	
	public int getSum(int sum) {

		Random random = new Random();
		int value = random.nextInt(10)+1;
		System.out.println("random number: " + value);
		
		synchronized (this) {
			this.sum += value;
		}
		return this.sum;
	}
	
	
}
public class RandomThread {

	public static void main(String[] args) {
		
		int sum = 0;
		RandomSum randomSum = new RandomSum(sum);
		Thread thread1 = new Thread(randomSum);
		Thread thread2 = new Thread(randomSum);
		Thread thread3 = new Thread(randomSum);
		Thread thread4 = new Thread(randomSum);
		Thread thread5 = new Thread(randomSum);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		System.out.println("Final sum: " + randomSum.getSum());

	}
	}


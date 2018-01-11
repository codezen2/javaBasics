package com.pack3;

import com.pack1.MyThread;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		t1.setName("ram");

		MyThread t2 = new MyThread();
		t2.setName("tom");
		/*
		 * All will execute but with some priority
		 * t1.setPriority(Thread.MAX_PRIORITY);//10
		 * t2.setPriority(Thread.MIN_PRIORITY);//2 
		 * t2.setPriority(Thread.NORM_PRIORITY);//5-10
		 * Max level  
		 */
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		for (int i = 1; i <= 200; ++i) {
			System.out.println(Thread.currentThread().getName() + " " + (i * 5));
		}
		System.out.println("main thread complete....");
	}

}

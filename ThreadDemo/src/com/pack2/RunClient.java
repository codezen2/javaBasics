package com.pack2;

public class RunClient {

	public static void main(String[] args) {

		//MyRunnable r1 = new MyRunnable();
		// SAME INSTANCE HAS 2 THREADS, makes a thread for each request
		// its useful when we want to create server based applications

		// copies code from myrunnable and makes a thread instance

		
		// create a runnable interface
		Runnable r2 = ()-> {
			for (int i = 1; i <= 1000; ++i) {
				System.out.println(Thread.currentThread().getName() + " " + (i * 5));
			}

		};
		Thread t1 = new Thread(r2);
		t1.setName("Ram");

		Thread t2 = new Thread(r2);
		t2.setName("Jill");

		t1.start();
		t2.start();

		System.out.println("Main Over");
	}

}

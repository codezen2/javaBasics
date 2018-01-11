package com.pack7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDemo {

	public static void main(String[] args) {
		

		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		
		MyRunnable r1 = new MyRunnable("ram");
		MyRunnable r2 = new MyRunnable("tom");
		MyRunnable r3 = new MyRunnable("sam");
		MyRunnable r4 = new MyRunnable("peter");
		MyRunnable r5 = new MyRunnable("mary");
		MyRunnable r6 = new MyRunnable("akbar");
		
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		pool.execute(r6);
		
		pool.shutdown();
	}

}

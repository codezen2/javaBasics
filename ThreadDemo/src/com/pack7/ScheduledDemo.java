package com.pack7;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledDemo {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println("Generate Reports");
		};
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
		pool.scheduleAtFixedRate(r1, 1000, 2000, TimeUnit.MILLISECONDS);
		
		

	}

}

package com.pack6;

public class Que {
	
	private String data;
	boolean valueset = false;

	public synchronized void get() {
		System.out.println("consumer");
		if (!valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("consumer consumed "  + data);
		valueset = false;
		notify();
	}

	
	public synchronized void put( String str) {
		System.out.println("producer");
		if (valueset) {
			
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
		data = str;
		valueset = true;
		System.out.println("producer posted " + data);
		notify();
	}
}
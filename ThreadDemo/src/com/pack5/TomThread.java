package com.pack5;


public class TomThread extends Thread {
	
	private Account account;
	private String name;
	private int amount;
	
	public TomThread(Account account, String name, int amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
	}
	
	
	@Override
	public void run() {
		synchronized(account){
			account.deposit(name, amount);
		}
		
	}
}

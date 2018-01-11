package com.pack4;


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
		account.deposit(name, amount);
	}
}

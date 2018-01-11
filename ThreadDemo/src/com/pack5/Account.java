package com.pack5;


public class Account {
	public int balance;

	
	public Account(int balance) {
		this.balance = balance;
	}

	
	public int getBalance() {
		
		return balance;
	}

	
	private void setBalance(int balance) {
		
		this.balance = balance;
	}
	
	
	public  void deposit(String name, int amt) {
	
		for(int i=1; i<=500; ++i){
			System.out.println(name + " doing tx " );
		}
	}


	
}

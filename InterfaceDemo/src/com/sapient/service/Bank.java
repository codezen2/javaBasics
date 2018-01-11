package com.sapient.service;

public class Bank implements Atm, Agent {

	private static Bank bank = new Bank();

	private Bank() {

	}
	public static Atm getAtm()
	{
		Atm atm=bank;
		return atm;
	}
	public static Agent getAgent()
	{
		Agent agent=bank;
		return agent;
	}
	

	public void clearPdc() {
		System.out.println("ClearPdc");
	}

	@Override
	public void approveLoan() {
		System.out.println("Approve loan");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");

	}

	@Override
	public void deposit() {
		System.out.println("Deposit");

	}

	@Override
	public void getBal() {
		System.out.println("get Balance");

	}

}

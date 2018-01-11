package com.sapeint.client;

import com.sapient.service.Agent;
import com.sapient.service.Atm;
import com.sapient.service.Bank;

public class BankClient {
	public static void  main(String[] args) {
	
		Atm atm= Bank.getAtm();
		atm.deposit();
		atm.withdraw();
		atm.getBal();
		//Bank bank=new Bank(); // will give error
		Agent agent=Bank.getAgent();
		agent.approveLoan();
		agent.clearPdc();
	}
}

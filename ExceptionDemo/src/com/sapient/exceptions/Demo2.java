package com.sapient.exceptions;

public class Demo2 {

	public static void main(String[] args) {
		// calls approve loan> calls process loan
		String res = approveLoan(22, 200000);
		System.out.println(res);
	}

	public static String approveLoan(int age, double income) {
		String res = null;
		try {
			res = processLoan(age, income);
			return res;
		} catch (AgeException | IncomeException e) {
			return e.getMessage();
		} finally {//first works finnaly then returns value
			System.out.println("Finally Block");
		}
	}

	public static String processLoan(int age, double income) throws AgeException, IncomeException {
		if (age < 20 || age > 40)
			throw new AgeException("Age must be between 20 and 40 to apply.");
		if (income < 400000)
			throw new IncomeException("Income must be more than minimum 4 lakhs");
		return "Loan Approved";
	}

}

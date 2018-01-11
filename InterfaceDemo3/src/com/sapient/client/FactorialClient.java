package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		System.out.println("FACTORIAL");
		Factorial obj3=Calculator.getFac();
		System.out.println("SUM:"+obj3.doSum(5000,2,2,23,33,23,32));
		System.out.println("Factorial:"+obj3.findFact(6));
	}

}

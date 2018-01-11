package com.sapient.lambda;

public class CalcClient {
	/*
	 * Demo - Multiple Inline Implementations
	 * 
	 * 
	 */

	public static void main(String[] args) {
//		final int c = 60; //this variable becomes final
		int c=60;
		ICalculator add = (a, b) -> {
			return a + b + c;
		};
		ICalculator sub = (int a, int b) -> {
			return a - b;
		};
		ICalculator mul = (a, b) -> a * b;
		//c=70; this shoots error because it has become final or effectively final
		System.out.println(add.doCalc(10, 20));
		System.out.println(sub.doCalc(20, 10));
		System.out.println(mul.doCalc(10, 3));

	}

}

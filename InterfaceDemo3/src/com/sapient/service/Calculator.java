package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Intrest, Factorial{

	private static  Calculator calc=new Calculator();
	
	private Calculator()
	{
		
	}
	public static Basic getBasic(){
		Basic obj=calc;
		return obj;
	}
	public static Intrest getIntrest(){
		Intrest obj=calc;
		return obj;
	}
	public static Factorial getFac(){
		Factorial obj=calc;
		return obj;
	}
	
	@Override
	public String convert2Binary(int num) {
		// TODO Auto-generated method stub
		return Integer.toBinaryString(num);
	}

	@Override
	public BigInteger findFact(int num) {
		  BigInteger fact = BigInteger.ONE;
	       for (int i = 1; i <= num; i++) {
	           fact = fact.multiply(BigInteger.valueOf(i));
	       }
	       return fact;		
	}

	@Override
	public double calcSimple(double amt, int years, float rate) {
		// TODO Auto-generated method stub
		return (amt*years*rate)/100;
	}

	@Override
	public double calcComp(double amt, int years, float rate) {
		return (amt * Math.pow((1+rate/100), years)-amt);
	}
	@Override
	public int doSum(int... a) {
		return Intrest.super.doSum(a); // overriding already defined method
	}
	

}

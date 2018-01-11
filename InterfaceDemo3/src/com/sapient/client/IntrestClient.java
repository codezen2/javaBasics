package com.sapient.client;

import com.sapient.service.Basic;
import com.sapient.service.Calculator;
import com.sapient.service.Factorial;
import com.sapient.service.Intrest;

public class IntrestClient {

	public static void main(String[] args) {
		
		System.out.println("INTREST");
		Intrest obj=Calculator.getIntrest();
		System.out.println("SI:"+obj.calcSimple(5000,2,2.5f));
		System.out.println("CI:"+obj.calcComp(5000,2,2.5f));
		System.out.println("SUM:"+obj.doSum(5000,2,2,23,33,23,32));
		System.out.println("AVG:"+obj.doAvg(5000,2,2,23,23,23,34));
		System.out.println("BINARY:"+obj.convert2Binary(12));
		
		System.out.println("BASIC");
		Basic obj2=Calculator.getBasic();
//		System.out.println("SI:"+obj2.calcSimple(5000,2,2.5f));
//		System.out.println("CI:"+obj2.calcComp(5000,2,2.5f)); // wont work
		System.out.println("SUM:"+obj2.doSum(5000,2,2,23,33,23,32));
		System.out.println("AVG:"+obj2.doAvg(6,8,1,2,20));
		System.out.println("BINARY:"+obj2.convert2Binary(12));		
		System.out.println("FACTORIAL");
//		Basic obj3=Calculator.getIntrest(); //connot do this
//		System.out.println("BINARY:"+obj3.findFact(23));
	}

}

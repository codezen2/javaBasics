package com.sapient.wrapper;

public class Boxing {

	public static void main(String[] args) {
		
		Integer a=10;
		Integer b=20;
		Integer c=a+b;
		System.out.println("boxed c automatc "+c.toString());

		//below and with 1.4
		//Integer a=10; would result in error
		//Boxing
		Integer a1=new Integer(10);
		Integer b1=Integer.valueOf(20); 
		//unbox
		int res=a1.intValue()+b1.intValue();
		Integer c1=Integer.valueOf(res);		
		System.out.println("boxed c manully "+c1.toString());
		
	}

}

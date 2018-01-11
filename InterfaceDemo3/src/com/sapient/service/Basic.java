package com.sapient.service;

public interface Basic {
	
	 String convert2Binary(int num); // abstract
	public default int doSum(int... a) {// default
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];

		return sum;
	}

	public default double doAvg(int... a) {
		return (doSum(a) / a.length);
	}
	// public int doSum(int a, int b){ // abstart thats why error
	// to do it we use default
	// }
	// int age=10; //this is public static final so need a value

	// //from java8 we can have static method here called using
	// interfacename.display()
	// public static void display()
	// {
	//
	// }
}

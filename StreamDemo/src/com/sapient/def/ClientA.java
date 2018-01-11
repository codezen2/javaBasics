package com.sapient.def;

import java.util.Arrays;
import java.util.List;

public class ClientA {

	public static void main(String[] args) {
		IDao imp1=new DaoImpl1();
		imp1.m1();
		imp1.m2();
		//after adding default method
		List<String> lst=Arrays.asList("ram","shyam","kumar");
		imp1.m3(lst);
		IDao imp2=new DaoImpl2();
		imp2.m1();
		imp2.m2();
		//default method overridden
		imp2.m3(lst);
		IDao imp3=new DaoImpl3();
		imp3.m1();
		imp3.m2();
		imp3.m3(lst);
		
	}

}

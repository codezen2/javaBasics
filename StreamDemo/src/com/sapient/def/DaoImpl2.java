package com.sapient.def;

import java.util.List;

public class DaoImpl2 implements IDao {

	@Override
	public void m3(List<String> lst) {
		lst.forEach(System.out::println);
	}

	@Override
	public void m1(){
		System.out.println("Impl2 --- m1");
	}

	@Override
	public void m2() {
		System.out.println("Impl2 --- m2");

	}

}

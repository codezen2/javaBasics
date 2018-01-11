package com.sapient.def;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DaoImpl3 implements IDao {

	@Override
	public void m1() {
		System.out.println("Impl3---m1");
		
	}

	@Override
	public void m2() {
		System.out.println("Impl3---m2");		
	}

	@Override
	public void m3(List<String> lst) {
		Collections.sort(lst);
		IDao.super.m3(lst);
	}

}

package com.pack2;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		
		Double sal1=e1.getSal();
		Double sal2=e2.getSal();
		return sal1.compareTo(sal2);	}
	

}

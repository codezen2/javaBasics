package com.pack2;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		//used by comaprator.sort method 
		//used for suffling
		String str=e1.getEname();
		String str1=e2.getEname();
		return str.compareTo(str1);
	}
	
	

}

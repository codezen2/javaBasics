package com.sapient.service;

import java.util.ArrayList;
import java.util.List;

public class EmpMemDao implements Idao {

	
	//client in different package so
	EmpMemDao()
	{	// Instance cannot be created in another package
		
	}
	
	@Override
	public List<String> viewEmployee() {
		System.out.println("EmpMemDao Instance");
		List<String> lst= new ArrayList<String>();
		lst.add("Rama");
		lst.add("Kuamr");
		lst.add("harman");
		lst.add("tarun");	
		return lst;
	}
		

}

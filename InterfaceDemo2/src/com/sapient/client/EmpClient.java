package com.sapient.client;

import com.sapient.service.EmpUtill;
import com.sapient.service.Idao;

public class EmpClient {

	public static void main(String[] args) {
		
		Idao dao=EmpUtill.getDaoInstance();
		System.out.println(dao.viewEmployee());
	}

}

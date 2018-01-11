package com.sapient.service;

import java.util.ResourceBundle;

public class EmpUtill {
	private static ResourceBundle rb;
	private static Idao dao;
	static {
		rb = ResourceBundle.getBundle("sap");
		try {
			Class cls = Class.forName(rb.getString("cname")); // loads the class
	// create instance for class name in the property file dynamic
			dao = (Idao)cls.newInstance();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static Idao getDaoInstance() {
		return dao;
	}
}

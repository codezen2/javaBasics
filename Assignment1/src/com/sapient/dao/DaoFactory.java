package com.sapient.dao;

import java.util.ResourceBundle;

public class DaoFactory{
	private static ResourceBundle rb;
	private static IDao dao;
	static {
		rb = ResourceBundle.getBundle("sap");
		try {
			Class cls = Class.forName(rb.getString("cname")); // loads the class
	// create instance for class name in the property file dynamic
			dao = (IDao)cls.newInstance();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static IDao getDaoInstance() {
		return dao;
	}
}

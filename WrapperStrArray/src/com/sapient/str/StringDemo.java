package com.sapient.str;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		String str = "rAmaNa";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		System.out.println(str.indexOf("m"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.matches("[a-zA-Z]+"));
		System.out.println(str.substring(1, 4));
		System.out.println(str.replace("m", "j"));
		// /------------------------------------
		String str2 = "Sapient Technologies Private Limited";
		String[] arr = str2.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(str2.replace(" ", "-"));
		// ========================
		String name1="ram";
		String name2="RAM";
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		//++++++++++++++++++++++++++++++++++++++++
		System.out.println(str);//original string does not change
		System.out.println(str2);



	}

}

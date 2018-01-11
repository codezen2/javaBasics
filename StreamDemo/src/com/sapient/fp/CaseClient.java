package com.sapient.fp;

public class CaseClient {

	/*
	 * Demo- Functional programming
	 */
	public static void main(String[] args) {
		Icase lower = s -> s.toLowerCase();
		Icase upper = (String s) -> {
			return s.toUpperCase();
		};
		display(upper, "AbCdefGH");
		display(lower, "AbCdefGH");
		//we can pass the code itself
		//an instance is created and then passes and insatnce is stored in heap when runtime anymously 
		//code will be in method area
		// 
		display( s -> s.toLowerCase(), "AbCdefGH");
		display( (String s) -> {
			return s.toUpperCase();
		},"jill");
	}

//	argumenent is functional interface type them we can pass code to a method
	public static void display(Icase obj, String str) {
		String res = obj.changeCase(str);
		System.out.println(res);
	}

}

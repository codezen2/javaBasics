package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("ram", "shyam", "sureshg", "sam", "ranjan", "sanjeev", "rakesh");
		Optional opt1 = lst1.stream().filter(s -> s.startsWith("a")).findAny();
		System.out.println(opt1);// output as Optional.empty if we put a to find
		if (opt1.isPresent()) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element not Found");
		}
		Optional opt2= lst1.stream().filter(s -> s.startsWith("s")).findFirst();
		System.out.println(opt2);// output as Optional.empty if we put a to find
		if (opt2.isPresent()) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element not Found");
		}
	}

}

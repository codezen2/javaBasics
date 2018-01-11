package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("anand");
		lst.add("sam");
		lst.add("ravi");
		lst.add("suresh");
		lst.add("zora");

		System.out.println("Ascending order");
		Stream<String> s = lst.stream().sorted();
		s.forEach(System.out::println);
		// OR
		//lst.stream().sorted().forEach(System.out::println);
		System.out.println("Descending order");
		//sorted(comaprator)
		lst.stream().sorted((i,j)->j.compareTo(i)).forEach(System.out::println);


	}

}

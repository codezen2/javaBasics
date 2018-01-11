package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("ram", "shyam", "tom", "sam");
		List<String> lst2 = Arrays.asList("peter", "john", "mary");

		Stream<List<String>> s = Stream.of(lst1, lst2);
		//s.forEach(System.out::println);
		// outputs as:
		// [ram, shyam, tom, sam]
		// [peter, john, mary] 
		// combine 2 into a stream
		//s.flatMap(lst->lst.stream()).forEach(System.out::println);
		//or having only string stream
		Stream<String> s2=s.flatMap(lst->lst.stream());
		s2.forEach(System.out::println);
	}

}

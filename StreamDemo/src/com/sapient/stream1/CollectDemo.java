package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		Stream<Integer> s = lst.stream().filter(i -> i % 2 == 0);
		List<Integer> lst2=s.collect(Collectors.toList());
		System.out.println("Displaying filtered Elements");
		lst2.forEach(System.out::println);
		System.out.println("Displaying array having diff filtered elements");
		Stream<Integer> s2=lst.stream().filter(i->i%3==0);
		Object[] arr=s2.toArray();
		System.out.println(Arrays.toString(arr));
	}

}

package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		Stream s=lst.stream().map(i->i*i);
		s.forEach(System.out::println);
		System.out.println("In single line");
		lst.stream().map(i->i*i).forEach(System.out::println);
	}

}

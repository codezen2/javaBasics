package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		System.out.println("Using Method Refence -> ::  ");
		lst.stream().forEach(System.out::println);
		System.out.println("Using Lambda Exp");
		lst.stream().forEach(s->System.out.println(s));
		
		
	}

}

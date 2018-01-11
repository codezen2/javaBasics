package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggDemo {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(10);
		lst.add(97);
		lst.add(23);
		lst.add(4);	
		lst.add(79);
		lst.add(56);
		long size1=lst.stream().count(); 
		long size=lst.stream().filter(i->i>=50).count(); //count method returns long
		System.out.println(size1+" " +size);
		OptionalInt opt1=lst.stream().mapToInt(i->i).min();
		System.out.println("Minimum Value:"+opt1.getAsInt());
		OptionalInt opt2=lst.stream().mapToInt(i->i).max();
		System.out.println("Maximum Value:"+opt2.getAsInt());
		int sum=lst.stream().mapToInt(i->i).sum();
		System.out.println("Sum:"+sum);
		OptionalDouble opt3=lst.stream().mapToInt(i->i).average();
		System.out.println("Avrage Value:"+opt3.getAsDouble());
	}

}

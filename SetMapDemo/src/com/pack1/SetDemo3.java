package com.pack1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1005, "ram", 11200);
		Emp e2 = new Emp(1003, "tom", 10000);
		Emp e3 = new Emp(1002, "mohan", 30000);
		Emp e4 = new Emp(1004, "amit", 13000);
		Emp e5 = new Emp(1001, "kumar", 40300);
		//e6 is ignored based on the content.
		Emp e6 = new Emp(1005, "raj", 50300); 
		//e7 is ignored based on refrence.
		Emp e7 = e2;
		
		Set<Emp> set = new TreeSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);

		for (Emp str : set) {
			System.out.println(str);
		}

	}

}

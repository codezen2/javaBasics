package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class CollectDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1007, "ram", 10000));
		lst.add(new Emp(1009, "tom", 53000));
		lst.add(new Emp(2002, "anand", 13000));
		lst.add(new Emp(2005, "vikas", 28000));
		lst.add(new Emp(1003, "rajesh", 23000));
		System.out.println("Show list having emp sal>=25k");
		//lst.stream().filter(e -> e.getSal()>=25000).forEach(EmpUtil::display);
		List<Emp> lst2=lst.stream().filter(e -> e.getSal()>=25000).collect(Collectors.toList());
		lst2.forEach(EmpUtil::display);
	}

}

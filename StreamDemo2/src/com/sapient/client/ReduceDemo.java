package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Emp;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1007, "ram", 10000));
		lst.add(new Emp(1009, "tom", 53000));
		lst.add(new Emp(2002, "anand", 13000));
		lst.add(new Emp(2005, "vikas", 28000));
		lst.add(new Emp(1003, "rajesh", 23000));
		double sum = lst.stream().map(e -> e.getSal()).reduce(0.0, (x, y) -> x + y);
		System.out.println("Sum of Salary of all employees: " + sum);
		double sum2 = lst.stream().mapToDouble(e -> e.getSal()).sum();
		System.out.println("Sum of Salary of all employees: " + sum2);
	}

}

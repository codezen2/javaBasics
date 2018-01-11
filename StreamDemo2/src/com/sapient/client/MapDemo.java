package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class MapDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1007, "ram", 10000));
		lst.add(new Emp(1009, "tom", 53000));
		lst.add(new Emp(2002, "anand", 13000));
		lst.add(new Emp(2005, "vikas", 28000));
		lst.add(new Emp(1003, "rajesh", 23000));
		// update salary by 10%
		/*
		 * lst.stream().map(e -> { e.setSal(e.getSal() + e.getSal() * 0.1);
		 * return e; }).forEach(EmpUtil::display);
		 */
		Stream<Emp> s = lst.stream().map(e -> {
			e.setSal(e.getSal() + e.getSal() * 0.1);
			return e;
		});
		System.out.println("___________________________");
		s.forEach(EmpUtil::display);
	}

}

package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class SortDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1007, "ram", 10000));
		lst.add(new Emp(1009, "tom", 53000));
		lst.add(new Emp(2002, "anand", 13000));
		lst.add(new Emp(2005, "vikas", 28000));
		lst.add(new Emp(1003, "rajesh", 23000));
		lst.add(null);
		System.out.println("Sort by Emp ID");
		// sorting does not work if null is present
		lst.stream().filter(e -> e != null).sorted().forEach(EmpUtil::display);
		System.out.println();
		// sort by empl name;
		System.out.println("Sort by Emp Name");
		lst.stream().filter(e -> e != null).sorted((e1, e2) -> e1.getEname()
				.compareTo(e2.getEname()))
				.forEach(EmpUtil::display);
		
		System.out.println("\nSort by Desc Emp Salary");
		lst.stream().filter(e -> e != null).sorted((e1, e2) -> e2.getSal()
				.compareTo(e1.getSal()))
				.forEach(EmpUtil::display);
		System.out.println("\nSort by Asc Emp Salary");
		lst.stream().filter(e -> e != null).sorted((e1, e2) -> e1.getSal()
				.compareTo(e2.getSal()))
				.forEach(EmpUtil::display);
		
		
	}

}

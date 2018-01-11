package com.pack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		Emp e1=new Emp(1005,"ram",11200);
		Emp e2=new Emp(1003,"tom",10000);
		Emp e3=new Emp(1002,"mohan",30000);
		Emp e4=new Emp(1004,"amit",13000);
		Emp e5=new Emp(1001,"kumar",40300);
		
		List<Emp> lst=new ArrayList<Emp>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		System.out.println("Sort on employee ID----------------");
		Collections.sort(lst); // gives us an error if comparable menthod not implemented
		//Arrays.sort(lst, );
		for(Emp emp:lst)
		{
			System.out.println(emp);
		}
		System.out.println("Sort on employee Name----------------");
		Collections.sort(lst,new NameComparator());
		for(Emp emp:lst)
		{
			System.out.println(emp);
		}
		System.out.println("Sort on Salary-----------");
		Collections.sort(lst,new SalComparator());
		for(Emp emp:lst)
		{
			System.out.println(emp);
		}
		
		System.out.println("Sort on employee ID in reverse order----------------");
		Collections.sort(lst,Collections.reverseOrder());
		for(Emp emp:lst)
		{
			System.out.println(emp);
		}
		
	}

}

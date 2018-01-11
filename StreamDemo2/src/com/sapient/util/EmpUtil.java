package com.sapient.util;

import com.sapient.vo.Emp;

public class EmpUtil {
	public static void display(Emp emp) {
			System.out.println(emp.getEid()+" "+emp.getEname()+" "+ emp.getSal()+" ");
	}

}

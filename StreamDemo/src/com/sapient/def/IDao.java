package com.sapient.def;

import java.util.List;

public interface IDao {
	void m1();
	void m2();
	//default implementation added later so we need not to change each file of implmentation
	default void m3(List<String> lst)
	{
		System.out.println(lst);
	}

}

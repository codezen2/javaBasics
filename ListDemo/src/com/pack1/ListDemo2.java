package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("amar");
		lst.add("birbal");
		lst.add("sam");
		Collections.sort(lst); //sort
		for(String str:lst)
		{
			System.out.println(str);
		//	lst.add("dd");//1.ConcurrentModificationException
		}
		System.out.println("Descending Order");
		Collections.sort(lst,Collections.reverseOrder());
		System.out.println(lst);
	}

}

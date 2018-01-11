package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo3 {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("amar");
		lst.add("birbal");
		lst.add("sam");
		System.out.println("iterating in forward way");
		Iterator<String> it=lst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

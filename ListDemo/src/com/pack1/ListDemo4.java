package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo4 {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("amar");
		lst.add("birbal");
		lst.add("sam");
		System.out.println("iterating in forward way");

		ListIterator<String> it=lst.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("uisng list iterator in reverse way");
		
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}
}

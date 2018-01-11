package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo5 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		// List<String> lst = new LinkedList<String>();
		// List<String> lst = new Vector<String>();

		lst.add("ram");
		lst.add("peter");
		lst.add("amar");
		lst.add("birbal");
		lst.add("sam");
		System.out.println(lst);
		lst.add(2, "vikas");// add at index
		System.out.println(lst);
		System.out.println(lst.remove(3));// remove from index
		System.out.println(lst);
		lst.add("peter");
		lst.add("amar");
		lst.add("peter");
		System.out.println(lst);
		System.out.println(lst.remove("peter"));// ist peter is removed
		System.out.println(lst);
		System.out.println("Size: " + lst.size());// see list size
		System.out.println("get at index 2:" + lst.get(2));// get 2nd element
															// value

		// ===========================copying
		List<String> lst2 = new ArrayList<String>();
		lst2.add("rahul");
		lst2.add("manoj");
		lst2.addAll(lst); // copy all lst elements to lst2
		System.out.println(lst2);
		// =======================================

	}

}

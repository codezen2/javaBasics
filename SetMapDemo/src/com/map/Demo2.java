package com.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.pack1.Emp;

public class Demo2 {

	public static void main(String[] args) {

		// can have null key and methods are synchorised
		Map<Integer, String> map = new HashMap<Integer, String>();

		// Ascending order of(sorted) based on the keys
		// Map<Integer, String> map = new TreeMap<Integer, String>();
		// Null key not allowed  and methods are synchronised
		// Map<Integer, String> map = new Hashtable<Integer, String>();
		// same Sequence in which entered
		// Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(3005, "ram");
		map.put(2003, "tom");
		map.put(1005, "ram");
		map.put(1003, "tom");
		map.put(1002, "peter");
		map.put(1001, "raj");
		map.put(1002, "joy");// replaces the duplicates
		map.put(1006, "barun");
		map.put(1007, "kumar");
		// map.put(null, "kumar");
		map.put(8003, "tom");

		System.out.println("Itrating using key set method");
		System.out.println(map.keySet()); // to see keys
		Set<Integer> set = map.keySet();
		for (Integer key : set) {
			System.out.println(map.get(key));
		}
		System.out.println("Itrating using values method");
		Collection<String> col = map.values();
		System.out.println(col);
		for (String str : col)
			System.out.println(str);

		System.out.println("Iterate using Entry set method");
		Set<Entry<Integer, String>> entries = map.entrySet();
		System.out.println(entries);
		for (Entry e : entries)
			System.out.println(e.getKey() + ":" + e.getValue());

	}

}

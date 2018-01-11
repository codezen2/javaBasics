package com.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		//insertion order it will save
		//Set<String> set=new LinkedHashSet<String>();
		
		//ascending uses comapreable sorted order you save
		//Set<String> set=new TreeSet<String>();
		
		//randomOrder acc to buckets which are allinged as per hashcode
		//Set<String> set=new HashSet<String>(32,0.5f);
		//default is 16 and 0.75f
		//initialcapacity is 32 and 0.5f is load factor can be changed as per requirements
		Set<String> set=new HashSet<String>();
		set.add("ram");
		set.add("tom");
		set.add("kumar");
		set.add("raj");
		set.add("surya");
		set.add("boon");
		System.out.println(set.add("tom")); 
		//false as it ignores as already present
		//duplicates are ignored
		for(String str:set)
		{
			System.out.println(str);
		}
	}

}

package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList<>();
		Optional<Integer> opt=lst.stream().findAny();
		// optional.empty would be printed
		System.out.println(opt);
		
		String str=null;	//str="sdsd";
		Optional<String> opt1=Optional.ofNullable(str);	
		System.out.println(opt1);
		if(opt1.isPresent())
		{
			System.out.println(opt1.get());
		}else
			System.out.println("Empty");
	}

}

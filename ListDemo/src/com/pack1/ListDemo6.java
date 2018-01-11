package com.pack1;

import java.util.Arrays;
import java.util.List;

public class ListDemo6 {

	public static void main(String[] args) {
		Integer[] arr={5,34,3,3423,45,234,323,23};
		//convert this array into list
		List<Integer> lst=(List<Integer>)Arrays.asList(arr);
		System.out.println(lst);
		
	}

}

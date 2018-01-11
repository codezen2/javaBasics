package com.sapient.arr;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		String[] arr = { "ram", "shyam", "peter", "birbal", "kumar", "amit" };
		String[] arr2=new String[arr.length];
//		System.arraycopy(arr, 0, arr2, 0, arr.length);
//		System.out.println(Arrays.toString(arr2));
		System.arraycopy(arr, 2, arr2, 2, 3);
		System.out.println(Arrays.toString(arr2));
	}

}

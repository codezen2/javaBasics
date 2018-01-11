package com.sapient.arr;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		String[] arr=new String[4];
		arr[0]="ram";
		arr[1]="shyam";
		arr[2]="vikas";
		arr[3]="peter";
		System.out.println(arr[3]);// 0-3 are the 4 indexes
		System.out.println("Ascending Order");
		Arrays.sort(arr); //ascending order sort
		for(String str:arr)
		{
			System.out.println(str);
		}
		System.out.println("Descending Order");

		Arrays.sort(arr,Collections.reverseOrder());//descending orders
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}
